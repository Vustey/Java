package Gym;

import java.util.Scanner;

public class Main {
    public static void display() {
        SeMember seMember = new SeMember();
        SeEmployee seEmployee = new SeEmployee();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------------GYM------------");
            System.out.println("\t\t1. Member ");
            System.out.println("\t\t2. Employee ");
            System.out.println("\t\t3. Exit ");
            System.out.print("Enter The Choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    seMember.serviceMember();
                }
                case 2: {
                    seEmployee.serviceEmployee();
                }
                case 3: {
                    System.out.println("------Goodbye------");
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        display();
    }
}
