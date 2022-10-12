package DTU.BTHinh;

import java.util.Scanner;

class Triangle extends Figure {

    Scanner scanner = new Scanner(System.in);

    public final double pi = 3.14f;
    private String code;
    private double radius;


    public String getCodeTriangle() {
        return code;
    }

    public void setCodeTriangle(String codeTriangle) {
        this.code = codeTriangle;
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

    public void input() {
        super.input();
        System.out.print("- Enter Radius : ");
        this.radius = scanner.nextDouble();
        scanner.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("\t - Radius : " + this.radius);
    }
}
