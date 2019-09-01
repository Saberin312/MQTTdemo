package com.example.MQTT.demo.BHR.nodeTest;

import com.example.MQTT.demo.BHR.service.NodeImp;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.persistence.Entity;
import java.sql.Timestamp;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 14:06 2019/3/20
 *@Modified By:
 */
@Entity
public class NodeInfo {
    private Integer id;
    private Timestamp timestamp;
    private Double value;

    public NodeInfo() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
