package Question_10102022;

import java.util.*;

public class KhachHangVietNam extends KhachHang {
	private String type;
	private double quota;
	public double tmpThanhtien = 0;
	Scanner scanner = new Scanner(System.in);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getQuota() {
		return quota;
	}

	public void setQuota(double quota) {
		this.quota = quota;
	}

	public KhachHangVietNam() {

	}

	public KhachHangVietNam(String code, String name, String day, double amount, double unitPrice, String type,
			double quota) {
		super(code, name, day, amount, unitPrice);
		this.type = type;
		this.quota = quota;
	}

	@Override
	public double Tinhthanhtien() {
		if (getAmount() > this.quota) {
			tmpThanhtien = getAmount() * getUnitPrice();
		} else {
			tmpThanhtien = getAmount() * getUnitPrice() * getQuota() + ((getQuota() - getAmount()) * 2.5);
		}
		return tmpThanhtien;
	}

	public void input() {
		super.input();
		System.out.print("-Enter Type : ");
		this.type = scanner.nextLine();
		System.out.print("-Enter Quota : ");
		this.quota = scanner.nextDouble();
		scanner.nextLine();
	}

	public void display() {
		super.display();
		System.out.println("\t+Type : " + type);
		System.out.println("\t+Quota : " + quota);
	}
}
