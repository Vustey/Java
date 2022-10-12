package P_Student;

import java.util.Scanner;

public class SeTeacher {
    MaTeacher s = new MaTeacher();
    public void Service_Teacher(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\t\t\t\t----Teacher---");
            System.out.println("1. Input Teacher. ");
            System.out.println("2. Output Teacher.");
            System.out.println("3. Return Main Menu. ");
            System.out.print("-Enter your choice : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    s.Input_Teacher();
                    break;
                }
                case 2:{
                    s.Output_Teacher();
                    break;
                }
                case 3:{
                    return;
                }
            }
        }
    }
}
