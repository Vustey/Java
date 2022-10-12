package Gym;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage_Member {

    ArrayList<Member> members = new ArrayList<>();


    void inputMember() {
        System.out.println();
        System.out.println("\t\t 1.Input Member.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Name PT : ");
        String name_PT = scanner.nextLine();
        System.out.print("Enter The Number Member : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("- The Member " + (i + 1));
            Member member = new Member();
            member.input();
            members.add(member);
        }
    }

    void outputMember() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t LIST MEMBERS");
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < members.size(); i++) {
            System.out.print("\t- The Member " + (i + 1) + "\n");
            System.out.println(members.get(i));
        }
    }

    void editMember() {
        Member member = new Member();
        System.out.println();
        outputMember();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Membership No. Need Change : ");
        String idChange = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < members.size(); i++) {
            if (idChange.equals(members.get(i).getMemNo())) {
                check = false;
                member = members.get(i);
                break;
            }
        }
        if (check) {
            System.out.println("Not Found Membership No. ");
        } else {
            while (true) {
                System.out.println();
                System.out.println("-Editing for Membership No. : " + member.getMemNo());
                System.out.println(" \t1. Editing for Name : " + member.getName());
                System.out.println(" \t2. Editing for LastName : " + member.getLastname());
                System.out.println(" \t3. Editing for Birthday : " + member.getBirthday());
                System.out.println(" \t4. Editing for Country : " + member.getCountry());
                System.out.println(" \t5. Editing for Sex : " + member.getSex());
                System.out.println(" \t6. Editing for Start Day : " + member.getStartday());
                System.out.println(" \t7. Editing for Membership Type : " + member.getMemType());
                System.out.println(" \t8. Editing for Contract : " + member.getContract());
                System.out.println(" \t9. Exit.");
                System.out.println();
                System.out.print("Enter Choice : ");
                int choice = scanner.nextInt();
                System.out.println();
                scanner.nextLine();
                switch (choice) {
                    case 1: {
                        String name;
                        System.out.print("Enter Name Change : ");
                        name = scanner.nextLine();
                        member.setName(name);
                        break;
                    }
                    case 2: {
                        String lastname;
                        System.out.print("Enter LastName Change : ");
                        lastname = scanner.nextLine();
                        member.setLastname(lastname);
                        break;
                    }
                    case 3: {
                        String birthday;
                        System.out.print("Enter Birthday Change : ");
                        birthday = scanner.nextLine();
                        member.setBirthday(birthday);
                        break;
                    }
                    case 4: {
                        String country;
                        System.out.print("Enter Country Change : ");
                        country = scanner.nextLine();
                        member.setCountry(country);
                        break;
                    }
                    case 5: {
                        String sex;
                        System.out.print("Enter Sex Change : ");
                        sex = scanner.nextLine();
                        member.setSex(sex);
                        break;
                    }
                    case 6: {
                        String startday;
                        System.out.print("Enter Start Day Change : ");
                        startday = scanner.nextLine();
                        member.setStartday(startday);
                        break;
                    }
                    case 7: {
                        String memtype;
                        System.out.print("Enter Membership Type Change : ");
                        memtype = scanner.nextLine();
                        member.setMemType(memtype);
                        break;
                    }
                    case 8: {
                        String contract;
                        System.out.print("Enter Contract Change : ");
                        contract = scanner.nextLine();
                        member.setContract(contract);
                        break;
                    }
                    case 9: {
                        return;
                    }
                }
            }
        }
    }

    void sreachMember() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------Search Member-------");
            System.out.println("  1.Search By Name.");
            System.out.println("  2.Search By Membership No.");
            System.out.println("  3.Search By Membership Type.");
            System.out.println("  4.Search By Contract.");
            System.out.println("  5.Search By Sex.");
            System.out.println("  6.Search By Birthday.");
            System.out.println("  7.Search By Start Day.");
            System.out.println("  8.Search By Country.");
            System.out.println("  9.Exit.");
            System.out.print("\t - Enter choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("\t\t\t + Enter Search Name : ");
                    String name = scanner.nextLine();
                    System.out.print("\t\t\t + Enter Search Last Name : ");
                    String lastname = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < members.size(); i++) {
                        if (name.equals(members.get(i).getName()) && lastname.equals(members.get(i).getLastname())) {
                            System.out.println("\n\t-Member " + (i + 1));
                            System.out.println();
                            System.out.println( members.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("\t\t\t + Enter Search Membership No . : ");
                    String memSearch = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < members.size(); i++) {
                        if (memSearch.equals(members.get(i).getMemNo())) {
                            System.out.println("\n\t-Member " + (i + 1));
                            System.out.println();
                            System.out.println( members.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.print("\t\t\t + Enter Search Membership Type : ");
                    String memType = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < members.size(); i++) {
                        if (memType.equals(members.get(i).getMemType())) {
                            System.out.println("\n\t-Member " + (i + 1));
                            System.out.println();
                            System.out.println( members.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.print("\t\t\t +  Enter Search Contract : ");
                    String contract = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < members.size(); i++) {
                        if (contract.equals(members.get(i).getContract())) {
                            System.out.println("\n\t-Member " + (i + 1));
                            System.out.println();
                            System.out.println( members.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.print("\t\t\t + Enter Search Sex : ");
                    String sex = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < members.size(); i++) {
                        if (sex.equals(members.get(i).getSex())) {
                            System.out.println("\n\t-Member " + (i + 1));
                            System.out.println();
                            System.out.println( members.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 6: {
                    System.out.print("\t\t\t + Enter Search Birthday : ");
                    String birthday = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < members.size(); i++) {
                        if (birthday.equals(members.get(i).getBirthday())) {
                            System.out.println("\n\t-Member " + (i + 1));
                            System.out.println();
                            System.out.println( members.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 7: {
                    System.out.print("\t\t\t + Enter Search Start Day : ");
                    String startDay = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < members.size(); i++) {
                        if (startDay.equals(members.get(i).getStartday())) {
                            System.out.println("\n\t-Member " + (i + 1));
                            System.out.println();
                            System.out.println( members.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 8: {
                    System.out.print("\t\t\t + Enter Search Country : ");
                    String country = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < members.size(); i++) {
                        if (country.equals(members.get(i).getCountry())) {
                            System.out.println("\n\t-Member " + (i + 1));
                            System.out.println();
                            System.out.println( members.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 9: {
                    System.out.println();
                    return;
                }
            }
        }
    }

    void countCountry() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Search Country : ");
        String search = scanner.nextLine();
        System.out.println();
        for (int i = 0; i < members.size(); i++) {
            if (search.equals(members.get(i).getCountry())) {
                count++;
                System.out.println(members.get(i));
            }
        }
        if (count == 0) {
            System.out.println("-----Not Found Member------");
        }
        System.out.println("Total members live in " + search + " : " + count);
        System.out.println();
    }

    void sortContract() {
        for (int i = 0; i < members.size(); i++) {
            for (int j = i + 1; j < members.size(); j++) {
                if (members.get(i).getContract().compareTo(members.get(j).getContract()) < 0) {
                    Member tmp = members.get(i);
                    members.set(i, members.get(j));
                    members.set(j, tmp);
                }
            }
        }
        outputMember();
    }
}
