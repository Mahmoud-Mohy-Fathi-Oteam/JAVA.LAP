package bankAccount;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        bankAccount c1 = new bankAccount("Mohy", "1900407", 3000.0);
        System.out.println("Enter the amount you want to deposite = ");
        double t1 = s .nextDouble();
        c1.deposite(t1);
        System.out.println("Enter the amount you want to withdraw = ");
        double t2 = s .nextDouble();
        c1.withdraw(t2);
        System.out.println("Your current balance = " + c1.getBalance());
        c1.getLastTransaction();
    }
}