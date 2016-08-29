package org.smart4j.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by stando on 2016/8/29.
 */
public class DbUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(DbUtil.class);
    private static final String URL;
    private static final String DRIVER;
    private static final String USERNAME:
    private static final String PASSWORD;
    private static class db{
        private static final DbUtil dbUtil = new DbUtil();
    }
    private DbUtil(){
    }
    public static final DbUtil getInstance() {
        return db.dbUtil;
    }

    static {
        Properties properties = PropUtils.loadProps("config.properties");
        URL = PropUtils.getString(properties,"jdbc.url");
        DRIVER = PropUtils.getString(properties,"jdbc.driver");
        USERNAME = PropUtils.getString(properties, "jdbc.username");
        PASSWORD = PropUtils.getString(properties, "jdbc.password");

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc driver", e);
        }
    }

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            LOGGER.error("get connection failure", e);
        }
        return connection;
    }
    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                LOGGER.error("close connection failure", e);
            }
        }
    }
}
