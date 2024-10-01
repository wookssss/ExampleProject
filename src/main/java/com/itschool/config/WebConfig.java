package com.itschool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
public class WebConfig {
    @Bean
    public MappingJackson2JsonView jasonView(){
        return new MappingJackson2JsonView();
    }
}
