package L83LaMa;

import java.util.Scanner;

public class Student extends Person{
    private String degreeProgram;
    private int yearOfGraduation;

    public Student(String code, String name, int rank, String degreeProgram, int yearOfGraduation) {
        super(code, name, rank);
        this.degreeProgram = degreeProgram;
        this.yearOfGraduation = yearOfGraduation;
    }

    public Student(){

    }
    String des = "";
    @Override
    public String description() {
        switch (rank){
            case 0:{
                des = "None";
                break;
            }
            case 1:{
                des = "Freshman";
                break;
            }
            case 2:{
                des = "Sophomore";
                break;
            }
            case 3:{
                des = "Junior";
                break;
            }
            case 4:{
                des = "Senior";
                break;
            }
            case 5:{
                des = "Graduate";
                break;
            }
            case 6:{
                des = "Masters Postgraduate";
                break;
            }
            case 7:{
                des = "PhD Postgraduate";
                break;
            }
        }
        return des;
    }
    public void inputStudent(){
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("-Enter Degree Program : ");
        degreeProgram = scanner.nextLine();
        System.out.print("-Year Of Graduation : ");
        yearOfGraduation = scanner.nextInt();
        scanner.nextLine();
    }
    public void displayStudent(){
        display();
        System.out.println("-Degree Progaram : "+degreeProgram);
        System.out.println("-Year Of Graduation : "+yearOfGraduation);
    }

    @Override
    public String toString() {
        return "Student{" +
                "degreeProgram='" + degreeProgram + '\'' +
                ", yearOfGraduation=" + yearOfGraduation +
                ", des='" + des + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}
