package com.zeta;

public abstract class Account {
    private final int number;
    ACCOUNT_TYPE type;
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
