import java.util.Scanner;
public class Investment {
    public static void main(String[] args) {
        double money = 1.0;
        double interest = 1.0;
        int month;
        double profit;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter money ammout : ");
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid money ammout");
            System.out.println("enter again...");
            scanner.next();
        }
        money = scanner.nextDouble();

        System.out.println("Enter annual interest rate in percentage:");
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid interest");
            System.out.println("enter again...");
            scanner.next();
        }
        interest = scanner.nextDouble();

        System.out.println("Enter number of months:");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid month");
            System.out.println("enter again...");
            scanner.next();
        }
        month = scanner.nextInt();

        profit = ( interest/12/100 ) * month * money ;

        System.out.println("Total interest  : " + month*(interest/12));
        System.out.println("Profit  : " + profit);

    }
}
