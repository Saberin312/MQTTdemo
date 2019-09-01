package com.example.MQTT.demo.BHR.config;

//import com.example.MQTT.demo.BHR.service.Node;
//import com.example.MQTT.demo.BHR.service.NodeTrans;
//import com.example.MQTT.demo.BHR.service.NodeTrans;
//import com.example.MQTT.demo.BHR.service.Node;
//import com.example.MQTT.demo.BHR.service.NodeTrans;
import com.example.MQTT.demo.BHR.service.Node;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 20:32 2019/3/18
 *@Modified By:
 */
@Slf4j
@Configuration
@IntegrationComponentScan
public class MqttReceiveConfig {

    @Value("${spring.mqtt.username}")
    private String username;

    @Value("${spring.mqtt.password}")
    private String password;

    @Value("${spring.mqtt.url}")
    private String hostUrl;

    @Value("${spring.mqtt.client.id}")
    private String clientId;

    @Value("${spring.mqtt.default.topic}")
    private String defaultTopic;

    @Value("${sping.mqtt.qos}")
    private int qos;

    @Value("${spring.mqtt.completionTimeout}")
    private int completionTimeout ;   //连接超时


    @Bean
    public MqttConnectOptions getMqttConnectOptions(){
        MqttConnectOptions mqttConnectOptions=new MqttConnectOptions();
        mqttConnectOptions.setUserName(username);
        mqttConnectOptions.setPassword(password.toCharArray());
        mqttConnectOptions.setServerURIs(new String[]{hostUrl});
        mqttConnectOptions.setKeepAliveInterval(2);
        mqttConnectOptions.setAutomaticReconnect(true);
        //连接超时
        mqttConnectOptions.setConnectionTimeout(30);
        return mqttConnectOptions;
    }
    @Bean
    public MqttPahoClientFactory mqttClientFactory() {
        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
        factory.setConnectionOptions(getMqttConnectOptions());
        return factory;
    }

    //接收通道
    @Bean
    public MessageChannel mqttInputChannel() {
        return new DirectChannel();
    }

    //配置client,监听的topic
    @Bean
    public MessageProducer inbound() {
        MqttPahoMessageDrivenChannelAdapter adapter =
                new MqttPahoMessageDrivenChannelAdapter(clientId+"_inbound", mqttClientFactory(),defaultTopic);
        adapter.setCompletionTimeout(completionTimeout);
        adapter.setConverter(new DefaultPahoMessageConverter());
        adapter.setQos(qos);
        adapter.setOutputChannel(mqttInputChannel());
        return adapter;
    }

//    通过通道获取数据
//    @Bean
//    @ServiceActivator(inputChannel = "mqttInputChannel")
//    public MessageHandler handler() {
//        return new MessageHandler() {
//            @Override
//            public void handleMessage(Message<?> message) throws MessagingException {
//                String topic = message.getHeaders().get("mqtt_receivedTopic").toString();
//                String type = topic.substring(topic.lastIndexOf("/")+1, topic.length());
//                if("sensor".equalsIgnoreCase(topic)){
//                    System.out.println("hello,fuckXX,"+message.getPayload().toString());
//                }else if("sensor".equalsIgnoreCase(topic)){
//                    System.out.println("hello1,fuckXX,"+message.getPayload().toString());
//                }
//            }
//        };
//    }

    @Bean
    @ServiceActivator(inputChannel = "mqttInputChannel")
    public MessageHandler handler() throws Exception {
        return message -> {
//

            try {
                //这里拿到发布的消息内容，做具体的业务逻辑处理
                String string = message.getPayload().toString();
//                Node node = new Node();
//                node.create(1,null,12.12);

////                NodeTrans nodeTrans = new NodeTrans();
                log.info("Message :" + string);
                log.info("NodeTrans=");
//                log.info("NodeId:"+nodeTrans.transId(string));
//                log.info("NodeValue:" + nodeTrans.trasnValue(string));
//                log.info("NodeTime:"+nodeTrans.transTime(string));
//                node.create(nodeTrans.transId(string), nodeTrans.transTime(string), nodeTrans.trasnValue(string));
//                node.create(1,null,12.12);
            } catch (MessagingException ex) {
                log.error("MassageHandler is error!++++" + ex + "++++");
            }
        };
    }
}


