package com.example.MQTT.demo.BHR.service;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 10:03 2019/3/15
 *@Modified By:
 */
public interface UserService {
    void create(String name, Integer age);

    void deleteByName(String name);

    Integer getAllUsers();

    void deleteAllUsers();
}
