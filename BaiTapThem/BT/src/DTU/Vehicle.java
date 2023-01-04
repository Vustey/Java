package ontap;

import java.util.Scanner;

public abstract class Vehicle {
    private String numberSign;
    private String color;
    private String source;

    public Vehicle(String numberSign, String color, String source) {
        this.numberSign = numberSign;
        this.color = color;
        this.source = source;
    }

    public Vehicle() {
    }

    public String getNumberSign() {
        return numberSign;
    }

    public void setNumberSign(String numberSign) {
        this.numberSign = numberSign;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public abstract float cash();

    Scanner scanner = new Scanner(System.in);
    public void input(){
        System.out.print("Enter Number Sign : ");
        numberSign = scanner.nextLine();
        System.out.print("Enter Color : ");
        color = scanner.nextLine();
        System.out.print("Enter Source : ");
        source = scanner.nextLine();
    }
    public void output(){
        System.out.println("Number Sign : " + numberSign);
        System.out.println("Color : " + color);
        System.out.println("Source : " + source);
    }

//    @Override
//    public String toString() {
//        return "Vehicle{" +
//                "numberSign='" + numberSign + '\'' +
//                ", color='" + color + '\'' +
//                ", source='" + source + '\'' +
//                '}';
//    }
}
