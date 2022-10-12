import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter n :");
        int n = scanner.nextInt();
        int s=1;
        for (int i = 1; i <= n; i++){
            s*=i;
        }
        System.out.println("Giai thua la cua "+n+"! la "+s);
    }
}
