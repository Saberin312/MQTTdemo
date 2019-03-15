package com.example.MQTT.demo.BHR.DAO;

import com.example.MQTT.demo.BHR.data.Data;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Repository;
import sun.util.resources.ga.LocaleNames_ga;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 11:24 2019/3/14
 *@Modified By:
 */
@Repository
//DAO注解
public class DataRepository {
    private ConcurrentMap<Long, Data> repository = new ConcurrentHashMap<>();
    private static final AtomicLong idGenerator = new AtomicLong(0);

    public Long save(Data data) {
        Long ID = idGenerator.incrementAndGet();
        data.setNode_ID(ID);
        repository.put(ID, data);
        return ID;
    }

    public Collection<Data> findALL() {
        return repository.values();
    }

    public Data findDataByID(Long ID) {
        return repository.get(ID);
    }

    public Long updateData(Data data) {
        repository.put(data.getNode_ID(), data);
        return data.getNode_ID();
    }

    public Long deleteDate(Long ID) {
        repository.remove(ID);
        return ID;
    }
}
