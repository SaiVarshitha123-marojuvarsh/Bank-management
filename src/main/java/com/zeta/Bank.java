package com.zeta;

public class Bank {

    boolean transfer(Account A, Account B,int amount){
        if (amount<=A.balance){
            B.balance+=amount;
            A.balance-=amount;
            return true;
        }else{
            return false;
        }
    }

    float withdraw(Account A,int amount){
        if(amount<=0) {
            throw new IllegalArgumentException("amount cannot be negative or zero");
        }
        if(A.balance>=amount){
            A.balance-=amount;
            return A.balance;
        }else{
            throw new InsufficientBalanceException("current balance is less than withdrawing amount");
        }
    }

}
