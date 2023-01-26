import java.text.DecimalFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(0.045);

        account.withdraw(2500);
        account.deposit(3000);
        double monthlyInterest = account.getBalance() * account.getMonthlyInterestRate();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Balance: " + df.format(account.getBalance()));
        System.out.println("Monthly interest: " + df.format(monthlyInterest));
        System.out.println("Date created: " + account.getDateCreated());
    }
}