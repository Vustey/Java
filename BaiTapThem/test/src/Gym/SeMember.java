package Gym;

import java.util.Scanner;

public class SeMember {
    Manage_Member manage_member = new Manage_Member();
    void serviceMember(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("--------------MEMBERS-------------");
            System.out.println("\t 1. Input Member. ");
            System.out.println("\t 2. Output Member. ");
            System.out.println("\t 3. Edit Member. ");
            System.out.println("\t 4. Search Member. ");
            System.out.println("\t 5. Search Country. ");
            System.out.println("\t 6. Sort Contract. ");
            System.out.println("\t 7. Exit. ");
            System.out.print("- Enter Choice : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    manage_member.inputMember();
                    break;
                }
                case 2:{
                    manage_member.outputMember();
                    break;
                }
                case 3:{
                    manage_member.editMember();
                    break;
                }
                case 4:{
                    manage_member.sreachMember();
                    break;
                }
                case 5:{
                    manage_member.countCountry();
                    break;
                }
                case 6:{
                    manage_member.sortContract();
                    break;
                }
                case 7:{
                    Main.display();
                }
            }
        }
    }
}
