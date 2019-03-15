package com.example.MQTT.demo.BHR.handler;

import com.example.MQTT.demo.BHR.DAO.DataRepository;
import com.example.MQTT.demo.BHR.data.Data;
import org.apache.ibatis.type.DateTypeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 12:43 2019/3/14
 *@Modified By:
 */
@Component
public class DataHandler {
    private final DataRepository dataRepository;

    public DataHandler() {
        dataRepository = null;
    }

    @Autowired
    public DataHandler(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

//    public Mono<Data>
}
