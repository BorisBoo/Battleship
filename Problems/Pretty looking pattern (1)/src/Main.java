import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        boolean result = true;
        Scanner scaner = new Scanner(System.in);
        char[][] matrix = new char[4][4];
        for (int i = 0; i < 4; i++){
            String line = scaner.nextLine();
            matrix[i] = line.toCharArray();
        }

        int a = 0;
        int b = 0;
        while (a <= 2 && b <= 3){
            if (b == 3) {
                b = 0;
                a++;
            }
            if (a == 3) break;
            result = ((matrix[a][b] == matrix[a][b + 1]) && (matrix[a][b] == matrix[a + 1][b])
                    && (matrix[a][b] == matrix[a + 1][b + 1])) ? false : true;
            if (!result){
                break;
            }
            b++;
        }
        if (result){
            System.out.println("YES");
        } else System.out.println("NO");

    }
}