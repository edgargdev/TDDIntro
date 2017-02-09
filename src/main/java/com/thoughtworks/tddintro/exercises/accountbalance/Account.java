package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int amount) {
        this.balance = amount;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }
}
