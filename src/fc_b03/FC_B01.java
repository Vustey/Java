package fc_b03;
import java.util.Scanner;
public class FC_B01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
		System.out.print("Nhap a:");
		Scanner kb=new Scanner(System.in);
		a=kb.nextInt();
		System.out.print("Nhap b:");
		Scanner ka=new Scanner(System.in);
		b=ka.nextInt();
		System.out.print("Nhap c:");
		Scanner kc=new Scanner(System.in);
		c=kc.nextInt();
		float m=a>b?a:b;
		float max=c>m?c:m;
//		if(a>b && a>c) {
//			max=a;
//		}else if( b>a && b>c) {
//			max=b;
//		}else if( c>a && c>b) {
//			max=c;
//		}
		System.out.println("So lon nhat la : "+ max);
	}

}
