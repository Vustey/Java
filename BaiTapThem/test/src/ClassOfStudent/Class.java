package ClassOfStudent;

import java.util.Scanner;

public class Class {
    private String nameClass;
    Student[] s = new Student[10000];
    public int n;

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Nameclass : ");
        nameClass = scanner.nextLine();
        System.out.print("Enter Student : ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            s[i] = new Student();
            System.out.println("- Student " + i + " : ");
            System.out.print("\t + Enter Name : ");
            s[i].setName(scanner.nextLine());
            System.out.print("\t + Enter Last Name : ");
            s[i].setLastname(scanner.nextLine());
            System.out.print("\t + Enter Country : ");
            s[i].setCountry(scanner.nextLine());
            System.out.print("\t + Enter Average : ");
            s[i].setDtb(scanner.nextFloat());
        }
    }

    public void Output() {
        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t Student " + i + " ");
            System.out.println("\t Fullname : " + s[i].getLastname()+" "+s[i].getName()+ " || Country : " +
                    s[i].getCountry() + " || Average : " + s[i].getDtb());
        }
        System.out.println();
    }

    public void SortName() {
        System.out.println("\t\t\t\t\t\t\tThe sort by name");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].getName().compareTo(s[j].getName()) > 0) {
                    Student tmp;
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
        Output();
    }

    public void Count() {
        String Add = "Hue";
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].getCountry().compareTo(Add) == 0) {
                count++;
            }
        }
        System.out.println("-The numbers student in Hue : " + count);
    }

    public void Add_Average() {
        float a = 0;
        System.out.println("\t\t\t\t\t\t\tPlus Points");
        for (int i = 0; i < n; i++) {
            if (s[i].getCountry().equals("Quang Nam")) {
                a = s[i].getDtb() + 0.3f;
                if (a > 10){
                    a = 10;
                    s[i].setDtb(a);
                }else {
                    s[i].setDtb(a);
                }
            }
        }
        Output();
    }
}
