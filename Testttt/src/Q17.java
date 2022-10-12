import java.util.Scanner;

public class Q17 {
    static int Snt(int n) {
        int count = 0;
        if (n < 2) {
            return 0;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        System.out.println();
        float sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Snt(arr[i]) == 1) {
                sum += arr[i];
                count++;
            }
        }
        float sumofavr = sum / count;
        System.out.println(sumofavr);
    }
}
