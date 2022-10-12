
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "E:\\Workspace\\JAVA\\ReadAndWrite_File\\src\\Student";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        String []S = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++){
            System.out.print("Enter Name : ");
            String name = scanner.nextLine();
            System.out.print("Enter Country : ");
            String country = scanner.nextLine();

        }
        File file = new File(url);
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        for ( String item : S){
            outputStreamWriter.write(item);
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
    }
}