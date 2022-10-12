package ArrayList_Student;

import java.util.Scanner;

public class Student {
    private String name;
    private String lastname;
    private String country;
    private float dtb;

    public Student(){
    }

    public Student(String name,String lastname, String country, float dtb) {
        this.name = name;
        this.lastname = lastname;
        this.country = country;
        this.dtb = dtb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    void Input_Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t + Enter Name : ");
        setName(scanner.nextLine());
        System.out.print("\t + Enter Last Name : ");
        setLastname(scanner.nextLine());
        System.out.print("\t + Enter Country : ");
        setCountry(scanner.nextLine());
        System.out.print("\t + Enter Average : ");
        setDtb(scanner.nextFloat());
    }
    void Output_Student(){
//        System.out.println("\t Fullname : " + getLastname()+" "+getName()+ " || Country : " +
//                getCountry() + " || Average : " + getDtb());
    }

    @Override
    public String toString() {
        return "\t + Fullname : " + lastname +" "+ name  +
                " || Country : " + country +
                "|| Average : " + dtb +"\n";
    }
}
