import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        int n = scanner.nextInt() % arr.length;

        for (int i = arr.length - n; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length - n; i++) {
            System.out.print(arr[i]+ " ");
        }


    }
}