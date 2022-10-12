import java.util.Random;
import java.util.Scanner;

public class Q1_Count_Add {
    public static void sort(long arr[], int n) {
        System.out.print("\n-When array sort is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    long tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void Countofsort(long arr[], int n) {
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            } else if (arr[i] > arr[i + 1]) {
                if (tmp < count) {
                    tmp = count;
                    count = 0;
                }
            }
        }
        System.out.println("\n-The number of increments is " + count);
    }

    public static void Sum(long arr[], int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("-The sum number of array is " + sum);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        long[] arr = new long[n];
        System.out.print("-The number of array is ");
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(random.nextInt() / 1000000);
            System.out.print(arr[i] + " ");
        }
        sort(arr, n);
        Countofsort(arr, n);
        Sum(arr, n);
    }
}
