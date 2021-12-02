package com.learning.devbank.domain;

public class BankAccount {
    private int agency;
    private int number;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int agency, int number) {
        this.agency = agency;
        this.number = number;
        this.balance = 0.0;
    }

    public int getAgency() {
        return agency;
    }

    public BankAccount setAgency(int agency) {
        this.agency = agency;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public BankAccount setNumber(int number) {
        this.number = number;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public String withdraw(double value) {
        if (value <= this.balance) {
            this.balance -= value;
            return "Saque conlcluído com sucesso";
        }

        return "Saldo insuficiente para efetuar o saque";
    }

    public double retrieveAccountBalance() {
        return this.getBalance();
    }
}
