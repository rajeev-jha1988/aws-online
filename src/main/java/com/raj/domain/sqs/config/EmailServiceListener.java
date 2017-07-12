/**
 * 
 */
package com.raj.domain.sqs.config;

import javax.jms.JMSException;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;


/**
 * @author rajeev.jha
 *
 */
@Component
public class EmailServiceListener {

	@JmsListener(destination = "MY-EMAIL-SERVICE")
    public void receiveMessage(final Message<String> message) throws JMSException {
        MessageHeaders headers =  message.getHeaders();
         System.out.println("headers::::"+headers);
        String response = message.getPayload();
        System.out.println("response::::"+response);
    }
}
