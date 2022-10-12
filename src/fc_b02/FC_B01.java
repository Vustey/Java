package fc_b02;
import java.util.Scanner;
public class FC_B01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.print("Nhap so 1 :");
		Scanner kb=new Scanner(System.in);
		a = kb.nextInt();
		System.out.print("Nhap so 2 :");
		Scanner k=new Scanner(System.in);
		b = k.nextInt();
		int tong =a+b;
		int hieu=a-b;
		float chia=(float)a/b;
		int nhan=a*b;
		System.out.println("Tong : "+tong);
		System.out.println("Hieu : "+hieu);
		System.out.println("Nhan : "+nhan);
		System.out.printf("Chia : %.4f",chia);
	}
}
