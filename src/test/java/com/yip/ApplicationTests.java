package com.yip;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Title: ApplicationTests
 * @author: Vincent.Yip
 * @Description: TODO
 * @date 2019/5/5 16:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
@ActiveProfiles("test")
public class ApplicationTests {
}
