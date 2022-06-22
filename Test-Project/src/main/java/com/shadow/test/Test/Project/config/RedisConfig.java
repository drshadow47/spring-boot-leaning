package com.shadow.test.Test.Project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisConfig {

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> myRedisTemplate = new RedisTemplate<>();
        myRedisTemplate.setConnectionFactory(jedisConnectionFactory());
        return myRedisTemplate;
    }

}
