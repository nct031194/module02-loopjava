
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class EqualJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        ArrayList<String> student = new ArrayList<String>();
        System.out.println("Enter student name :");

        while(!scanner.hasNextInt()){
            student.add(scanner.nextLine());
            System.out.println("Enter student name :");
        }

        for (int i = 0; i < student.size();i++){
            System.out.print(student.get(i) + " ");
        }
        System.out.println("\n Input name of student to find :");
        scanner.nextLine();
        String inputname = scanner.nextLine();


        for (int i =0 ; i < student.size(); i++){
            if (student.get(i).equals(inputname)){
                System.out.println("Position of the students in the list " + inputname + " is " + i);
                check = true;
            }
        }
        if (!check) System.out.println(" not found");
    }
}
