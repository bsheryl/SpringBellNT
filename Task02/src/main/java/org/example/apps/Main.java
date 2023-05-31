package org.example.apps;

import org.example.actions.Division;
import org.example.actions.Multiplication;
import org.example.actions.Subtraction;
import org.example.actions.Sum;
import org.example.calculate.Calculate;
import org.example.reader.Reader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Map;

@ComponentScan("org.example")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        Calculate calculate = Reader.read();
        calculate.setActions(Map.of(
                "+", context.getBean("sum", Sum.class),
                "-", context.getBean("subtraction", Subtraction.class),
                "*", context.getBean("multiplication", Multiplication.class),
                "/", context.getBean("division", Division.class)));
        System.out.println(calculate.calculate());
    }
}