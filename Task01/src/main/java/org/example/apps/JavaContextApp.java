package org.example.apps;

import org.example.beans.MyBeanJava;
import org.example.beans.MyJavaConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaContextApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyJavaConfiguration.class);

        MyBeanJava myBeanJava = context.getBean("myBeanJava", MyBeanJava.class);

        System.out.println(myBeanJava);
    }
}
