package DTU.L82LaMa;

import java.util.ArrayList;
import java.util.Scanner;

public class BillList {
    Scanner scanner = new Scanner(System.in);
    Bill bill = new Bill();
    private ArrayList<Bill> billsList = new ArrayList<>();

    public void input() {
        System.out.print("-Enter n : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Bill " + (i + 1));
            bill.input();
            billsList.add(bill);
        }
    }

    public void total() {
        double result = 0;
        for (int i = 0; i < billsList.size(); i++) {
            result += bill.payment();
        }
        System.out.println("-The total paymet : " + result);
    }
    public void output(){
        for(int i = 0;i < billsList.size();i++){
            System.out.println(billsList.get(i));
        }
    }
    public void remove() {
        scanner.nextLine();
        System.out.print("-Enter code remove : ");
        String code = scanner.nextLine();
        for (int i = 0; i < billsList.size(); i++) {
            if (bill.getCode().equals(code)) {

            }
        }
        output();
    }

    public void maxPayment() {
        double max = 0;
        for (int i = 0; i < billsList.size(); i++) {
            if (max < bill.payment()) {
                max = bill.payment();
            }
        }
        System.out.println("-Max Payment : " + max);
    }
}
