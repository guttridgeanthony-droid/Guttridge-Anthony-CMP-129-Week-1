import java.util.*;
public class BoxOffice {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double ADULT_PRICE = 10.00;
        final double CHILD_PRICE = 6.00;
        final double THEATER_PERCENT = 0.20;
        final double DISTRIBUTOR_PERCENT = 0.80;
        
        System.out.print("Enter the name of the movie: ");
        String movieName = input.nextLine();
         System.out.print("Enter the number of adult tickets sold: ");
        int adultTickets = input.nextInt();

        System.out.print("Enter the number of child tickets sold: ");
        int childTickets = input.nextInt();
        double grossProfit = (adultTickets * ADULT_PRICE)
                           + (childTickets * CHILD_PRICE);
        double netProfit = grossProfit * THEATER_PERCENT;

        double distributorAmount = grossProfit * DISTRIBUTOR_PERCENT;
        System.out.println();
        System.out.println("Movie Name: " + movieName);
        System.out.println("Adult Tickets Sold: " + adultTickets);
        System.out.println("Child Tickets Sold: " + childTickets);
        System.out.printf("Gross Box Office Profit: $%.2f%n", grossProfit);
        System.out.printf("Net Box Office Profit: $%.2f%n", netProfit);
        System.out.printf("Amount Paid to Distributor: $%.2f%n", distributorAmount);


    }
}