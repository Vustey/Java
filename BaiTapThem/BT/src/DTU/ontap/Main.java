package ontap;

public class Main {
    public static void main(String[] args) {
        CarList carList = new CarList();
        carList.input();
        carList.output();
        carList.sortBypriceWithVAT();
        carList.sumOfCash();
        carList.maxCash();
    }
}
