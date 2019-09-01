//package com.example.MQTT.demo.BHR;
//
////import com.example.MQTT.demo.BHR.service.Node;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockServletContext;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
////静态导入
//
//@RunWith(SpringJUnit4ClassRunner.class)
//
////@SpringApplicationConfic(classes=MockServletContext.class)
////@SpringBootTest(classes = MockServletContext.class)
//@SpringBootTest(classes = MqttApplication.class)
////@SpringBootConfiguration(class=MqttApplication)
//public class MqttApplicationTests {
//
////
//////	@Test
//////	public void getHello() throws Exception {
//////		mvc.perform(MockMvcRequestBuilders.get("/hello")
//////				.accept(MediaType.APPLICATION_JSON))
//////				.andExpect(status().isOk())
//////				.andExpect(content().string(equalTo("Hello World!")));
//////	}
////////
//////
////	@Autowired
////	private Node node;
////
////	@Before
////	public void setUp() {
////		// 准备，清空user表
////		node.deleteAllUsers();
////	}
////
////	@Test
////	public void test() throws Exception {
////		// 插入5个用户
//////		node.create("1", null,1);
//////		node.create("1", null,2);
//////		node.create("2", null,3);
//////		node.create("1", null,4);
//////		node.create("3", null,5);
////
////        node.create(1, null, 312.132);
////        node.create(2, null, 112.332);
////        node.create(1, null, 132.332);
////        node.create(3, null, 212.3532);
////        node.create(1, null, 112.232);
////        node.create(3, null, 312.432);
////		// 查数据库，应该有5个用户
////		Assert.assertEquals(5, node.getAllUsers().intValue());
////
////		// 删除两个用户
////		node.deleteByNodeId(1);
////		node.deleteByNodeId(2);
////
////		// 查数据库，应该有5个用户
////		Assert.assertEquals(3, node.getAllUsers().intValue());
////
////	}
//
//
//}

//import org.apache.catalina.core.ApplicationContext;
//import org.apache.tomcat.jdbc.pool.DataSource;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MonsterlanApplicationTests {
//    @Autowired
//    DataSourceProperties dataSourceProperties;
//
//    @Autowired
//    ApplicationContext applicationContext;
//
//    @Test
//    public void contextLoads() {
//        // 获取配置的数据源
//        DataSource dataSource = applicationContext.getClass(DataSource.class);
//        // 查看配置数据源信息
//        System.out.println(dataSource);
//        System.out.println(dataSource.getClass().getName());
//        System.out.println(dataSourceProperties);
//        //执行SQL,输出查到的数据
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        List<?> resultList = jdbcTemplate.queryForList("select * from test");
//        System.out.println("===>>>>>>>>>>>" + JSON.toJSONString(resultList));
//    }
//}