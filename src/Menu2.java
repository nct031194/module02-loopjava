import java.util.Scanner;
public class Menu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num != 6){
            System.out.println("1. Rectangle");
            System.out.println("2. Bot Triangle");
            System.out.println("3. Top Triangle");
            System.out.println("4. top right triangle");
            System.out.println("5. bot right triangle");
            System.out.println("6. Exit");
            num = scanner.nextInt();
            switch (num){
                case 1:
                    for (int i = 0; i < 3 ; i++){
                        for (int j = 0 ; j < 7 ; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0 ; i < 5;i++){
                        for (int j = 0 ; j <= i ; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0 ; i < 5;i++){
                        for (int j = 4 ; j >=i  ; j--){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    for (int i = 0 ; i < 5;i++){
                        for (int j = 4 ; j >=i  ; j--){
                            System.out.print("*");
                        }
                        System.out.println("");
                        for (int k = 0; k <= i ; k++){
                            System.out.print(" ");
                        }
                    }
                    break;
                case 5:
                    for (int i = 0 ; i < 5;i++){
                        for (int j = 4 ; j >=i  ; j--){
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i ; k++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }
}
