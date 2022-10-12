package DTU.BT_0610;

import java.util.ArrayList;
import java.util.Scanner;

public class dskhachhang {
    khachhang[] k;
    khachhangvietnam[] kvn = new khachhangvietnam[10000];
    khachhangnuocngoai[] knn = new khachhangnuocngoai[10000];
    ArrayList<khachhang> kh = new ArrayList<>();
    public int n;
    Scanner scanner = new Scanner(System.in);

    public void nhapds() {
        System.out.print("Nhập số lượng khách hàng : ");
        n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            khachhangnuocngoai knn = new khachhangnuocngoai();
            khachhangvietnam kvn = new khachhangvietnam();
            System.out.print("Khách Việt Nam (KVN) || Khách nước ngoài (KNN) : ");
            String chon = scanner.nextLine();
            if (chon.equals("KVN") || chon.equals("kvn")) {
                kvn.nhapkhachhangvietnam();
                kh.add(kvn);
            } else if (chon.equals("KNN") || chon.equals("knn")) {
                knn.nhapkhachnuocngoai();
                kh.add(knn);
            }
        }
    }

    public void xuatds() {
        System.out.println("\nThông tin khách hàng");
        for (int i = 0; i < kh.size(); i++) {
            System.out.println("Khách hàng " + (i + 1));
            kh.get(i).xuat();
        }
    }

    public void timkiem() {
        System.out.print("-Nhập mã khách hàng cần tìm kiếm : ");
        String chon = scanner.nextLine();
        System.out.println("\nThông tin khách hàng tim kiếm ");
        int dem = 0;
        for (int i = 0; i < kh.size(); i++) {
            if (chon.equals(kh.get(i).getMakhachhang())) {
                kh.get(i).xuat();
            } else {
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Không có khách hàng muốn tìm");
        }
    }
    public void capnhap(){
        khachhang khachhang = new khachhangvietnam();
        System.out.println("Nhập mã khách hàng cần cập nhập lại : ");
        String chon = scanner.nextLine();
        boolean check = true;
        for(int i =0 ;i<kh.size();i++){
            if(chon.equals(kh.get(i).getMakhachhang())){
                check = false;
                khachhang = kh.get(i);
                break;
            }
        }
        if(check){
            System.out.println("Không có mã khách hàng");
        }else{
            while (true){
                khachhang.xuat();
                System.out.print("Nhập tên muốn sửa :");
                String tenmoi = scanner.nextLine();
                khachhang.setHoten(tenmoi);
                System.out.println("Tên đã đổi thành "+khachhang.getHoten());
                break;
            }
        }
    }
    public void sort(){
        System.out.println("\nSắp xếp");
        for (int i = 0 ; i<kh.size()+1;i++){
            for(int j = i+1;j<kh.size();j++){
                if(kh.get(i).tinhthanhtien()>kh.get(j).tinhthanhtien()){
                    khachhang tmp = kh.get(i);
                    kh.set(i,kh.get(j));
                    kh.set(j,tmp);
                }
            }
        }
        xuatds();
    }

    public static void main(String[] args) {
        dskhachhang ds = new dskhachhang();
        ds.nhapds();
        ds.xuatds();
        ds.timkiem();
        ds.capnhap();
        ds.sort();
    }
}
