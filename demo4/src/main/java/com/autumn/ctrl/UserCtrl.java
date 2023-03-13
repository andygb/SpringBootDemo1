package com.autumn.ctrl;

import com.autumn.mapper.UserMapper;
import com.autumn.model.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * @author shishaofei
 * @since 2023/3/5
 */
@Slf4j
@RestController
public class UserCtrl {

    private final static Logger log = LoggerFactory.getLogger(UserCtrl.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate ;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public Object getUser() {
        log.info("users called d ");
        String sql = "select * from users where id = 1;";
        Map<String, Object> user = jdbcTemplate.queryForMap(sql);
        return user;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userMapper.getUserById(id);
    }


    @GetMapping("/redis/get/{key}")
    public Object getRedis(@PathVariable("key") String key) {
        log.info(" get redis key : {}" , key);
        return stringRedisTemplate.opsForValue().get(key);
    }

    @GetMapping("/redis/set")
    public Object setRedis(@RequestParam String key, @RequestParam String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return stringRedisTemplate.opsForValue().get(key);
    }

}

