package Test;
import java.io.*;
import java.util.Scanner;

public class Student implements Serializable {
    private String name;
    private String country;
    private Double age;

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

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Student(String name, String country, Double age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public Student(){

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
