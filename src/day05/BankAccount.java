package day05;

public class BankAccount {
    private String account;
    private String owner;;
    private double balance;

    public BankAccount(String account, String owner) {
        this.account = account;
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("입금액 : "+amount);
        System.out.println("총잔액 : "+this.balance);
    }

    public void withdraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
            System.out.println("출금액 : "+amount);
            System.out.println("총잔액 : "+this.balance);
        }
        else{
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void check(){
        System.out.println("총잔액 : "+this.balance);
    }

}
