package L83LaMa;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
    Student student = new Student();
    Professor professor = new Professor();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Person> personList = new ArrayList<>();

    public void inputStudent() {
        System.out.print("-Enter Number Student : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            student.inputStudent();
            personList.add(student);
        }
    }

    public void inputProfessor() {
        System.out.println("-Enter Number Professor : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Professor " + (i + 1));
            professor.inputProfessor();
            personList.add(professor);
        }
    }

    public void displayAll() {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }

    public void average() {
        float sum = 0;
        int index = 0;
        for (int i = 0; i < personList.size(); i++) {
            sum += (professor.getRank() + student.getRank());
            index++;
        }
        System.out.println("-Average Rank : " + (sum / index));
    }
    public void maxRank(){
        int max = 0;
    }
}
