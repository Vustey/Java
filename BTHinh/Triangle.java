package DTU.BTHinh;

import java.util.Scanner;

public class Triangle extends Figure {

    Scanner scanner = new Scanner(System.in);

    public final double pi = 3.14f;
    private String codeTriangle;
    private double radius;


    public String getCodeTriangle() {
        return codeTriangle;
    }

    public void setCodeTriangle(String codeTriangle) {
        this.codeTriangle = codeTriangle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    void input() {
        System.out.print("- Enter Code Triangle : CT_" + this.codeTriangle);
        this.codeTriangle = scanner.nextLine();
        System.out.print("- Enter Radius : ");
        this.radius = scanner.nextDouble();
        scanner.nextLine();
    }

    void display() {
        System.out.println("\t - Code Triangle : CT_" + this.codeTriangle);
        System.out.println("\t - Radius : " + this.radius);
    }
}
