import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            if (str.equals("0")) {
                break;
            }
            try {
                int n = Integer.parseInt(str);
                System.out.println(n*10);
            } catch (RuntimeException e){
                System.out.println("Invalid user input: " + str);
            }
        }
    }
}