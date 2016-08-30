package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.User;
import org.smart4j.utils.DbHelper;
import java.util.List;
import java.util.Map;

/**
 * Created by stando on 2016/8/29.
 */
public class CustomerService {
    /*获取客户列表*/
    public List<User> getCustomerList(String keyword){
        return DbHelper.queryEntityList(User.class,"select * form user");
    }
    public User getCustomer(int id){
        //TODO

        return DbHelper.queryEntity(User.class,"select * form user where id = ?",id);
    }
    public boolean createCustomer(Map<String,Object> fieldMap){
        //TODO
        if (DbHelper.insertEntity(User.class,fieldMap) > 0) {
            return true;
        }
        return false;
    }
    public boolean updateCustomer(int id, Map<String ,Object> fieldMap){
        //TODO
        if (DbHelper.updateEntity(User.class,id,fieldMap) > 0) {
            return true;
        }
        return false;
    }
    public boolean removeCustomer(int id){
        // TODO
        if (DbHelper.deleteEntity(User.class,id) > 0) {
            return true;
        }
        return false;
    }
}
