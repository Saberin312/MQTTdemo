package com.example.MQTT.demo.BHR.data;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 11:02 2019/3/14
 *@Modified By:
 */
public class Data {
    private long Node_ID;
    private long Time;
    private String Name;
//    private String Capacity;
    private long Capacity;
    private String Annotation;

    public long getNode_ID() {
        return Node_ID;
    }

    public void setNode_ID(long node_ID) {
        Node_ID = node_ID;
    }

    public long getTime() {
        return Time;
    }

    public void setTime(long time) {
        Time = time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getCapacity() {
        return Capacity;
    }

    public void setCapacity(long capacity) {
        Capacity = capacity;
    }

    public String getAnnotation() {
        return Annotation;
    }

    public void setAnnotation(String annotation) {
        Annotation = annotation;
    }
}
