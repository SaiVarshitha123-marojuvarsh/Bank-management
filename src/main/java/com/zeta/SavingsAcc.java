package com.zeta;
public class SavingsAcc extends Account{
    public SavingsAcc(int number,int balance) {
        super(number,balance);
    }

    @Override
    public float deposit(float amount) {
        return 0;
    }
}
