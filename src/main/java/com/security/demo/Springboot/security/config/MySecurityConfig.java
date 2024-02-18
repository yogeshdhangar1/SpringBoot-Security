package com.security.demo.Springboot.security.config;

import org.apache.coyote.Adapter;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfiguration {
    @Override
    public void setFilterChainProxySecurityConfigurer(ObjectPostProcessor<Object> objectPostProcessor, ConfigurableListableBeanFactory beanFactory) throws Exception {
        super.setFilterChainProxySecurityConfigurer(objectPostProcessor, beanFactory);
    }
}
