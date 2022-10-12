package Gym;

import java.util.Scanner;

public class SeEmployee {
    Manage_Employee manage_employee = new Manage_Employee();

    void serviceEmployee(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("--------------EMPLOYEES-------------");
            System.out.println("\t 1. Input Employee. ");
            System.out.println("\t 2. Output Employee. ");
            System.out.println("\t 3. Edit Employee. ");
            System.out.println("\t 4. Search Employee. ");
            System.out.println("\t 5. Exit. ");
            System.out.println();
            System.out.print("-Enter choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1: {
                    manage_employee.inputEmployee();
                    break;
                }
                case 2: {
                    manage_employee.outputEmployee();
                    break;
                }
                case 3: {
                    manage_employee.editEmployee();
                    break;
                }
                case 4:{
                    manage_employee.searchEmployee();
                    break;
                }
                case 5: {
                    Main.display();
                }
            }
        }
    }
}
