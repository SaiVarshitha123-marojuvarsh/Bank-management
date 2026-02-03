package com.zeta;

import java.util.logging.Logger;

public class Bank {
    Logger logger = Logger.getLogger("bank");

    boolean transfer(Account A, Account B,int amount){
        if(amount<=0) {
            throw new IllegalArgumentException("amount cannot be negative or zero");
        }
        try{
            boolean res = A.transfer(A,B,amount);
            return res;
        }catch (InsufficientBalanceException insufficientBalanceException){
            logger.severe(insufficientBalanceException.getMessage());
        }
        return false;
    }

    float withdraw(Account A,int amount){
        if(amount<=0) {
            throw new IllegalArgumentException("amount cannot be negative or zero");
        }
        try{
            float remain= A.withdraw(A,amount);
            return remain;
        }catch (InsufficientBalanceException insufficientBalanceException){
            logger.severe(insufficientBalanceException.getMessage());
        }
        return 0;
    }

}
