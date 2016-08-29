package org.smart4j.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.utils.utilBean.MyConnection;

import java.sql.*;
import java.util.Properties;

/**
 * Created by stando on 2016/8/29.
 */
public class DbUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(DbUtil.class);
    public static final String URL;
    private static final String DRIVER;
    public static final String USERNAME;
    public static final String PASSWORD;
    /*private static class db{
        private static final DbUtil dbUtil = new DbUtil();
    }
    private DbUtil(){
    }
    public static final DbUtil getInstance() {
        return db.dbUtil;
    }*/

    static {
        Properties properties = PropUtils.loadProps("config.properties");
        URL = PropUtils.getString(properties,"jdbc.url");
        DRIVER = PropUtils.getString(properties,"jdbc.driver");
        USERNAME = PropUtils.getString(properties, "jdbc.username");
        PASSWORD = PropUtils.getString(properties, "jdbc.password");

        LOGGER.error(DRIVER);
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc driver", e);
        }
    }

    public static MyConnection getConnection() {
        MyConnection conn = new MyConnection();
        return conn;
    }
    public static void closeConnection(MyConnection conn) {
        if (conn != null) {
            conn.close();
        }
    }
}
