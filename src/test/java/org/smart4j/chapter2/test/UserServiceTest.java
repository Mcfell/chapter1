package org.smart4j.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.model.User;
import org.smart4j.chapter2.service.CustomerService;
import org.smart4j.utils.PropUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by stando on 2016/8/29.
 */
public class UserServiceTest {
    private final CustomerService customerService;
    public UserServiceTest(){
        customerService = new CustomerService();
    }
    @Before
    public void init(){
        //TODO 初始化数据库
        //DbUtil.getInstance();
    }

    @Test
    public void propertyTest() {
        Properties properties = PropUtils.loadProps("config.properties");
        String url = PropUtils.getString(properties,"jdbc.url");
        Assert.assertNotNull(url);
        System.out.println("jdbc.url: "+url);
    }
    @Test
    public void getCustomerListTest() throws Exception{
        List<User> userList = customerService.getCustomerList("");
        Assert.assertEquals(2, userList.size());
    }
    @Test
    public void getCustomerTest() throws Exception{
        int id = 1;
        User user = customerService.getCustomer(id);
        Assert.assertNotNull(user);
    }
    @Test
    public void deleteCustmoerTest() throws Exception{
        int id = 1;
        Boolean result = customerService.removeCustomer(id);
        Assert.assertTrue(result);
    }
    @Test
    public void creatCustomerTest() throws Exception{
        Map<String ,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("nickname","yc");
        fieldMap.put("password","test");
        fieldMap.put("phone","15201316033");
        fieldMap.put("rank",100);
        fieldMap.put("winNum",0);
        fieldMap.put("loseNum",0);
        fieldMap.put("level",0);
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }
    @Test
    public void updateCustomerTest() throws Exception{
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("nickname","dc");
        fieldMap.put("level",1);

        int id = 1;
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }
}
