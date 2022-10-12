package Question_10102022;

import java.util.*;

public class DsKhachHang {
	Scanner scanner = new Scanner(System.in);
	public int n;
	ArrayList<KhachHang> customerList = new ArrayList<>();

	void input() {
		System.out.print("-The number Customer : ");
		n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("\t-Vietnamese Customers(VC) or Foreign customers(FC) : ");
			String choose = scanner.nextLine();
			if (choose.equals("VC") || choose.equals("vc")) {
				KhachHangVietNam khvn = new KhachHangVietNam();
				khvn.input();
				customerList.add(khvn);
			} else if (choose.equals("FC") || choose.equals("fc")) {
				KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
				khnn.input();
				customerList.add(khnn);
			}
		}
	}

	void display() {
		System.out.println("\n\t\t Customer List ");
		for (int i = 0; i < customerList.size(); i++) {
			System.out.println("-The Customer " + (i + 1));
			customerList.get(i).display();
		}
	}

	void findCode() {
		System.out.println("\n\t\t Find Customer ");
		System.out.print("-Enter Find Code : ");
		String newCode = scanner.nextLine();
		boolean check = true;
		for (int i = 0; i < customerList.size(); i++) {
			if (newCode.equals(customerList.get(i).getCode())) {
				customerList.get(i).display();
			} else {
				check = false;
			}
		}
		if (check = false) {
			System.out.println("No Find Customer!!!");
		}
	}

	void updateName() {
		System.out.println("\n\t\t Update Name");
		display();
		System.out.print("-Enter Customer Code : ");
		String newCode = scanner.nextLine();
		for (int i = 0; i < customerList.size(); i++) {
			if (newCode.equals(customerList.get(i).getCode())) {
				System.out.print("\t-Enter New Name : ");
				String newName = scanner.nextLine();
				KhachHang edit = customerList.get(i);
				edit.setName(newName);
				System.out.println("\tSuccessful customer update");
				edit.display();
			}
		}
	}

	void removeCustomer() {
		System.out.println("\n\t\t Remove Customer");
		System.out.print("-Enter Code Customer Remove : ");
		String removeCode = scanner.nextLine();
		for (int i = 0; i < customerList.size(); i++) {
			if (removeCode.equals(customerList.get(i).getCode())) {
				customerList.remove(i);
			}
		}
		System.out.println("\tSuccessful Remove");
		display();
	}

	void sortCustomer() {
		System.out.println("\n\t\t Sort Customer");
//		Collections.sort(customerList,Comparator.comparing(KhachHang::ITienDien));
		customerList.sort(C);
	}
	
	public static void main(String[] args) {
		DsKhachHang cusList = new DsKhachHang();
		cusList.input();
		cusList.display();
		cusList.findCode();
		cusList.updateName();
		cusList.removeCustomer();
		cusList.sortCustomer();
	}
}
