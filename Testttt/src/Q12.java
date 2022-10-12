import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Element of arr");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        System.out.println("\nSum of arr");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("Sum = "+sum);
    }
}
