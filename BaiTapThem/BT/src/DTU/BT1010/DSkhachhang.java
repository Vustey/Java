package DTU.BT1010;

import java.util.ArrayList;
import java.util.Scanner;

interface Itiendien {
    double tinhthanhtien();
    // ở đây dùng double vì mình tính cái thành tiền rồi hắn trả lại vào cái này
    // nếu mi dùng void tính rồi hắn k trả về mà ở đây thành null
}

abstract class khachhang implements Itiendien {
    protected String id, name, date;
    protected float slKW, price;
    Scanner sc = new Scanner(System.in);

    public khachhang(String id, String name, String date, float slKW, float price) {
        super();
        this.id = id;
        this.name = name;
        this.date = date;
        this.slKW = slKW;
        this.price = price;
    }

    public khachhang() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getSlKW() {
        return slKW;
    }

    public void setSlKW(float slKW) {
        this.slKW = slKW;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void input() {
        System.out.print("\nnhap ten: ");
        name = sc.nextLine();
        System.out.print("\nnhap ma khach hang:");
        id = sc.nextLine();
        System.out.print("\nngay ra hoa don:");
        date = sc.nextLine();
        System.out.print("\nso luong KW tieu thu:");
        slKW = sc.nextFloat();
        sc.nextLine();
        System.out.print("\ndon gia: ");
        price = sc.nextFloat();
        sc.nextLine();
    }

    public void output() {
        System.out.println("ten: " + name);
        System.out.println("ma khach hang:" + id);
        System.out.println("ngay ra hoa don: " + date);
        System.out.println("so KW: " + slKW);
        System.out.println("don gia: " + price);
    }
}

class KhachhangVietNam extends khachhang {
    String dtkh;
    float dinhmuc;

    public KhachhangVietNam(String id, String name, String date, float slKW, float price, String dtkh, float dinhmuc) {
        super(id, name, date, slKW, price);
        this.dtkh = dtkh;
        this.dinhmuc = dinhmuc;
    }

    public KhachhangVietNam() {
        super();
        // TODO Auto-generated constructor stub
    }

    public KhachhangVietNam(String id, String name, String date, float slKW, float price) {
        super(id, name, date, slKW, price);
        // TODO Auto-generated constructor stub
    }

    public String getDtkh() {
        return dtkh;
    }

    public void setDtkh(String dtkh) {
        this.dtkh = dtkh;
    }

    public float getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(float dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    Scanner sc = new Scanner(System.in);

    public void input() {
        super.input();
        System.out.print("\nnhap doi tuong khach hang: ");
        dtkh = sc.nextLine();
        System.out.print("\nnhap dinh muc: ");
        dinhmuc = sc.nextFloat();
        sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("doi tuong khach hang: " + dtkh);
        System.out.println("dinh muc: " + dinhmuc);
    }

    double tt=0;
    @Override
    public double tinhthanhtien() {

        if (getSlKW() <= dinhmuc) {
            tt = getSlKW() * getPrice();
        } else
            tt = getSlKW() * getPrice() * dinhmuc + (getSlKW() - dinhmuc) * 2.5 * getPrice();
        System.out.println("thanh tien: " + tt);
        return tt;
    }
}

class Khachhangnuocngoai extends khachhang {
    String quoctich;

    public Khachhangnuocngoai(String id, String name, String date, float slKW, float price, String quoctich) {
        super(id, name, date, slKW, price);
        this.quoctich = quoctich;
    }


    public Khachhangnuocngoai() {
    }


    public Khachhangnuocngoai(String id, String name, String date, float slKW, float price) {
        super(id, name, date, slKW, price);
    }


    public String getQuoctich() {
        return quoctich;
    }


    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    Scanner sc = new Scanner(System.in);

    public void input() {
        super.input();
        System.out.print("\nnhap quoc tich: ");
        quoctich = sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("quoc tich: " + quoctich);
    }

    double t =0;
    @Override
    public double tinhthanhtien() {
        t = getSlKW() * getPrice();
        System.out.println("thanh tien: " + t);
        return  t;
    }
}

class list {
    ArrayList<khachhang> k = new ArrayList<>();
    KhachhangVietNam v = new KhachhangVietNam();
    Khachhangnuocngoai n = new Khachhangnuocngoai();

