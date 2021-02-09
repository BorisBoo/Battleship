import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int newNum = num % 10 * 100 + num / 10 % 10 * 10 + num / 100;
        System.out.println(newNum);
    }
}