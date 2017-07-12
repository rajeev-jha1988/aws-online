package com.raj.domain.sqs.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

@Configuration
@PropertySource("classpath:jmsConfig.properties")
public class SQSConfig {

	@Value("${queue.endpoint}")
	private String endpoint;

	@Value("${queue.name}")
	private String queueName;

	@Bean
	public AmazonSQS createSQSClient() {
		AmazonSQS amazonSQS = AmazonSQSClientBuilder.standard()
		.withRegion(Regions.US_WEST_2)
		.withCredentials(new ProfileCredentialsProvider()).build();
		return amazonSQS;
	}

}