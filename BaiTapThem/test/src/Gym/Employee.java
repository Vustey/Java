package Gym;

import java.util.Scanner;

public class Employee {
    private String name;
    private String lastname;
    private String birthday;
    private String country;
    private String sex;
    private String position;
    private String salary;
    private String idEmployee;

    public Employee(String name, String lastname, String birthday, String country, String sex, String position,
                    String salary, String idEmployee) {
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.country = country;
        this.sex = sex;
        this.position = position;
        this.salary = salary;
        this.idEmployee = idEmployee;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t + Enter Name : ");
        setName(scanner.nextLine());
        System.out.print("\t + Enter Last Name : ");
        setLastname(scanner.nextLine());
        System.out.print("\t + Enter ID Employee : ");
        setIdEmployee(scanner.nextLine());
        System.out.print("\t + Enter Birthday : ");
        setBirthday(scanner.nextLine());
        System.out.print("\t + Enter Country : ");
        setCountry(scanner.nextLine());
        System.out.print("\t + Enter Sex : ");
        setSex(scanner.nextLine());
        System.out.print("\t + Enter Position : ");
        setPosition(scanner.nextLine());
        System.out.print("\t + Enter Salary : ");
        setSalary(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "\t\t + Fullname : " + lastname + " " + name +
                "\n\t\t + ID Employee : " + idEmployee +
                "\n\t\t + Birthday : " + birthday +
                "\n\t\t + Sex : " + sex +
                "\n\t\t + Country : " + country +
                "\n\t\t + Position : " + position +
                "\n\t\t + Salary : " + salary ;
    }
}
