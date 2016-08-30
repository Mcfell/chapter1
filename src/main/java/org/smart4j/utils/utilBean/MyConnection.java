/*
package org.smart4j.utils.utilBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.utils.DbUtil;

import java.sql.*;

*/
/**
 * Created by stando on 2016/8/29.
 *//*

public class MyConnection {
    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement stmt = null;
    private static final Logger LOGGER = LoggerFactory.getLogger(MyConnection.class);

    public MyConnection() {
        this.conn = getConn();
    }
    public Connection getConn(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DbUtil.URL,DbUtil.USERNAME,DbUtil.PASSWORD);
        } catch (SQLException e) {
            LOGGER.error("get connection failure");
        }
        return connection;
    }
    public void close(){
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            LOGGER.error("close connection failure", e);
        }
    }

    public boolean selectQuery (String sql,String... query) {
        try {
            stmt = conn.prepareStatement(sql);
            for (int i = 0; i < query.length; i++) {
                stmt.setString(i,query[i]);
            }
            rs =  stmt.executeQuery();
        } catch (SQLException e) {
            LOGGER.error("creat statement failure",e);
            return false;
        }
        if (rs != null) {
            return true;
        }
        return false;
    }



    public boolean updateQuery(String sql, String... update) {
        int updateNum = 0;
        try{
            this.stmt = conn.prepareStatement(sql);
            for (int i = 0; i < update.length; i++) {
                stmt.setString(i,update[i]);
            }
            updateNum = stmt.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("creat statement failure",e);
            return false;
        }
        if (updateNum > 0) {
            return true;
        }
        return false;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
}
*/
