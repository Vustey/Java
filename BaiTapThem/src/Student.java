import java.util.Scanner;

public class Student {
    int id;
    String name;
    String birthday;
    float point;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        Student[] s = new Student[n];
        //Nhập thông tin n học sinh
        System.out.println("Vui lòng nhập thông tin học sinh :");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + i + " ");
            s[i] = new Student();
            System.out.print("\tEnter id ST_0:");
            s[i].id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\tEnter name : ");
            s[i].name = scanner.nextLine();
            System.out.print("\tEnter birthday : ");
            s[i].birthday = scanner.nextLine();
            System.out.print("\tEnter point : ");
            s[i].point = scanner.nextFloat();
            scanner.nextLine();

        }
        //In thông tin của n học sinh
        System.out.println();
        System.out.println("Thông tin " + n + " học sinh là :");
        for (int i = 0; i < n; i++) {
            System.out.println("-Student " + i + " : ");
            System.out.println("\tID ST_0" + s[i].id);
            System.out.println("\tName : " + s[i].name);
            System.out.println("\tBirthday : " + s[i].birthday);
            System.out.println("\tPoint : " + s[i].point);
        }
        // Sắp xếp điểm học sinh giảm dần
        System.out.println();
        System.out.println("Sắp xếp học sinh theo điểm giảm dần");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].point < s[j].point) {
                    float tmp = s[i].point;
                    s[i].point = s[j].point;
                    s[j].point = tmp;
                    System.out.println("-Student " + i + " : ");
                    System.out.println("\tID ST_0" + s[i].id);
                    System.out.println("\tName : " + s[i].name);
                    System.out.println("\tBirthday : " + s[i].birthday);
                    System.out.println("\tPoint : " + s[i].point);
                }
            }
        }
        //Tìm học sinh có sổ điểm lớn nhất
//        System.out.println();
//        System.out.println("Học sinh có điểm cao nhất ");
//        float max = 0;
//        int x = 0;
//        for (int i = 0; i < n; i++) {
//            if (s[i].point > max) {
//                max = s[i].point;
//                i = x;
//            }
//        }
//        System.out.println("-Student " + x + " : ");
//        System.out.println("\tID ST_0" + s[x].id);
//        System.out.println("\tName : " + s[x].name);
//        System.out.println("\tBirthday : " + s[x].birthday);
//        System.out.println("\tPoint : " + s[x].point);
    }
}

