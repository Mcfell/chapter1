package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.Customer;
import org.smart4j.utils.CastUtil;
import org.smart4j.utils.DbUtil;
import org.smart4j.utils.utilBean.MyConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by stando on 2016/8/29.
 */
public class CustomerService {
    /*获取客户列表*/
    public List<Customer> getCustomerList(String keyword){
        MyConnection conn = DbUtil.getConnection();
        List<Customer> customerList = new ArrayList<Customer>();
        String sql = "select * from user";
        if(conn.selectQuery(sql)){
            ResultSet rs = conn.getRs();
            try {
                while (rs.next()) {
                    Customer customer = new Customer();
                    customer.setId(rs.getInt("id"));
                    customer.setNickname(rs.getString("nickname"));
                    customer.setPassword(rs.getString("password"));
                    customer.setLevel(rs.getInt("level"));
                    customer.setRank(rs.getInt("rank"));
                    customer.setLoseNum(rs.getInt("loseNum"));
                    customer.setWinNum(rs.getInt("winNum"));
                    customerList.add(customer);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return customerList;
    }
    public Customer getCustomer(int id){
        //TODO
        MyConnection conn = DbUtil.getConnection();
        Customer customer = null;
        String sql = "select * from user where id = ?";
        if(conn.selectQuery(sql, CastUtil.castString(id))){
            ResultSet rs = conn.getRs();
            try {
                while (rs.next()) {
                    customer = new Customer();
                    customer.setId(rs.getInt("id"));
                    customer.setNickname(rs.getString("nickname"));
                    customer.setPassword(rs.getString("password"));
                    customer.setLevel(rs.getInt("level"));
                    customer.setRank(rs.getInt("rank"));
                    customer.setLoseNum(rs.getInt("loseNum"));
                    customer.setWinNum(rs.getInt("winNum"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return customer;
    }
    public boolean createCustomer(Map<String,Object> fieldMap){
        //TODO
        return false;
    }
    public boolean updateCustomer(int id, Map<String ,Object> fieldMap){
        //TODO
        return false;
    }
    public boolean removeCustomer(int id){
        // TODO
        return false;
    }
}
