import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter n :");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(count==0){
            System.out.printf("La so nguyen to");
        }else{
            System.out.printf("Khong phai la so nguyen to");
        }
    }
}
