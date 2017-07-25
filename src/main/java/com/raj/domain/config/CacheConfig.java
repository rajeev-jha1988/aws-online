/**
 * 
 *//*
package com.raj.domain.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

*//**
 * @author raj007
 *
 *//*
@Configuration
@EnableCaching
public class CacheConfig extends CachingConfigurerSupport {

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisConFactory = new JedisConnectionFactory();
		jedisConFactory.setHostName("redis-cache-0001-001.hjrg1p.0001.usw2.cache.amazonaws.com");
		jedisConFactory.setPort(6379);
		return jedisConFactory;
	}
	@Bean
	public RedisTemplate redisTemplate(RedisConnectionFactory cf) {
		RedisTemplate redisTemplate = new RedisTemplate();
		redisTemplate.setConnectionFactory(cf);
		return redisTemplate;
	}
	 @Bean
	public CacheManager cacheManager(RedisTemplate redisTemplate) {
	    RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
	    cacheManager.setDefaultExpiration(300);
	    return cacheManager;
	  }
}
*/