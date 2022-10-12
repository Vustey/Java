import java.util.Scanner;

public class Q16 {
    static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
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
        System.out.println();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sum < arr[i] + arr[j]) {
                    sum = arr[i] + arr[j];
                }
            }
        }
        System.out.println("Tong 2 so lon nhat = " + sum);
//        System.out.println();
//        int sum2 = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (sum2 < arr[i] * arr[j]) {
//                    sum2 = arr[i] * arr[j];
//                }
//            }
//        }
//        System.out.println(sum2);
    }
}
