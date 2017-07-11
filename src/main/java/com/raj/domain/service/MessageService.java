package com.raj.domain.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

 @Autowired
 private JmsTemplate jmsTemplate;

 @Value("${queue.name}")
 private String queueName;

 public void sendMessage(final String message) {

	 jmsTemplate.send(queueName, new MessageCreator() {
		 @Override
		 public Message createMessage(Session session) throws JMSException {
			 return session.createTextMessage(message);
		 }
	 });
 }

}