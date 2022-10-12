import java.util.Random;
import java.util.Scanner;

public class objectsandclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(random.nextInt() / 100000000);
        }
        int c[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < 10; i++) {
            c[arr[i]]++;
        }
        System.out.println("\nSố lượng các phần tử xuất hiện trong dãy là :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + c[i]);
        }
    }
}
