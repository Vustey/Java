import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter n :");
        int n = scanner.nextInt();
        if(n==1){
            System.out.printf("Chủ nhật");
        }else if(n==2){
            System.out.printf("Thứ hai");
        } else if (n==3) {
            System.out.printf("Thứ ba");
        } else if (n==4) {
            System.out.printf("Thứ tư");
        } else if (n==5) {
            System.out.printf("Thứ năm");
        } else if (n==6) {
            System.out.printf("Thứ sáu");
        } else if (n==7) {
            System.out.printf("Thứ bảy");
        } else if (n>7) {
            System.out.printf("Không có thứ này");
        }
    }
}
