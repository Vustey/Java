package ontap;

public class Car extends Vehicle{
    private String manufacturer;
    private float pricewithVAT;
    private float pricewithoutVAT;

    public Car(String numberSign, String color, String source, String manufacturer, float pricewithVAT, float pricewithoutVAT) {
        super(numberSign, color, source);
        this.manufacturer = manufacturer;
        this.pricewithVAT = pricewithVAT;
        this.pricewithoutVAT = pricewithoutVAT;
    }

    public Car() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPricewithVAT() {
        return pricewithVAT;
    }

    public float setPricewithVAT(float pricewithVAT) {
        this.pricewithVAT = pricewithVAT;
        return pricewithVAT;
    }

    public float getPricewithoutVAT() {
        return pricewithoutVAT;
    }

    public void setPricewithoutVAT(float pricewithoutVAT) {
        pricewithoutVAT = pricewithoutVAT;
    }


    @Override
    public float cash() {
        if(getPricewithoutVAT() <= 2.000){
            setPricewithVAT(getPricewithoutVAT() + getPricewithoutVAT() * 10/100) ;
        }else {
            setPricewithVAT(getPricewithoutVAT() + getPricewithoutVAT() * 15/100) ;
        }
        return setPricewithVAT(getPricewithVAT());
    }

    public void input(){
        super.input();
        System.out.print("Enter Manufacturer : ");
        manufacturer = scanner.nextLine();
        System.out.print("Enter PricewithVAT : ");
        pricewithVAT = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Enter PricewithoutVAT : ");
        pricewithoutVAT = scanner.nextFloat();
        scanner.nextLine();
    }
    public void output(){
        super.output();
        System.out.println("Manufacturer : "+ manufacturer);
        System.out.println("PricewithVAT : "+ pricewithVAT);
        System.out.println("PricewithoutVAT : "+pricewithoutVAT);
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "manufacturer='" + manufacturer + '\'' +
//                ", pricewithVAT=" + pricewithVAT +
//                ", pricewithoutVAT=" + pricewithoutVAT +
//                '}';
//    }
}
