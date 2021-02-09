import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] result = {0,0,0,0};

        for (int i = 0; i < n; i++){
            int degree = scanner.nextInt();
            result[degree - 2]++;
        }

        for (int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}