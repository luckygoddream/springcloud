package com.jwq.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author jwq
 * @Date 2020/7/24 12:03
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//使用LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    };
}
