import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] num = new int[4];
        for (int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
            System.out.print(--num[i] + " ");
        }
    }
}