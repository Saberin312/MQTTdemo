package com.example.MQTT.demo.BHR.config;
import lombok.extern.slf4j.Slf4j;
/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 19:34 2019/3/18
 *@Modified By:
 */
@Slf4j
public class PushPayLoad {
    //推送类型
    private String type;
    //推送对象
    private String mobile;
    //标题
    private String title;
    //内容
    private String content;
    //数量
    private Integer badge = 1;
    //铃声
    private String sound = "default";

    public PushPayLoad(String type, String mobile, String title, String content, Integer badge , String sound) {
        this.type = type;
        this.mobile = mobile;
        this.title = title;
        this.content = content;
        this.badge = badge;
        this.sound = sound;
    }
}
