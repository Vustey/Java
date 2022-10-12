package P_Student;

import java.util.Arrays;

public class Teacher {
    Teacher t[];

    @Override
    public String toString() {
        return "Teacher{" +
                "t=" + Arrays.toString(t) +
                ", Id=" + Id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                '}';
    }

    private int Id;
    private String name;
    private String sex;
    private String birthday;
    private String country;
    private float salary;

    public Teacher(int id, String name, String sex, String birthday, String country, float salary) {
        Id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.country = country;
        this.salary = salary;
    }

    public Teacher(){

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
