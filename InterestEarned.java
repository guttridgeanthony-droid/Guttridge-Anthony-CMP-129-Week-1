import java.util.Scanner;
// Anthony Guttridge
//

public class InterestEarned
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;

        System.out.print("Enter the principal: ");
        principal = keyboard.nextDouble();

        System.out.print("Enter the interest rate: ");
        rate = keyboard.nextDouble();

        System.out.print("Enter the number of times the interest is compounded: ");
        timesCompounded = keyboard.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100 / timesCompounded), timesCompounded);
        double interest = amount - principal;

        System.out.println();
        System.out.printf("Interest Rate: %20.2f%%\n", rate);
        System.out.printf("Times Compounded: %16d\n", timesCompounded);
        System.out.printf("Principal: %19s%.2f\n", "$", principal);
        System.out.printf("Interest: %20s%.2f\n", "$", interest);
        System.out.printf("Amount in Savings: %11s%.2f\n", "$", amount);
    }
}
