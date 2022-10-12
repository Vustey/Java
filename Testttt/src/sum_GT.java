import java.util.Scanner;

public class sum_GT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = scanner.nextInt();
        int sum = 0;
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t *= i;
            sum += t;
        }
        System.out.println(sum);
    }
}
