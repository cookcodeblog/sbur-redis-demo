package cn.xdevops.springbootuprunning.sburredisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootApplication
public class SburRedisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SburRedisDemoApplication.class, args);
    }

    @Bean
    public RedisOperations<String, Aircraft>
    redisOperations(RedisConnectionFactory factory) {
        RedisTemplate<String, Aircraft> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        template.setDefaultSerializer(new Jackson2JsonRedisSerializer<>(Aircraft.class));
        template.setKeySerializer(new StringRedisSerializer());

        return template;
    }
}
