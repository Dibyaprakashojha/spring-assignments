package com.player.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlayerMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.player.service");
        EventDetails details = context.getBean("eventDetails",EventDetails.class);
        System.out.println();
        System.out.println("Football Players:");

        details.printEvent("f").stream().forEach(System.out::println);
        System.out.println();
        System.out.println("Cricket Players:");

        details.printEvent("c").stream().forEach(System.out::println);
        System.out.println();
        System.out.println("Hockey Players:");

        details.printEvent("h").stream().forEach(System.out::println);
    }
}
