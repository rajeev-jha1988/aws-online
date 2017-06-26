package com.raj.domain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;

@Configuration
public class AppBeanCreator {
	
	
	@Bean 
	public AmazonDynamoDB amazonDynamoDB() {
		AmazonDynamoDB dynamoDBClient = AmazonDynamoDBClientBuilder.standard()
                .withCredentials(new ProfileCredentialsProvider())
                .build();
	  return dynamoDBClient;
	}

	@Bean
	public DynamoDB dynamoDB(AmazonDynamoDB amazonDynamoDB) {
	  return new DynamoDB(amazonDynamoDB);
	}
	
	@Bean
	public DynamoDBMapper dynamoDBMapper(AmazonDynamoDB amazonDynamoDB) {
	  return new DynamoDBMapper(amazonDynamoDB);
	}

}
