import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void Input_Add(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("\n"+arr[j]+": "+i+","+j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        Input_Add(arr, n);
    }
}
