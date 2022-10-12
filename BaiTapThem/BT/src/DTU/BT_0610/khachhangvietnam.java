package DTU.BT_0610;

import java.util.Scanner;

public class khachhangvietnam extends khachhang {
    private String doituongkhachhang;
    private int dinhmuc;
    Scanner scanner = new Scanner(System.in);

    public khachhangvietnam(String makhachhang, String hoten, String ngaythangnamrahoadon, int soluong, float dongia, String doituongkhachhang, int dinhmuc) {
        super(makhachhang, hoten, ngaythangnamrahoadon, soluong, dongia);
        this.doituongkhachhang = doituongkhachhang;
        this.dinhmuc = dinhmuc;
    }

    public khachhangvietnam() {

    }

    public String getDoituongkhachhang() {
        return doituongkhachhang;
    }

    public void setDoituongkhachhang(String doituongkhachhang) {
        this.doituongkhachhang = doituongkhachhang;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    double thanhtien = 0;

    public void nhapkhachhangvietnam() {
        super.nhap();
        System.out.print("-Nhập đối tượng khách hàng : ");
        this.doituongkhachhang = scanner.nextLine();
        System.out.print("-Nhập định mức : ");
        this.dinhmuc = scanner.nextInt();
        scanner.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("-Đối tượng khách hàng : " + this.doituongkhachhang);
        System.out.println("-Định mức : " + this.dinhmuc);
    }
    @Override
    public double tinhthanhtien() {
        if (getSoluong() <= this.dinhmuc) {
            thanhtien = getSoluong() * getDongia();
        } else {
            thanhtien = (getSoluong() * getDongia() * dinhmuc) + ((getSoluong() - dinhmuc) * getDongia() * 2.5);
        }
        return thanhtien;
    }
}
