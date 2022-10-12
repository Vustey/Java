import java.util.Scanner;

public class sumPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        float sum = 1;
        for (int i = 2; i <= n; i++) {
            sum += (float) (i - 1) / i;
        }
        System.out.println(sum);
    }
}
