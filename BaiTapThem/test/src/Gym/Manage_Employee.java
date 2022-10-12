package Gym;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage_Employee {
    ArrayList<Employee> employees = new ArrayList<>();

    void inputEmployee() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t  Input Employee ");
        System.out.print("Enter The Number Employee : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("- The Employee " + (i + 1));
            Employee employee = new Employee();
            employee.input();
            employees.add(employee);
        }
    }

    void outputEmployee() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\tLIST EMPLOYEE");
        for (int i = 0; i < employees.size(); i++) {
            System.out.print("\t- The Employee " + (i + 1) + "\n");
            System.out.println(employees.get(i));
        }
    }

    void editEmployee() {
        Employee employee = new Employee();
        System.out.println();
        outputEmployee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id Employee Need Change : ");
        String idChange = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < employees.size(); i++) {
            if (idChange.equals(employees.get(i).getIdEmployee())) {
                check = false;
                employee = employees.get(i);
                break;
            }
        }
        if (check) {
            System.out.println("Not Found Id Employee ");
        } else {
            while (true) {
                System.out.println();
                System.out.println("-Editing for ID Employee : " + employee.getIdEmployee());
                System.out.println(" \t1. Editing for Name : " + employee.getName());
                System.out.println(" \t2. Editing for Last Name : " + employee.getLastname());
                System.out.println(" \t3. Editing for Birthday : " + employee.getBirthday());
                System.out.println(" \t4. Editing for Sex : " + employee.getSex());
                System.out.println(" \t5. Editing for Country : " + employee.getCountry());
                System.out.println(" \t6. Editing for Position : " + employee.getPosition());
                System.out.println(" \t7. Editing for Salary : " + employee.getSalary());
                System.out.println(" \t8. Exit.");
                System.out.println();
                System.out.print("Enter Choice : ");
                int choice = scanner.nextInt();
                System.out.println();
                scanner.nextLine();
                switch (choice) {
                    case 1: {
                        System.out.print("Enter Name Change : ");
                        String name = scanner.nextLine();
                        employee.setName(name);
                        break;
                    }
                    case 2: {
                        System.out.print("Enter LastName Change : ");
                        String lastname = scanner.nextLine();
                        employee.setLastname(lastname);
                        break;
                    }
                    case 3: {
                        System.out.print("Enter Birthday Change : ");
                        String birthday = scanner.nextLine();
                        employee.setBirthday(birthday);
                        break;
                    }
                    case 4: {
                        System.out.print("Enter Sex Change : ");
                        String sex = scanner.nextLine();
                        employee.setSex(sex);
                        break;
                    }
                    case 5: {
                        System.out.print("Enter Country Change : ");
                        String country = scanner.nextLine();
                        employee.setCountry(country);
                        break;
                    }
                    case 6: {
                        System.out.print("Enter Position Change : ");
                        String position = scanner.nextLine();
                        employee.setPosition(position);
                        break;
                    }
                    case 7: {
                        System.out.print("Enter Salary Change : ");
                        String salary = scanner.nextLine();
                        employee.setSalary(salary);
                        break;
                    }
                    case 8: {
                        return;
                    }
                }
            }
        }
    }

    void searchEmployee() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------Search Employee-------");
            System.out.println(" 1.Search By Name.");
            System.out.println(" 2.Search By ID Employee.");
            System.out.println(" 3.Search By Birthday.");
            System.out.println(" 4.Search By Sex.");
            System.out.println(" 5.Search By Country.");
            System.out.println(" 6.Search By Position.");
            System.out.println(" 7.Search By Salary.");
            System.out.println(" 8.Exit.");
            System.out.println("\t - Enter choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("\t\t\t + Enter Search Name : ");
                    String name = scanner.nextLine();
                    System.out.print("\t\t\t + Enter Search Last Name : ");
                    String lastname = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < employees.size(); i++) {
                        if (name.equals(employees.get(i).getName()) && lastname.equals(employees.get(i).getLastname())){
                            System.out.println("\n\t-Employee " + (i + 1));
                            System.out.println();
                            System.out.println(employees.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("\t\t\t + Enter Search ID Employee : ");
                    String idEmployee = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < employees.size(); i++) {
                        if (idEmployee.equals(employees.get(i).getIdEmployee())) {
                            System.out.println("\n\t-Employee " + (i + 1));
                            System.out.println();
                            System.out.println(employees.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("\t\t\t + Enter Search Birthday : ");
                    String birthday = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < employees.size(); i++) {
                        if (birthday.equals(employees.get(i).getBirthday())) {
                            System.out.println("\n\t-Employee " + (i + 1));
                            System.out.println();
                            System.out.println(employees.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("\t\t\t +  Enter Search Sex : ");
                    String sex = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < employees.size(); i++) {
                        if (sex.equals(employees.get(i).getSex())) {
                            System.out.println("\n\t-Employee " + (i + 1));
                            System.out.println();
                            System.out.println(employees.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.println("\t\t\t + Enter Search Country : ");
                    String country = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < employees.size(); i++) {
                        if (country.equals(employees.get(i).getCountry())) {
                            System.out.println("\n\t-Employee " + (i + 1));
                            System.out.println();
                            System.out.println(employees.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 6: {
                    System.out.println("\n\t + Enter Search Position : ");
                    String position = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < employees.size(); i++) {
                        if (position.equals(employees.get(i).getPosition())){
                            System.out.println("\n\t-Employee " + (i + 1));
                            System.out.println();
                            System.out.println(employees.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 7: {
                    System.out.println("\n\t + Enter Search Salary : ");
                    String salary = scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < employees.size(); i++) {
                        if(salary.equals(employees.get(i).getSalary())){
                            System.out.println("\n\t-Employee " + (i+1));
                            System.out.println();
                            System.out.println(employees.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case 8: {
                    System.out.println();
                    return;
                }
            }
        }
    }
}
