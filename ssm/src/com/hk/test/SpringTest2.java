package com.hk.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.hk.service.UserServiceImpl;


/***
 * 这个类要进行对service的测试，要集成spring的环境
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringTest2 {
	
	@Autowired
	@Qualifier("userService")
	private UserServiceImpl userService;
	
	@Test
	public void demo1(){
		System.out.println(userService.queryUserById(1));;
	}
}
