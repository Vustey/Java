import java.util.Scanner;

public class Q19 {
    public static void Input(int arr[], int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = scanner.nextInt();
        }
    }

    public static void Output(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }

    public static void Delete(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                for (int j = i; j < n-1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }
        Output(arr, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Input(arr, n);
        System.out.println("MANG LA ");
        Output(arr, n);
        System.out.println("Xoa cac so nho hon 0");
        Delete(arr, n);
    }

}
