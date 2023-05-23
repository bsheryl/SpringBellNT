package org.example.apps;

import org.example.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;
@ComponentScan("org.example")
public class ActionsApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ActionsApp.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Послушать музыку\n2 - Посмотреть фильмы\n3 - Поиграть в игру");
        String input = scanner.nextLine();
        Action actionBean = switch (input) {
            case "1" -> context.getBean("listenMusic", ListenMusic.class);
            case "2" -> context.getBean("watchMovie", WatchMovie.class);
            case "3" -> context.getBean("playGame", PlayGame.class);
            default -> context.getBean("nothingDo", NothingDo.class);
        };
        System.out.println(actionBean);
    }
}
