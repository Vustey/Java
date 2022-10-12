import java.util.Scanner;

public class Q9 {
    static int Snt(int n) {
        if (n < 2) {
            return 0;
        } else {
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return 1;
            }else{
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            if (Snt(i) == 1) {
                System.out.println(i + "\t");
            }
        }
    }
}
