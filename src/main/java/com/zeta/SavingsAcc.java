package com.zeta;
public class SavingsAcc extends Account{
    public SavingsAcc(int number,int balance) {
        super(number,balance);
    }

    @Override
    public float deposit(float amount) {
        if(amount<=0) {
            throw new IllegalArgumentException("amount cannot be negative or zero");
        }
        return 0;
    }
}
