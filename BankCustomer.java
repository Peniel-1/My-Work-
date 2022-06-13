package com.techelevator;


import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private String name = "";
    private String address = "";
    private String phoneNumber = "";
    private ArrayList<Accountable> accounts = new ArrayList<>();


    // Getters
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;

    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    // method

    public Accountable[] getAccounts() {
        Accountable[] acc = new Accountable[this.accounts.size()];
        for (int i = 0; i < this.accounts.size(); i++) {
            acc[i] = this.accounts.get(i);
        }
        return acc;
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip() {
        int balance = 0;
        for (int i = 0; i < this.accounts.size(); i++) {
            Accountable accounts = this.accounts.get(i);
            balance = balance + accounts.getBalance();
        }
        if (balance >= 25000) {
            return true;
        } else {
            return false;
        }
    }
}



