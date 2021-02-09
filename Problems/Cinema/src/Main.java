import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] kinozal = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                kinozal[i][j] = scanner.nextInt();
            }
        }

        int num = scanner.nextInt();
        int temp = 0;
        int row = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++ ) {
                if (kinozal[i][j] == 0) {
                    temp++;
                } else {
                    temp = 0;
                }
                if (temp == num) {
                    row = i+1;
                    break;
                }
            }
            temp = 0;
            if (row != 0) {
                break;
            }
        }

        System.out.println(row);
    }
}