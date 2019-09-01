package com.example.MQTT.demo.BHR.service;

import java.sql.Timestamp;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 10:20 2019/3/19
 *@Modified By:
 */
public interface NodeImp {
    void create(Integer nodeId, Timestamp timestamp, Double value);

    void deleteByNodeId(Integer nodeId);

    Integer getAllUsers();

    void deleteAllUsers();
}
