package Gym;

import java.util.Scanner;

public class Member {
    private String name;
    private String lastname;
    private String memNo;
    private String memType;
    private String contract;
    private String sex;
    private String birthday;
    private String startday;
    private String country;


    public Member(String name, String lastname, String memNo, String memType, String contract, String sex, String birthday, String startday, String country) {
        this.name = name;
        this.lastname = lastname;
        this.memNo = memNo;
        this.memType = memType;
        this.contract = contract;
        this.sex = sex;
        this.birthday = birthday;
        this.startday = startday;
        this.country = country;
    }

    public Member() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo;
    }

    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
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

    public void setBirthday(String birirthday) {
        this.birthday = birthday;
    }

    public String getStartday() {
        return startday;
    }

    public void setStartday(String startday) {
        this.startday = startday;
    }

    public String getCountry() {return country;}

    public void setCountry(String country) {this.country = country;}

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t + Enter Name : ");
        setName(scanner.nextLine());
        System.out.print("\t + Enter LastName : ");
        setLastname(scanner.nextLine());
        System.out.print("\t + Enter Birthday : ");
        setBirthday(scanner.nextLine());
        System.out.print("\t + Enter Country : ");
        setCountry(scanner.nextLine());
        System.out.print("\t + Enter Sex : ");
        setSex(scanner.nextLine());
        System.out.print("\t + Enter Start Day : ");
        setStartday(scanner.nextLine());
        System.out.print("\t + Enter Membership No. : ");
        setMemNo(scanner.nextLine());
        System.out.print("\t + Enter Membership Type : ");
        setMemType(scanner.nextLine());
        System.out.print("\t + Enter Contract No. : ");
        setContract(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "\t\t + Fullname : " + lastname + " " + name +
                "\n\t\t + Birthday : " + birthday +
                "\n\t\t + Sex : " + sex +
                "\n\t\t + Country : " + country +
                "\n\t\t + Membership No. : " + memNo +
                "\n\t\t + Start Day : " + startday +
                "\n\t\t + Membership Type : " + memType +
                "\n\t\t + Contract No. : " + contract;
    }
}
