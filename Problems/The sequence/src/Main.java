import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int n = 0;

        for (int i = 1; i<=count; i++){
            for (int j = 1; j<i+1; j++){
                System.out.print(i + " ");
                n++;
                if (n == count){
                    break;
                }
            }
            if (n == count){
                break;
            }
        }
    }
}