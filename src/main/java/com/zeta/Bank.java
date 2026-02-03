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

}
