package com.zeta;

public abstract class Account {
    private final int number;
    ACCOUNT_TYPE type;

    boolean transfer(Account A, Account B,int amount){
        if (amount<=A.balance){
            B.balance+=amount;
            A.balance-=amount;
            return true;
        }else{
            throw new InsufficientBalanceException("insufficient balanece");
        }
    }

    float withdraw(Account A,int amount){
        if(A.balance>=amount){
            A.balance-=amount;
            return A.balance;
        }else{
            throw new InsufficientBalanceException("insufficient balanece");
        }
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    float balance;
    Address address;

    public abstract float deposit(float amount);

    public Account(int number,int balance) {
        this.number = number;
        this.balance=balance;
    }

    public ACCOUNT_TYPE getType() {
        return type;
    }

    public void setType(ACCOUNT_TYPE type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }
}
