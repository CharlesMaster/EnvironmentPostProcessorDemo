package com.remoteconfig.example1.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Properties;

public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

        Properties properties = new Properties();
        properties.put("author","Jack");
        PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("my",properties);
        environment.getPropertySources().addLast(propertiesPropertySource);

    }
}
