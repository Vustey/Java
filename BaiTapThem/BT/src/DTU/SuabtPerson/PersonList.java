package DTU.SuabtPerson;

import java.util.Scanner;

class Person {
    protected String name;
    protected String code;
    protected int rank;

    public Person(String name, String code, int rank) {
        this.name = name;
        this.code = code;
        this.rank = rank;
    }

    public Person() {
        code = name = "";
        this.rank = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void display() {
        System.out.println("-Person code : " + code);
        System.out.println("-Person name : " + name);
        System.out.println("-Persom rank : " + rank);
    }

    public String description() {
        return "";
    }

    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Enter code : ");
        code = scanner.nextLine();
        System.out.print("-Enter name : ");
        name = scanner.nextLine();
        System.out.print("-Enter rank : ");
        rank = scanner.nextInt();
        scanner.nextLine();
    }
}

class Student extends Person {
    private String DP;
    private int YoG;

    void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Enter DP : ");
        DP = scanner.nextLine();
        System.out.print("-Enter YoG : ");
        YoG = scanner.nextInt();
        scanner.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("-Person DP : " + DP);
        System.out.println("-Person YoG : " + YoG);
    }

    @Override
    public String description() {
        String t = "";
        switch (rank) {
            case 0:
                t = t + "None";
                break;
            case 1:
                t = t + "Preshman";
                break;
            case 2:
                t = t + "Sophomore";
                break;
            case 3:
                t = t + "Junior";
                break;
            case 4:
                t = t + "Senior";
                break;
            case 5:
                t = t + "Graduate";
                break;
            case 6:
                t = t + "Masters Postgraduate";
                break;
            case 7:
                t = t + "PhD Postgraduate\r\n";
                break;
        }
        return t;
    }
}

class Professor extends Person {
    private String department;

    @Override
    void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("-Enter Department : ");
        department = scanner.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("-Person Department : " + department);
    }

    @Override
    public String description() {
        String t = "";
        switch (rank) {
            case 0:
                t = t + "None";
                break;
            case 1:
                t = t + "Assistant Professor";
                break;
            case 2:
                t = t + "Asociate Professor";
                break;
            case 3:
                t = t + "Professor";
                break;
            case 4:
                t = t + "Assistant Teaching Professor";
                break;
            case 5:
                t = t + "Asociate Teaching Professor";
                break;
            case 6:
                t = t + "Teaching Professor";
        }
        return t;

    }
}

public class PersonList {
    int n;
    Person[] p;
    Scanner scanner = new Scanner(System.in);

    void nhap() {
        System.out.print("-Enter person : ");
        n = scanner.nextInt();
        scanner.nextLine();
        p = new Person[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Student(S) or Professor(P) : ");
            String choose = scanner.nextLine();
            if (choose.equals("S") || choose.equals("s")) {
                p[i] = new Student();
                p[i].nhap();
            } else if (choose.equals("P") || choose.equals("p")) {
                p[i] = new Professor();
                p[i].nhap();
            }
        }
    }

    void xuat() {
        for (Person person : p) {
            System.out.println("\n");
            person.display();
        }
    }

    void avgRank() {
        double tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp += p[i].getRank();
        }
        System.out.println("\n\n-Average Rank : " + (tmp / n));
    }

    void maxRank() {
        int v = n-1;
        for (int i = n - 2; i >= 0; i--) {
            if(p[i].getRank()>p[v].getRank()){
                v=i;
            }
        }
        System.out.println("\nPerson have rank max final ");
        p[v].display();
    }

    void remove(){
        System.out.print("Enter Code : ");
        String newCode = scanner.nextLine();
        Person[] tmpPerson = new Person[p.length-1];
        for (int i = 0,k=0 ; i< p.length ;i++){
            if(p[i].getCode().equals(newCode)){
                continue;
            }
            tmpPerson[k++] = this.p[i];
        }
        p = tmpPerson;
        n--;
    }

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        personList.nhap();
        personList.xuat();
        personList.avgRank();
        personList.maxRank();
        personList.remove();
    }
}
