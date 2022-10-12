import java.util.Scanner;

public class Q20 {
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
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    j--;
                }
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
        System.out.println("Xoa cac so trung nhau");
        Delete(arr, n);
    }
}
