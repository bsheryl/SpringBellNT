package org.example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyJavaConfiguration {
    @Bean("myBeanJava")
    public MyBeanJava getMyBeanJava() {
        return new MyBeanJava("Java", 24);
    }
}
