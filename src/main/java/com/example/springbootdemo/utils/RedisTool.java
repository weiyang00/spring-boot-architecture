//package com.example.springbootdemo.utils;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.ListOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.SetOperations;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.data.redis.core.ZSetOperations;
//
///**
// * Created by weiyang on 2018/8/4.
// *
// * @Author: weiyang
// * @Package com.example.springbootdemo.utils
// * @Project: spring-boot-demo
// * @Title:
// * @Description: Please fill description of the file here
// * @Date: 2018/8/4 14:33
// */
//@Component
//public class RedisTool {
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    private ValueOperations valueOperations;
////    @Autowired
////    private HashOperations<String, String, Object> hashOperations;
////    @Autowired
////    private ListOperations<String, Object> listOperations;
////    @Autowired
////    private SetOperations<String, Object> setOperations;
////    @Autowired
////    private ZSetOperations<String, Object> zSetOperations;
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    public static final long DEFAULT_EXPIRE = -1L;
//    public static final long NOT_EXPIRE = -1L;
//
//    public RedisTool() {
//    }
//
//    public void set(String key, Object value, long expire) {
//        this.valueOperations.set(key, this.toJson(value));
//        if (expire != -1L) {
//            this.redisTemplate.expire(key, expire, TimeUnit.SECONDS);
//        }
//    }
//
//    public void set(String key, Object value) {
//        this.set(key, value, -1L);
//    }
//
//
//    public String get(String key, long expire) {
//        if (this.redisTemplate == null) {
//            this.redisTemplate = new RedisTemplate();
//        }
//
//        String value = (String)this.valueOperations.get(key);
//        if (expire != -1L) {
//            this.redisTemplate.expire(key, expire, TimeUnit.SECONDS);
//        }
//
//        return value;
//    }
//
//    public String get(String key) {
//        return this.get(key, -1L);
//    }
//
//    public void delete(String key) {
//        this.redisTemplate.delete(key);
//    }
//
//    public long decr(String key, long by) {
//        return this.redisTemplate.opsForValue().increment(key, by != 0L ? -by : -1L).longValue();
//    }
//
//    public long incr(String key, long by) {
//        return this.redisTemplate.opsForValue().increment(key, by != 0L ? by : 1L).longValue();
//    }
//
//    public Set keys(String pattern) {
//        return this.stringRedisTemplate.keys(pattern);
//    }
//
//    private String toJson(Object object) {
//        return !(object instanceof Integer) && !(object instanceof Long) && !(object instanceof Float) && !(object instanceof Double) && !(object instanceof Boolean) && !(object instanceof String) ? JSONTool.toJSON(object) : String.valueOf(object);
//    }
//
//}
