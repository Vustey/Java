package DTU;

import java.util.Scanner;

public class Interface_Employee implements Comparable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Enter Name : ");
        name = scanner.nextLine();
        System.out.print("-Enter Age : ");
        age = scanner.nextInt();
    }

    void output() {
        System.out.println("Name : " + name + " || Age : " + age);
    }

    public int compareTo(Interface_Employee employee) {
        if (age > employee.age) {
            return 1;
        } else if (age < employee.age) {
            return -1;
        } else {
            return 0;
        }
    }
    @Override
    public int compareTo(Object o) {
        return compareTo(0);
    }
    public static void main(String[] args) {
        Interface_Employee employee = new Interface_Employee();
        Interface_Employee employee1 = new Interface_Employee();
        employee.input();
        employee1.input();
        if(employee.compareTo(employee1) > 0){
            System.out.println("e lon e1");
        }else if (employee.compareTo(employee1) ==0){
            System.out.println("e bang tuoi e1");
        }else {
            System.out.println("e nho hon e1");
        }
    }

}

