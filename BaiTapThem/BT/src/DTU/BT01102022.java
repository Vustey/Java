package DTU;
interface printable{
    void print();
}
interface showable{
    void show();
}
class A implements printable,showable{
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        obj.show();
        printable p = new A();
        // Có thể tạo đối tượng từ implements
    }
}

