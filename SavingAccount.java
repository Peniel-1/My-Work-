package com.techelevator;

public class SavingAccount  extends BankAccount {

    private int balance;
    private int transfer;

    public SavingAccount(String accountHolder, String accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }

    public SavingAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);

    }

    @Override

    public int withdraw(int amountToWithdraw) {
        if (getBalance() - amountToWithdraw >= 2) {
            super.withdraw(amountToWithdraw);
        if (getBalance() < 150) {
            super.withdraw(2);
        }
    }
    return getBalance();

      }
  }


