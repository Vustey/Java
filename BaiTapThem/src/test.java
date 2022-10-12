public class test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        System.out.print("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + i);

        }
        int[] temp = new int[1001];
        temp[0] = -1;
        temp[1] = -1;
        int n = 2;
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count != 0 ){
                boolean check = true;
                for (int j = 0; j < n; j++) {
                    if(temp[j] == arr[i]){
                        check = false;
                        break;
                    }
                }
                if(check) {
                    temp[n] = arr[i];
                    n++;
                }
            }
        }
        System.out.println();
        for (int i = 2; i < n; i++) {
            System.out.print(temp[i] + ": ");
            for (int j = 0; j < arr.length; j++) {
                if(temp[i] == arr[j]){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
