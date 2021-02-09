import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean increese = true;
        boolean descreese = true;

        int num1 = scanner.nextInt();

        while (scanner.hasNext()){
            if (!increese && !descreese){
                break;
            }
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                break;
            }
            if (num1 > num2){
                increese = false;
                num1 = num2;
            } else if (num1 < num2){
                descreese = false;
                num1 = num2;
            }
        }

        if (increese||descreese){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}