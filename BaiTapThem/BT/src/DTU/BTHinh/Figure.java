package DTU.BTHinh;

import java.util.Scanner;

interface IFigure{
    double area();
    double perimeter();
}
abstract class Figure implements IFigure{
    private String code ;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

     public void input(){
         System.out.print("- Enter Code : ");
         Scanner scanner = new Scanner(System.in);
         code = scanner.nextLine();
     }

    public void display(){
        System.out.println("\t - Code : "+ this.code);
    }

}
