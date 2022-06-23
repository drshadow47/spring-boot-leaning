package com.biocipher.group.horizon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
public class HorizonApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(HorizonApplication.class, args);

	}

}
