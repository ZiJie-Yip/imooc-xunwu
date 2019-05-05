package com.yip.entity;

import com.yip.ApplicationTests;
import com.yip.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Title: UserRepositoryTest
 * @author: Vincent.Yip
 * @Description: TODO
 * @date 2019/5/5 16:17
 */
public class UserRepositoryTest extends ApplicationTests{

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne(){
        User user = userRepository.findOne(1L);
        Assert.assertEquals("wali", user.getName());
    }

}
