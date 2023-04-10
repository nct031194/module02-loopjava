import java.util.Scanner;

public class USLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a;
        int b;
        int maxnum = 1;
        System.out.println("enter a number : ");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid number");
            System.out.println("enter again...");
            scanner.next();
        }
        a = scanner.nextInt();

        System.out.println("enter b number : ");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid number");
            System.out.println("enter again...");
            scanner.next();
        }
        b = scanner.nextInt();
        if (a % b == 0 && a > b) System.out.println(b + " la uoc so chung lon nhat a va b");
        else if (b % a == 0 && b > a) System.out.println(a + " la uoc so chung lon nhat a va b");
        else if (a == 0 && b == 0) System.out.println("a va b khong co uoc so chung");
        else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0 && b % i == 0) {
                    maxnum = i;
                }
            }
            System.out.println( maxnum + " la uoc so chung lon nhat a va b");
        }
    }
}
