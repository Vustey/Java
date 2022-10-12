package DTU.BTHinh;

import java.util.Scanner;

class Rectangle extends Figure {

    Scanner scanner = new Scanner(System.in);

    private double longs;
    private double width;


    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double area() {
        return this.longs * this.width;
    }

    @Override
    public double perimeter() {
        return (this.longs + this.width) / 2;
    }

    public void input() {
        super.input();
        System.out.print("- Enter Longs : ");
        this.longs = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("- Enter Width : ");
        this.width = scanner.nextDouble();
        scanner.nextLine();
    }

    public void display(){
        super.display();
        System.out.println("\t - Longs : " + this.longs);
        System.out.println("\t - Width : " + this.width);
    }
}
