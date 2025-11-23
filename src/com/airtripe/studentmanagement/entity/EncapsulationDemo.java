package com.airtripe.studentmanagement.entity;

class BankAccount {
    // Private → data hiding
    private double balance;

    // Public getters/setters → controlled access
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(500);
        acc.withdraw(200);

        System.out.println("Balance = " + acc.getBalance());
    }
}
