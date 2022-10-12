package P_Student;

import java.util.Scanner;

public class MaStudent {
    private Student[] s = new Student[10000];
    private int n;

    public MaStudent(Student[] s, int n) {
        this.s = s;
        this.n = n;
    }

    public MaStudent() {
    }

    public void Input_Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-The numbers of Student : ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("-Student " + i + " :");
            s[i] = new Student();
            System.out.print("\t +Enter ID : ");
            s[i].setId(scanner.nextInt());
            scanner.nextLine();
            System.out.print("\t +Enter Name : ");
            s[i].setName(scanner.nextLine());
            System.out.print("\t +Enter Birthday : ");
            s[i].setBirthday(scanner.nextLine());
            System.out.print("\t +Enter Sex : ");
            s[i].setSex(scanner.nextLine());
            System.out.print("\t +Enter Country : ");
            s[i].setCountry(scanner.nextLine());
            System.out.print("\t +Enter Point : ");
            s[i].setPoint(scanner.nextFloat());
        }
        System.out.println();
    }

    public void Output_Student() {
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("\t- Id : " + s[i].getId() + " || Name : " + s[i].getName() + " || Birthday : "
                    + s[i].getBirthday() + " || Sex : " + s[i].getSex() + " || Country : " + s[i].getCountry()  +
                    " || Point : " + s[i].getPoint());
            System.out.println();
        }
        System.out.println();
    }

    public void SortOfPoint() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].getPoint() < s[j].getPoint()) {
                    Student tmp;
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
        Output_Student();
    }

    public void MaxOfPoint() {
        float max = 0;
        int x = 0;
        for (int i = 0; i < n; i++){
            if (s[i].getPoint() < max){
                max = s[i].getPoint();
                x = i;
            }
        }
        System.out.println("-------------------------------------------------------------------------------------");
//        System.out.print("\t- Id : " + s[x].getId() + " || Name : " + s[x].getName() + " || Birthday : "
//                + s[x].getBirthday() + " || Sex : " + s[x].getSex() + " || Country : " + s[x].getCountry()  +
//                " || Point : " + s[x].getPoint());
        Output_Student();
    }

}
