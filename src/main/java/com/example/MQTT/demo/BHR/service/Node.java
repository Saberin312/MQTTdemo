package com.example.MQTT.demo.BHR.service;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Timestamp;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 10:20 2019/3/19
 *@Modified By:
 */
@Service
//@Repository

public class Node implements NodeImp {
    @Autowired
//    @Qualifier("JdbcTemplate")
        private JdbcTemplate jdbcTemplate=new JdbcTemplate();
//    private JdbcTemplate jdbcTemplate;
//    private DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();

    @Override
    public void create(Integer nodeId, Timestamp timestamp, Double value) {
        jdbcTemplate.update("insert into node(id,time,value) values(?,?,?)", nodeId, timestamp, value);
    }

    @Override
    public void deleteByNodeId(Integer nodeId) {
        jdbcTemplate.update("delete from node where id=?", nodeId);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from node", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from node");
    }

}
