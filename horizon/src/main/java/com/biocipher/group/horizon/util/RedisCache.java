package com.biocipher.group.horizon.util;

import com.biocipher.group.horizon.model.sql.Efficiency;
import com.google.gson.Gson;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class RedisCache {

    public static Jedis jedis = new Jedis();
    public static Gson gson = new Gson();


    /**
     * Method to store  Cache  on redis Db
     *  author : Sanjeev Kumar
     * @param key  -- Key To store the  cache name
     * @param object -- Pass the Modal ( set Attribute  object)
     */
    public  void setCache(String key, Object object){
        String obj = gson.toJson(object);
        jedis.set(key, obj);
    }

    public String getCache(String key){

        String json  = jedis.get(key);
        System.out.println(json);
        return json;
    }

    public boolean chckKeyExsts(String key){
        return Objects.equals(key, jedis.get(key));
    }

}
