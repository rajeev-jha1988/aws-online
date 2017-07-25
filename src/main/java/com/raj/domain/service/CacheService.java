/**
 * 
 */
package com.raj.domain.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author raj007
 *
 */
@Service
public class CacheService {
	
	@Cacheable("myCache")
	public String getName(String name){
		System.out.println("not in cache calling method:: ");
		return name;
	}

}
