package org.example.apps;

import org.example.beans.MyBeanAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example")
public class AutoConfigurationContextApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutoConfigurationContextApp.class);

        MyBeanAutoConfiguration myBeanAutoConfiguration = context.getBean("myBeanAutoConfiguration", MyBeanAutoConfiguration.class);

        System.out.println(myBeanAutoConfiguration);
    }
}
