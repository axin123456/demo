package com.orbyun.testConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfiguration {
    @Bean
    public User user(){
        return new User();
    }
}
