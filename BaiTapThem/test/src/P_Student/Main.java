package P_Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeStudent s = new SeStudent();
        SeTeacher t = new SeTeacher();
        while (true){
            System.out.println("----------------Duy Tan University------------------");
            System.out.println("1. Student ");
            System.out.println("2. Teacher ");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 :{
                    s.Service_Student();
                }
                case 2 :{
                    t.Service_Teacher();
                }
            }
        }
    }
}
