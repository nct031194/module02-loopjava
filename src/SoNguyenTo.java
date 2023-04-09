import java.util.Scanner;
public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean check = true;
        boolean checknum = true;
        while (check) {
            checknum = true;
            System.out.print("Enter number you want to check ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number");
                scanner.next();
            }
            num = scanner.nextInt();
            if (num > 2) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        checknum = false;
                    }
                }
            }
            else {
                checknum = false;
            }

            if (checknum || num == 2) System.out.println(num + " la so nguyen to");
            else {
                System.out.println(num + " khong la so nguyen to");
            }
        }
    }
}