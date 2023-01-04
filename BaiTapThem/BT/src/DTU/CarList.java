package ontap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CarList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Car> carList = new ArrayList<>();

    public void input() {
        System.out.print("Enter Number Car : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            Car car = new Car();
            System.out.println("Car " + (i + 1));
            car.input();
            carList.add(car);
        }
    }

    public void output() {
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).output();
        }
    }

    public void sortBypriceWithVAT() {
        System.out.println("\t\t\t Sort By Price With VAT");
// Cach 1
//        for (int i = 0; i < carList.size() + 1; i++) {
//            for (int j = i + 1; j < carList.size(); j++) {
//                if (carList.get(i).getPricewithVAT()>carList.get(j).getPricewithVAT()){
//                    Car tmp = carList.get(i);
//                    carList.set(i,carList.get(j));
//                    carList.set(j,tmp);
//                }
//            }
//        }
//        output();
//
//      Cach 2
        for (int i = 0; i < carList.size(); i++) {
            Collections.sort(carList, Comparator.comparing(Car::getPricewithVAT));
        }
        output();
    }

    public void sumOfCash() {
        System.out.println("\t\t\t Sum Of Cash");
        float sum = 0;
        for (int i = 0; i < carList.size(); i++) {
            sum = sum + carList.get(i).cash();
        }
        System.out.println(sum);
    }

    public void maxCash() {
        float max = 0;
        int tmp = 0;
        for (int i = 0; i < carList.size(); i++) {
            if(max < carList.get(i).getPricewithoutVAT()){
                max = carList.get(i).getPricewithoutVAT();
                tmp = i;
            }
        }
        System.out.println("\t\t\t Information of the cars that have highest Price Without VAT");
        carList.get(tmp).output();
    }
}
