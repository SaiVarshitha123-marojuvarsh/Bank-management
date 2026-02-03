package com.zeta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account acc = new SavingsAcc(345,50);
        Account acc1 = new CurrentSavings(2457,70);
        Bank b = new Bank();
        boolean a= b.transfer(acc,acc1,800);
        System.out.println(a);
        SavingsAcc acc2= new SavingsAcc(567,300);
        float rem_amount = b.withdraw(acc2,-10000);
        System.out.println(rem_amount);
    }
}