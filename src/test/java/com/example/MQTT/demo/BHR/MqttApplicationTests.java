package com.example.MQTT.demo.BHR;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;

//静态导入

@RunWith(SpringRunner.class)
//@SpringApplicationConfic(classes=MockServletContext.class)
@SpringBootTest(classes = MockServletContext.class)

public class MqttApplicationTests {
//	private MockMvc mvc;
//	@Before
//	public void setUp() throws Exception {
//		mvc = MockMvcBuilders.standaloneSetup(new Controller()).build();
//
//	}
//
//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/hello")
//				.accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("Hello World!")));
//	}
//
//
//	@Autowired
//	private UserService userSerivce;
//
//	@Before
//	public void setUp() {
//		// 准备，清空user表
//		userSerivce.deleteAllUsers();
//	}
//
//	@Test
//	public void test() throws Exception {
//		// 插入5个用户
//		userSerivce.create("a", 1);
//		userSerivce.create("b", 2);
//		userSerivce.create("c", 3);
//		userSerivce.create("d", 4);
//		userSerivce.create("e", 5);
//
//		// 查数据库，应该有5个用户
//		Assert.assertEquals(5, userSerivce.getAllUsers().intValue());
//
//		// 删除两个用户
//		userSerivce.deleteByName("a");
//		userSerivce.deleteByName("e");
//
//		// 查数据库，应该有5个用户
//		Assert.assertEquals(3, userSerivce.getAllUsers().intValue());
//
//	}


}
