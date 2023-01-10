package Test;

import java.io.*;
import java.util.Scanner;

public class StudentList {
    Student[] s ;
    Scanner scanner = new Scanner(System.in);
    FileOutputStream w = null;
    ObjectOutputStream oss = null;
    FileInputStream r = null;
    ObjectInputStream iss = null;

    public void write() throws IOException {
        System.out.print("-Enter Number Student : ");
        int n = scanner.nextInt();
//        scanner.nextLine();
        s = new Student[n];
        try {
            w = new FileOutputStream("E:\\Workspace\\JAVA\\ReadAndWrite_File\\src\\Test\\Data");
            oss = new ObjectOutputStream(w);
            for (int i = 0; i < n; i++) {
                System.out.println("-Student " + (i+1));
                s[i] = new Student();
                System.out.print("Enter Name : ");
                s[i].setName(scanner.next());
                System.out.print("Enter Age : ");
                s[i].setName(scanner.next());
                System.out.print("Enter Country : ");
                s[i].setName(scanner.next());
            }
            oss.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            w.close();
            oss.close();
        }
        System.out.println("Success");
    }

    public void read() throws IOException {
        try {
            r = new FileInputStream("E:\\Workspace\\JAVA\\ReadAndWrite_File\\src\\Test\\Data");
            iss = new ObjectInputStream(r);
            Student student[] = (Student[]) iss.readObject();
            for (int i = 0 ; i < student.length ; i++){
                System.out.println(student[i].toString());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            iss.close();
            r.close();
        }
    }

    public static void main(String[] args) throws IOException {
        StudentList list = new StudentList();
        list.write();
        list.read();
    }
}
