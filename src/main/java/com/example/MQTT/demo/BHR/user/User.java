package com.example.MQTT.demo.BHR.user;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:29 2019/3/14
 *@Modified By:
 */
public class User {
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
