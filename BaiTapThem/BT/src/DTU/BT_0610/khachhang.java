package DTU.BT_0610;

import java.util.Scanner;

interface Itiendien {
     double tinhthanhtien();
}

public abstract class khachhang implements Itiendien {
    private String makhachhang;
    private String hoten;
    private String ngaythangnamrahoadon;
    private int soluong;
    private float dongia;
    Scanner scanner = new Scanner(System.in);

    public khachhang(String makhachhang, String hoten, String ngaythangnamrahoadon, int soluong, float dongia) {
        this.makhachhang = makhachhang;
        this.hoten = hoten;
        this.ngaythangnamrahoadon = ngaythangnamrahoadon;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public khachhang() {
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaythangnamrahoadon() {
        return ngaythangnamrahoadon;
    }

    public void setNgaythangnamrahoadon(String ngaythangnamrahoadon) {
        this.ngaythangnamrahoadon = ngaythangnamrahoadon;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    @Override
    public double tinhthanhtien() {
        return 0;
    }

    public void nhap() {
        System.out.print("-Nhập họ và tên khách hàng : ");
        this.hoten = scanner.nextLine();
        System.out.print("-Nhập mã khách hàng : ");
        this.makhachhang = scanner.nextLine();
        System.out.print("-Nhập ngày tháng năm ra hóa đơn : ");
        this.ngaythangnamrahoadon = scanner.nextLine();
        System.out.print("-Nhập số lượng : ");
        this.soluong = scanner.nextInt();
        scanner.nextLine();
        System.out.print("-Nhập đơn giá : ");
        this.dongia = scanner.nextFloat();
        scanner.nextLine();
    }

    public void xuat() {
        System.out.println("-Họ và tên : " + this.hoten);
        System.out.println("-Mã khách hàng : " + this.makhachhang);
        System.out.println("-Ngày tháng năm ra hóa đơn : " + this.ngaythangnamrahoadon);
        System.out.println("-Số lượng : " + this.soluong);
        System.out.println("-Đơn giá : " + this.dongia);
    }
}
