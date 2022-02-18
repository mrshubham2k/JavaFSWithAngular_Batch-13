package com.mysite;

class AccountDetails {
    private int balance;

    public AccountDetails(){

    }

    public AccountDetails(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int withdrawlAmt) throws InsufficientAmountException{
        if(withdrawlAmt>this.getBalance()){
            throw new InsufficientAmountException();
        }
        else{
            this.setBalance(this.getBalance()-withdrawlAmt);
            System.out.println("Account balance: "+this.getBalance());
        }
    }
}

class InsufficientAmountException extends Exception{

}

public class BankAccount {
    public static void main(String[] args) {
        AccountDetails obj = new AccountDetails(5000);
        try{
            obj.withdraw(500);
        } catch (InsufficientAmountException e) {
            e.printStackTrace();
        }
    }
}
