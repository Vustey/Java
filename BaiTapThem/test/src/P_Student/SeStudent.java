package P_Student;

import java.util.Scanner;

public class SeStudent {
    MaStudent s = new MaStudent();
    public void Service_Student(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\t\t\t\t----Student---");
            System.out.println("1. Input Student. ");
            System.out.println("2. Output Student.");
            System.out.println("3. Sort Of Point.");
            System.out.println("4. Max Of Point");
            System.out.println("5. Return Main Menu. ");
            System.out.print("-Enter your choice : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 :{
                    s.Input_Student();
                    break;
                }
                case 2 :{
                    s.Output_Student();
                    break;
                }
                case 3 :{
                    s.SortOfPoint();
                    break;
                }
                case 4 :{
                    s.MaxOfPoint();
                    break;
                }
                case 5 :{
                    return;
                }
            }
        }
    }
}
