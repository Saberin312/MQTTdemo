package com.example.MQTT.demo.BHR.nodeTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 57783 on 2018/7/4.
 */
@RestController
public class NodeInfoController {

    @Autowired
    private NodeInfoRepository userInfoRepository;

    /**
     * 查
     * @return
     */
    @GetMapping(value = "/list")
    public List<NodeInfo> getUserList(){
        return userInfoRepository.findAll();
    }

    /**
     * 增
     * @param username
     * @param password
     * @return
     */
    @PostMapping(value = "/addNode")
    public NodeInfo addNode(@RequestParam("username") String username,
                            @RequestParam("password") String password){
        NodeInfo user = new NodeInfo();
        user.setId(1);
        user.setTimestamp(null);
        user.setValue(12.1);
        return userInfoRepository.save(user);
    }

    /**
     * 改
     * @param id
     * @param username
     * @param password
     * @return
     */
    @PutMapping(value = "updNode/{id}")
    public NodeInfo updNode(@PathVariable("id") Integer id,
                            @RequestParam("username") String username,
                            @RequestParam("password") String password){
        NodeInfo user = new NodeInfo();
        user.setId(id);
//        user.setNodename(username);
//        user.setPassword(password);
        return userInfoRepository.save(user);

    }

    /**
     * 删
     * @param id
     */
    @DeleteMapping(value = "delUser/{id}")
    public void delUser(@PathVariable("id") Integer id){
        NodeInfo user = new NodeInfo();
        user.setId(id);
        userInfoRepository.delete(user);
    }

}
