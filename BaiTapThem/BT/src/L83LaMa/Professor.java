package L83LaMa;

import java.util.Scanner;

public class Professor extends Person{
    private String deparment;

    public Professor(String code, String name, int rank, String deparment) {
        super(code, name, rank);
        this.deparment = deparment;
    }

    public Professor() {
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
                des = "Assistant Professor";
                break;
            }
            case 2:{
                des = "Associate Professor";
                break;
            }
            case 3:{
                des = "Professor";
                break;
            }
            case 4:{
                des = "Assistant Teaching Professor";
                break;
            }
            case 5:{
                des = "Associate Teaching Professor";
                break;
            }
            case 6:{
                des = "Teaching Professor";
            }
        }
        return des;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
    public void displayProfessor(){
        display();
        System.out.println("-Deparment : "+deparment);
    }
    public void inputProfessor(){
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("-Enter Deparment : ");
        deparment = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Professor{" +
                "deparment='" + deparment + '\'' +
                ", des='" + des + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}
