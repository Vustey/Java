import java.util.Scanner;

public class Q8 {
    static int reverse_num(int n){
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        int result= reverse_num(n);
        System.out.println(result);
    }
}
