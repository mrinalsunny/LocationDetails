package com.cgi.location.listener;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {
	
	@Autowired
	private SimpMessagingTemplate template;
	
	@KafkaListener(topics = "hsbro", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: "+message);
		
		Map<String, Object> headerMap = new HashMap<String, Object>();
		headerMap.put("sender","mrinal");
		headerMap.put("table", "browser");
		this.template.convertAndSend("/topic/push",message,headerMap);
	}
}
