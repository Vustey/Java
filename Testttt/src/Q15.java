import java.util.Scanner;

public class Q15 {
    static boolean Snt(int n) {
        if (n < 2) {
            return false;
        } else {
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
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
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max && Snt(arr[i])) {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Max = "+max);
    }
}
