package L83LaMa;

import java.util.Scanner;

public abstract class Person {
    protected String code;
    protected String name;
    protected int rank;

    public Person(String code, String name, int rank) {
        this.code = code;
        this.name = name;
        this.rank = rank;
    }
    public Person(){

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public abstract String description();

    public void display(){
        System.out.println("Employee Code : " +code);
        System.out.println("Employee Name : " +name);
        System.out.println("Employee Rank : " +rank);
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Enter Code : ");
        code = scanner.nextLine();
        System.out.print("-Enter Name : ");
        name = scanner.nextLine();
        System.out.print("-Enter Rank : ");
        rank = scanner.nextInt();
        scanner.nextLine();
    }
}
