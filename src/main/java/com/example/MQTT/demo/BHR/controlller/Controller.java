package com.example.MQTT.demo.BHR.controlller;

import com.example.MQTT.demo.BHR.data.Data;
import com.example.MQTT.demo.BHR.handler.DataHandler;
import com.example.MQTT.demo.BHR.user.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import jdk.internal.dynalink.MonomorphicCallSite;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.*;
//import reactor.core.pubulisher.Mono;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 10:36 2019/3/14
 *@Modified By:
 */
@RestController
@RequestMapping(value = "/users")
public class Controller {
    //    @Autowired
//    private DataHandler dataHandler;
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user) {
        //处理“/user/"的POST请求，创建user
        users.put(user.getId(), user);
        return "success!";
    }

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value = "/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String putUser(@PathVariable Long id, @ModelAttribute User user) {
        //处理"/user/{id}"中的PUT请求，用来更新USER信息
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        //处理"/user/{id}"中的Delete请求，用来删除USER
        users.remove(id);
        return "seccess!";
    }


    @RequestMapping(value = "/hello")
    public String index() throws Exception{
        //加入属性通过模板读取
//        map.addAttribute("host", "http://test.mqtt.com");
//        return "Hello World!";
        throw new Exception("发生错误");
    }

//    @GetMapping(value = "/{ID}")
//    public Mono<Data>

}
