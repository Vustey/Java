package P_Student;

import java.util.Scanner;

public class MaTeacher {
    private Teacher[] t = new Teacher[100000];
    private int n;

    public MaTeacher(Teacher[] t, int n) {
        this.t = t;
        this.n = n;
    }

    public MaTeacher() {
    }

    public void Input_Teacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-The numbers of Teacher : ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("-Teacher " + i + " :");
            t[i] = new Teacher();
            System.out.print("\t +Enter Id : ");
            t[i].setId(scanner.nextInt());
            scanner.nextLine();
            System.out.print("\t +Enter Name : ");
            t[i].setName(scanner.nextLine());
            System.out.print("\t +Enter Birthday : ");
            t[i].setBirthday(scanner.nextLine());
            System.out.print("\t +Enter Sex : ");
            t[i].setSex(scanner.nextLine());
        }
    }

    public void Output_Teacher() {
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("-Teacher "+ i +" :");
            System.out.print("\t- Id : " + t[i].getId() + " || Name : " + t[i].getName() + " || Birthday : "
                    + t[i].getBirthday() + " || Sex : " + t[i].getSex() + " || Country : " + t[i].getCountry()  +
                    " || Salary : " + t[i].getSalary());
        }
        System.out.println();
    }

}
