package DTU.L82LaMa;

import java.util.Scanner;

public class Bill {
    private String code;
    private String type;
    private double oldindex;
    private double newindex;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getOleindex() {
        return oldindex;
    }

    public void setOleindex(double oleindex) {
        this.oldindex = oleindex;
    }

    public double getNewindex() {
        return newindex;
    }

    public void setNewindex(double newindex) {
        this.newindex = newindex;
    }

    public Bill(String code, String type, double oldindex, double newindex) {
        this.code = code;
        this.type = type;
        this.oldindex = oldindex;
        this.newindex = newindex;
    }

    public Bill() {

    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Enter Code : ");
        code = scanner.nextLine();
        System.out.print("-Enter Type : ");
        type = scanner.nextLine();
        System.out.print("-Enter Old Index : ");
        oldindex = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("-Enter New Index : ");
        newindex = scanner.nextDouble();
        scanner.nextLine();
    }

    public int price() {
        if (type.equals("Resident")) {
            return 500;
        } else if (type.equals("Business") || type.equals("Organization")) {
            return 400;
        } else {
            return 300;
        }
    }

    public double payment() {
        return price() * (newindex - oldindex);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", oldindex=" + oldindex +
                ", newindex=" + newindex +
                '}';
    }
}
