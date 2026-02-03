package com.zeta;

public class CurrentSavings extends Account {
    public CurrentSavings(int number,int balance){
        super(number,balance);
    }

    @Override
    public float deposit(float amount) {
        return 0;
    }
}
