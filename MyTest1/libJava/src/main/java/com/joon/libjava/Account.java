package com.joon.libjava;

public class Account {

//    int money;
//
//    void setMoney(int a){
//        money =  money + a;
//    }
//
//    String getMoney(int a){
//        if(a>money){
//            return "NO Enough Money";
//        }else {
//            money = money - a;
//            return "O.K";
//        }
//
//    }
//
//    void printmoney(){
//        System.out.println("My Current money : " +money);
//    }

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance>=0 && balance<=1000000){
            this.balance = balance;
        }
    }
}
