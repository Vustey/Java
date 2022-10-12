package ClassOfStudent;

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

}
