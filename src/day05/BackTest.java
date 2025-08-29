package day05;

public class BackTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234-5678","허보미");

        account.deposit(100000);
        account.withdraw(10000);
        account.check();
    }
}
