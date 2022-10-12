package ArrayList_Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Class_Student {
    private String nameClass;
    public static ArrayList<Student> students = new ArrayList<Student>();

    public String getC_student() {
        return nameClass;
    }

    public void setC_student(String c_student) {
        this.nameClass = nameClass;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Class name : ");
        nameClass = scanner.nextLine();
        System.out.print("Enter Student : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("- Student " + i + " : ");
            Student s = new Student();
            s.Input_Student();
            students.add(s);
        }
    }

    public void output() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t- The class " + nameClass);
        for (int i = 0; i < students.size(); i++) {
            System.out.printf(" \t" + students.get(i));
        }

    }

    public void sortName() {
        System.out.println("\t\t\t\t\tThe sort by name");
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getName().compareTo(students.get(j).getName()) > 0) {
                    Student tmp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, tmp);
                }
            }
        }
        output();
    }

    public void searchCountry() {
        System.out.println();
        System.out.println("\t\t\t\tThe search by Country");
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCountry().equals("Hue")) {
                count++;
            }
        }
        System.out.print("The numbers student in Hue : " + count);
    }

    public void searchQuangNam() {
        System.out.println();
        float a = 0;
        System.out.println("\t\t\t\t\t\t\tPlus Points");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCountry().equals("Quang Nam")){
                a = students.get(i).getDtb() + 0.3f;
                if ( a > 10){
                    a = 10;
                    students.get(i).setDtb(a);
                }else {
                    students.get(i).setDtb(a);
                }
            }
        }
        output();
    }
}
