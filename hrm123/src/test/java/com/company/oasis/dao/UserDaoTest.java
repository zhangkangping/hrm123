package com.company.oasis.dao;

import com.company.oasis.dao.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Test
    public void userExist() {
        System.err.println(userDao.userExist("chao"));
        System.err.println(userDao.userExist("zhao"));
    }

    @Test
    public void login() {
        User user1 = new User("ccc","123");
        User result1 = userDao.login(user1);
        System.err.println(result1);
        User user2 = new User("zhao","1232");
        User result2 = userDao.login(user1);
        System.err.println(result2);
    }
}