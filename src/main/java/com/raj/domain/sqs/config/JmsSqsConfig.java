/**
 * 
 */
package com.raj.domain.sqs.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import com.amazon.sqs.javamessaging.ProviderConfiguration;
import com.amazon.sqs.javamessaging.SQSConnectionFactory;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

/**
 * @author raj007
 *
 */
@Configuration
public class JmsSqsConfig {
	@Value("${queue.endpoint}")
	private String endpoint;
	
	@Value("${queue.name}")
	private String queueName;
	
	@Autowired
	private PaymentSQSListener paymentSQSListener;
	
	
	 @Bean
	 public DefaultMessageListenerContainer jmsListenerContainer() {
		 SQSConnectionFactory sqsConnectionFactory = new SQSConnectionFactory(new ProviderConfiguration().withNumberOfMessagesToPrefetch(10),
					AmazonSQSClientBuilder.standard()
					.withRegion(Regions.US_WEST_2)
					.withCredentials(new ProfileCredentialsProvider())
					);

	 DefaultMessageListenerContainer defaultMessageListenerContainer = new DefaultMessageListenerContainer();
	 defaultMessageListenerContainer.setConnectionFactory(sqsConnectionFactory);
	 defaultMessageListenerContainer.setDestinationName(queueName);
	 defaultMessageListenerContainer.setMessageListener(paymentSQSListener);
	 return defaultMessageListenerContainer;

	 }
	 @Bean

	 public JmsTemplate createJMSTemplate() {

		 SQSConnectionFactory sqsConnectionFactory = new SQSConnectionFactory(new ProviderConfiguration().withNumberOfMessagesToPrefetch(10),
					AmazonSQSClientBuilder.standard()
					.withRegion(Regions.US_WEST_2)
					.withCredentials(new ProfileCredentialsProvider())
					);

	 JmsTemplate jmsTemplate = new JmsTemplate(sqsConnectionFactory);
	 jmsTemplate.setDefaultDestinationName(queueName);
	 jmsTemplate.setDeliveryPersistent(false);
	 return jmsTemplate;
	 }
}
