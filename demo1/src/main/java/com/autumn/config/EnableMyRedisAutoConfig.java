package com.autumn.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author shishaofei
 * @since 2023/2/11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
@Import(MyRedisAutoConfig.class)
public @interface EnableMyRedisAutoConfig {
}
