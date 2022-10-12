package DTU.BTHinh;

import java.util.ArrayList;
import java.util.Scanner;

public class FigureList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Figure> figureList = new ArrayList<>();
    Rectangle rec = new Rectangle();
    Triangle tri = new Triangle();
    int n;

    void input() {
        System.out.print("- Enter Number Figure : ");
        n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("\t Rectangle(R) or Triangle(T) : ");
            String choose = scanner.nextLine();
            if (choose.equals("R") || choose.equals("r")) {
                rec.input();
                figureList.add(rec);
            } else if (choose.equals("T") || choose.equals("t")) {
                tri.input();
                figureList.add(tri);
            }
        }
    }

    void display() {
        for (int i = 0; i < figureList.size(); i++) {
            System.out.println("\t The Figure " + (i + 1));
            figureList.get(i).display();
        }
    }

    public static void main(String[] args) {
        FigureList figure = new FigureList();
        figure.input();
        figure.display();
    }
}
