import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int a = digit/1000;
        int b = digit/100%10;
        int c = digit/10%10;
        int d = digit%10;

        if (a == d && b == c){
            System.out.println("1");
        } else {
            System.out.println("37");
        }
    }
}