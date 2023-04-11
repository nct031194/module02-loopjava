import java.util.Scanner;

public class FahrenCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int input;
        double result;
        double num;
        while (!check){
            System.out.println("1. Fahrenheit to Celsius ");
            System.out.println("2. Celsius to Fahrenheit ");
            System.out.println("3. Exit ");
            System.out.println("enter your choice: ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid Input");
                System.out.println("enter again...");
            }
            input = scanner.nextInt();
            switch (input){
                case 1 :
                    System.out.println("Enter Fahrenheit:");
                    num = scanner.nextDouble();
                    result = (5.0 / 9) * (num - 32);
                    System.out.println("Celcius : " + result);
                    break;
                case 2 :
                    System.out.println("Enter Celcius:");
                    num = scanner.nextDouble();
                    result = (9.0 / 5) * num + 32;
                    System.out.println("Fahrenheit : " + result);
                    break;
                case 3 :
                    check = true;
                    break;
            }
        }
    }
}
