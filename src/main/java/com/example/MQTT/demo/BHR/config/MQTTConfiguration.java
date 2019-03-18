package com.example.MQTT.demo.BHR.config;

import org.springframework.beans.factory.annotation.Autowired;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 14:44 2019/3/18
 *@Modified By:
 */
public class MQTTConfiguration {
    @Autowired
    private MqttProperties mqttProperties;
    private String host;

    private String clientid;

    private String topic;

    private String username;

    private String password;

    private int timeout;

    private int keepalive;

}
