package com.covid19army.core.mex.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class RabbitMQSender {
	@Autowired
	private AmqpTemplate rabbitTemplate;	
	
	private String exchange;	
	
	private String routingkey;	
	
	public RabbitMQSender(String exchange, String routingkey) {
		this.exchange = exchange;
		this.routingkey = routingkey;
	}
	
	public <T> void  send(T message) {
		rabbitTemplate.convertAndSend(exchange, routingkey, message);
		
		System.out.println("Send msg = " + message);	    
	}
}