    int b;
    Scanner sc = new Scanner(System.in);
    int dem = 0;

    void input() {
        System.out.println("nhap so luong khach hang:");
        b = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < b; i++) {
            System.out.println("trong nuoc hay ngoai nuoc (1/0):");
            int chon = sc.nextInt();
            sc.nextLine();
            if (chon == 1) {
                v.input();
                k.add(v);
            } else {
                n.input();
                k.add(n);
            }
        }
    }

    void output() {
        System.out.println("\n\nThong tin khach hang");
        for (int i = 0; i < k.size(); i++) {
            System.out.println("STT:" + (i + 1));
            k.get(i).output();
        }
    }

    public khachhang find() {
        System.out.println("\n\n");
        System.out.print("nhap ma khach hang muon tim: ");
        String tmp = sc.nextLine();
        for (int i = 0; i < k.size(); i++) {
            if (tmp.compareTo(k.get(i).getId()) == 0) {
                k.get(i).output();
            } else {
                dem++;
            }
        }
        if (dem == 0)
            System.out.println("khong co khach hang can tim.");
    }

    void capnhap() {
        System.out.println("\n\n");
        KhachhangVietNam khachhang = new KhachhangVietNam();
//        find(); Xuất cái hàm output ra cho họ chọn chớ tìm biết ai sai đâu mà chọn
//        if (dem == 0) {
//        } else {
//            System.out.print("Nhập tên muốn sửa :");
//            String tenmoi = sc.nextLine();
//            khachhang.setName(tenmoi);
//            System.out.println("Tên đã đổi thành " + khachhang.getName());
//        }
//        DTU.BT1010.khachhang kh = new KhachhangVietNam();
        // khachhang kh = new KhachhangVietNam() or new Khachhangnuocngoai() vẫn được vì đây mình chỉ dùng xuất
        // thông tin ra thôi. Và cái name ở chung class khachhang nên có đủ
        // khai báo khachhang vì đây có tên khách,
//        System.out.println("Thông tin khách hàng");
//        output();
//        System.out.print("-Nhập mã khách hàng muốn chọn : ");
//        String choose = sc.nextLine();
//        int check = 0;
//        for (int i = 0; i < k.size(); i++) {
//            if (choose.equals(k.get(i).getId())) {
//                check = 0;
//                kh = k.get(i);
//                break;
//            } else {
//                check++;
//            }
//        }
//        if (check != 0) {
//            System.out.println("Không có thông tin khách hàng tìm kiếm");
//        } else {
//            System.out.println("Thông tin khách hàng cần cập nhập");
//            kh.output();
//            System.out.print("Nhập tên cần sửa lại :");
//            String newName = sc.nextLine();
//            kh.setName(newName);
//            System.out.println("Thông tin khách hàng đã cập nhập");
//            kh.output();
//        }
//        System.out.println("\n\n");
//        output();
//        find();
//        khachhang kh = new KhachhangVietNam();
//        String newname;
//        System.out.println("nhap ten moi: ");
//        newname=sc.nextLine();
//        kh.setName(newname);
//        System.out.println("thong tin cap nhat:");
//        kh.output();
        khachhang khachhang1 = find();

    }

    public void sort() {
        System.out.println("\n\n");
        for (int i = 0; i < k.size() + 1; i++) {
            for (int j = i + 1; j < k.size(); j++){
                // Cái ban đầu của m lỗi chỗ if vì do tinhthanhtien() ở hàm void nên hắn k trỏ tới được, lên dòng 9 đọc tiếp
                if(k.get(i).tinhthanhtien()<k.get(j).tinhthanhtien()){
                    khachhang tmp = k.get(i);
                    k.set(i,k.get(j));
                    k.set(j,tmp);
                }
            }
        }
        output();
    }
}

public class DSkhachhang {
    public static void main(String[] args) {
        list l = new list();
        l.input();
        l.output();
        l.find();
        l.capnhap();
        l.sort();
    }
}
