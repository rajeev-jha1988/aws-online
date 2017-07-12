/**
 * 
 */
package com.raj.domain.sqs.config;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author raj007
 *
 */
@Component
public class PaymentSQSListener {

	 @JmsListener(destination = "Payment-Message-Queue")
	public void onPaymentMessage(Message message) {
		 TextMessage textMessage = (TextMessage) message;
		 try {
			 System.out.println("Messages recived onPaymentMessage");
			System.out.println(textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
