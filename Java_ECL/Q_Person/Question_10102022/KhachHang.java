package Question_10102022;

import java.util.*;

interface ITienDien {
	double Tinhthanhtien();
}

public abstract class KhachHang implements ITienDien{
	private String code;
	private String name;
	private String day;
	private double amount;
	private double unitPrice;
	Scanner scanner = new Scanner(System.in);

	public double ITienDien() {
		return 0;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public KhachHang() {
		
	}

	public KhachHang(String code, String name, String day, double amount, double unitPrice) {
		this.code = code;
		this.name = name;
		this.day = day;
		this.amount = amount;
		this.unitPrice = unitPrice;
	}

	public void input() {
		System.out.print("-Enter Code : ");
		this.code = scanner.nextLine();
		System.out.print("-Enter Name : ");
		this.name = scanner.nextLine();
		System.out.print("-Enter Day : ");
		this.day = scanner.nextLine();
		System.out.print("-Enter Amount : ");
		this.amount = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("-Enter Unit Price : ");
		this.unitPrice = scanner.nextDouble();
		scanner.nextLine();
	}
	public void display() {
		System.out.println("\t+Code : " + this.code);
		System.out.println("\t+Name : " + this.name);
		System.out.println("\t+Day : " + this.day);
		System.out.println("\t+Amount : " + this.amount);
		System.out.println("\t+Unit Price : " + this.unitPrice);
	}
}
