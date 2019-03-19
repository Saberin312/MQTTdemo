package com.example.MQTT.demo.BHR.service;

import com.alibaba.druid.sql.visitor.functions.Char;
import io.swagger.models.auth.In;

import javax.xml.soap.Node;
import java.sql.Timestamp;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 14:09 2019/3/19
 *@Modified By:
 */

public class NodeTrans {
//    private String string;
//    private Integer NodeId;
//    private Timestamp timestamp;
//    private String time;
//    private Float value;
    private Integer index[]={6,11,14,17 ,20, 23, 26, 28};
//
//    public NodeTrans(String string) {
//        this.string = string;
//        this.NodeId = Integer.parseInt(string.substring(index[0] - 1, index[0]));
//        this.time = string.substring(index[0] + 1, index[6]);
//        this.value = Float.parseFloat(string.substring(index[7] + 1));
//    };

    public Integer transId(String string) {
        Integer NodeId=Integer.parseInt(string.substring(index[0]-1, index[0]));
        return NodeId;
    }
//
    public Timestamp transTime(String string) {
        char a = '-';
        char b = ' ';
        char c = ':';
        String time = string.substring(index[0] + 1, index[1])+a+
                string.substring(index[1]+1,index[2])+a+
                string.substring(index[2]+1,index[3])+b+
                string.substring(index[3]+1,index[4])+c+
                string.substring(index[4]+1,index[5])+c+
                string.substring(index[5]+1,index[6])
                ;
        Timestamp timestamp = Timestamp.valueOf(time);
        return timestamp;
    }
//
    public Double trasnValue(String string) {
        Double value = Double.parseDouble(string.substring(index[7]+1));
        return value;
    }


 //    public NodeTrans(String string) {
//        this.string = string;
//    }
    public static void main(String[] args) {
//        NodeTrans nodeTrans=new NodeTrans("node 1,19,3,19,14,2,51,2,39.10");

        String string="node 1,2019,03,19,14,02,51,2,39.10";
        int index[] = new int[8];
        index[0] = 6;
        System.out.println(string);
        for (int i=1;i<=7;i++){
            index[i]=string.indexOf(",",index[i-1]+1);
        }
        int index1 = string.indexOf(",",7);
        System.out.println(index1);
        for (int k = 0; k <= 7; k++) {
            System.out.println(index[k]);
        }
        Integer id = Integer.parseInt(string.substring(index[0]-1, index[0]));
        String time1 = string.substring(index[0]+1, index[6]);
        String time=time1.replace(",", "");
        Float value = Float.parseFloat(string.substring(index[7]+1));
        System.out.println(id);
        System.out.println(time);
        System.out.println(value);

//        String time1="19,3,19,14,2,51";
        time1.replace(",", "2");
        System.out.println(time1.replace(",", ""));

        System.out.println("NodeTrans:");
        NodeTrans nodeTrans = new NodeTrans();
        System.out.println(nodeTrans.transId(string));

        System.out.println(nodeTrans.transTime(string));
        System.out.println(nodeTrans.trasnValue(string));

    }
//
//    public String getString() {
//        return string;
//    }
//
//    public void setString(String string) {
//        this.string = string;
//    }
//
//    public Integer getNodeId() {
//        return NodeId;
//    }
//
//    public void setNodeId(Integer nodeId) {
//        NodeId = nodeId;
//    }
//
//    public Timestamp getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(Timestamp timestamp) {
//        this.timestamp = timestamp;
//    }
//
//    public String getTime() {
//        return time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }
//
//    public Float getValue() {
//        return value;
//    }
//
//    public void setValue(Float value) {
//        this.value = value;
//    }
//
//    public Integer[] getIndex() {
//        return index;
//    }
//
//    public void setIndex(Integer[] index) {
//        this.index = index;
    }

