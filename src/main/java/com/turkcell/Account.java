package com.turkcell;

public abstract class Account {
    private int accountNumber;
    private String ownerName;
    private double balance;

    public Account(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " TL yatirildi.");
        } else {
            System.out.println("Gecersiz tutar.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Gecersiz tutar.");
        } else if (amount > balance) {
            System.out.println("Yetersiz bakiye.");
        } else {
            balance -= amount;
            System.out.println(amount + " TL cekildi.");
        }
    }

    public abstract void showAccountType();

    public void showInfo() {
        System.out.println("Hesap No: " + accountNumber);
        System.out.println("Musteri: " + ownerName);
        System.out.println("Bakiye: " + balance + " TL");
    }
}