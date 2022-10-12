package Question_10102022;

import java.util.*;

public class KhachHangNuocNgoai extends KhachHang {
	private String nationality;
	Scanner scanner = new Scanner(System.in);

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public KhachHangNuocNgoai() {

	}

	public KhachHangNuocNgoai(String code, String name, String day, double amount, double unitPrice,
			String nationality) {
		super(code, name, day, amount, unitPrice);
		this.nationality = nationality;
	}

	@Override
	public double Tinhthanhtien() {
		return getAmount() * getUnitPrice();
	}

	public void input() {
		super.input();
		System.out.print("-Enter Nationality : ");
		this.nationality = scanner.nextLine();
	}

	public void display() {
		super.display();
		System.out.println("\t+Nationality : " + nationality);
	}
}
