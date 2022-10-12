package P_Student;

public class Student {
    Student s[];
    private int id;
    private String St_class;
    private String name;
    private String birthday;
    private String country;
    private float point;

    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSt_class() {
        return St_class;
    }

    public void setSt_class(String st_class) {
        St_class = st_class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(int id, String st_class, String name, String birthday, String country, float point, String sex) {
        this.id = id;
        St_class = st_class;
        this.name = name;
        this.birthday = birthday;
        this.country = country;
        this.point = point;
        this.sex = sex;
    }

    public Student() {
    }
}
