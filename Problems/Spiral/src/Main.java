import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] spiral = new int[n][n];
        int currentNum = 1;
        int a = 0; //номер текущей строки
        int k = n;
        int b = 0; //номер текущего столбца
        int l = n;

        while (a < k && b < l){
            for (int i = b; i < l; i++){
                spiral[a][i] = currentNum++;
            }
            a++;

            for(int i = a; i < k; i++){
                spiral[i][l-1] = currentNum++;
            }
            l--;

            if (a < k) {
                for (int i = l-1; i >= b; i--){
                    spiral[k-1][i] = currentNum++;
                }
                k--;
            }

            if (b < l){
                for (int i = k-1; i >= a; i--){
                    spiral[i][b] =currentNum++;
                }
                b++;
            }
        }

        for (int i = 0; i < spiral.length; i++){
            for (int j = 0; j < spiral[i].length; j++){
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }
}
