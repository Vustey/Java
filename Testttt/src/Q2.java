import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter n :");
        int n = scanner.nextInt();
        System.out.println("Ước số của "+n+" là :");
        for(int i=1; i<=n;i++){
            if(n % i==0){
                System.out.printf(i+"\t");
            }
        }
    }
}
