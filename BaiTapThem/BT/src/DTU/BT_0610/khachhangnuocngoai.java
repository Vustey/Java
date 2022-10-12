package DTU.BT_0610;

public class khachhangnuocngoai extends khachhang {
    private String quoctich;

    public khachhangnuocngoai(String makhachhang, String hoten, String ngaythangnamrahoadon, int soluong, float dongia, String quoctich) {
        super(makhachhang, hoten, ngaythangnamrahoadon, soluong, dongia);
        this.quoctich = quoctich;
    }
    public khachhangnuocngoai() {
    }
    public void nhapkhachnuocngoai() {
        super.nhap();
        System.out.print("-Nhập quốc tịch : ");
        this.quoctich = scanner.nextLine();
    }
    public void xuat() {
        super.xuat();
        System.out.println("-Quốc tịch : " + quoctich);
    }
    double thanhtien = 0;
    @Override
    public double tinhthanhtien() {
        thanhtien = getSoluong()*getDongia();
        return thanhtien;
    }
}
