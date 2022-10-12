import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a:");
        int a = scanner.nextInt();
        System.out.printf("Enter b:");
        int b = scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.printf(String.valueOf(a));
    }
}
