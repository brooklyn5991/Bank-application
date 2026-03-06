package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Account {
    private String name;
    private String accountNumber;
    private int balance;


    public String name() {
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public String getAccounNumber() {
        return accountNumber;
    }

    @PostConstruct
    public void init() {
        this.balance = 5000;
        this.accountNumber = "2635477132";
        this.name = "Oke";
    }

    @Override
    public String toString() {
        return this.name + " : " + this.accountNumber + " : " + this.getBalance();
    }
}
