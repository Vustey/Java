package DTU.BTHinh;

import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FigureList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Figure> figureList = new ArrayList<>();

    int n;
    boolean check = true;
    void input() {
        System.out.print("- Enter Number Figure : ");
        n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("\t Rectangle(R) or Triangle(T) : ");
            String choose = scanner.nextLine();
            if (choose.equals("R") || choose.equals("r")) {
                Rectangle rec = new Rectangle();
                rec.input();
                figureList.add(rec);
            } else if (choose.equals("T") || choose.equals("t")) {
                Triangle tri = new Triangle();
                tri.input();
                figureList.add(tri);
            }
        }
    }

    void display() {
        System.out.println("\nList of Figure");
        for (int i = 0; i < figureList.size(); i++) {
            System.out.println("-The Figure " + (i + 1));
            figureList.get(i).display();
        }
    }

    void removeFigure() {
        display();
        System.out.println("\nRemove Figure");
        System.out.print("- Enter CodeFigure Remove : ");
        String chooseCode = scanner.nextLine();
        for (int i = 0; i < figureList.size(); i++) {
            if (chooseCode.equals(figureList.get(i).getCode())) {
                figureList.remove(i);
                display();
                break;
            } else {
                check = false;
            }
        }
        if (check == false) {
            System.out.println("Not Found");
        }
    }

    void findFigure() {
        System.out.println("\nFind Figure");
        System.out.print("- Enter CodeFigure Find : ");
        String chooseCode = scanner.nextLine();
        for (int i = 0; i < figureList.size(); i++) {
            if (chooseCode.equals(figureList.get(i).getCode())) {
                Figure figure = figureList.get(i);
                figure.display();
            } else {
                check = false;
            }
        }
        if (check == false) {
            System.out.println("Not Found");
        }
    }

    void sortFigureByArea() {
        System.out.println("\nSort Figure By Area");
        for (int i = 0; i < figureList.size() + 1; i++) {
            for(int j = i+1 ;j <figureList.size();j++){
                if(figureList.get(i).area()<figureList.get(j).area()){
                    Figure tmp = figureList.get(i);
                    figureList.set(i,figureList.get(j));
                    figureList.set(j,tmp);
                }
            }
        }
        display();
    }

    void sortFigureByPerimeter() {
        System.out.println("\nSort Figure By Perimeter");
//        for (int i = 0; i < figureList.size() + 1; i++) {
//            for(int j = i+1 ;j <figureList.size();j++){
//                if(figureList.get(i).perimeter()<figureList.get(j).perimeter()){
//                    Figure tmp = figureList.get(i);
//                    figureList.set(i,figureList.get(j));
//                    figureList.set(j,tmp);
//                }
//            }
//        }
//        display();

//        for(int i = 0 ;i<figureList.size();i++){
//            Collections.sort(figureList, new Comparator<Figure>() {
//                @Override
//                public int compare(Figure o1, Figure o2) {
//                    return o1.area()<o2.area() ? 1 : -1;
//                }
//            });
//        }
//        display();

        for(int i = 0 ;i<figureList.size();i++){
           Collections.sort(figureList,Comparator.comparing(Figure::area));
        }
        display();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FigureList figure = new FigureList();
        while (true){
            System.out.println("\t\tFIGURE");
            System.out.println("\t1. Input Figure");
            System.out.println("\t2. Display Figure");
            System.out.println("\t3. Find Figure");
            System.out.println("\t4. Sort Figure By Area");
            System.out.println("\t5. Sort Figure By Perimeter");
            System.out.println("\t6. Remove Figure");
            System.out.println("\t7. Exit");
            System.out.print("- Enter choose : ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:{
                    figure.input();
                    break;
                }
                case 2:{
                    figure.display();
                    break;
                }
                case 3:{
                    figure.findFigure();
                    break;
                }
                case 4:{
                    figure.sortFigureByArea();
                    break;
                }
                case 5:{
                    figure.sortFigureByPerimeter();
                    break;
                }
                case 6:{
                    figure.removeFigure();
                    break;
                }
                case 7:{
                    System.out.println("BYEE");
                    System.exit(0);
                }
            }
        }
    }
}
