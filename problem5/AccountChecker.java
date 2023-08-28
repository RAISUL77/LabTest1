package problem5;

public class AccountChecker {
    public static void main(String[] args)
    {
        BankAccount Raisul = new BankAccount(5000);
        BankAccount Nur = new BankAccount();

        Raisul.deposit(400);
        Raisul.withdraw(1200);

        System.out.println("Raisul:\nAccount No: " + Raisul.getAccountNumber() + "\nBalance: " + Raisul.getBalance());

        Nur.deposit(6000);
        Nur.withdraw(400);

        System.out.println("Nur:\nAccount No: " + Nur.getAccountNumber() + "\nBalance: " + Nur.getBalance());
    }

}
