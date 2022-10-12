import java.util.Scanner;

public class sumMu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i,(2*i-1));
        }
        System.out.println(sum);
    }
}
