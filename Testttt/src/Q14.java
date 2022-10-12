import java.util.Scanner;

public class Q14 {
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
        System.out.println("\n");
    }

    public static void Insert(int arr[], int n, int x, int index) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter index (index <= " + n + "):");
            index = scanner.nextInt();
        } while (index > n);

        System.out.print("Enter x :");
        x = scanner.nextInt();
        for (int i = n - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        n++;
        Output(arr, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int x = 0, index = 0;
        int n = scanner.nextInt();
        int arr[] = new int[n + 1];
        Input(arr, n);
        System.out.println();
        Output(arr, n);
        Insert(arr, n, x, index);
    }
}
