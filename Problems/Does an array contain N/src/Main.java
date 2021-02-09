import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        boolean result = false;
        Scanner scanner =  new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();

        for (int i: arr) {
            if (i==num){
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}