import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(str.substring(a,b+1));
    }
}