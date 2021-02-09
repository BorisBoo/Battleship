import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(arr[arrSize-1] + " ");
        for (int i = 0; i < arrSize-1; i++ ){
            System.out.print(arr[i] + " ");
        }

    }
}