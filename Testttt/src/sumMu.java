import java.util.Scanner;

public class sumMu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }
        System.out.println(sum);
    }
}
