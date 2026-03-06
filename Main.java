package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(
            AccountRepository.class
        );

        var account = context.getBean(Account.class);
        System.out.println(account);
    }
}