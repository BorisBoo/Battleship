import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        char[] characters = {'a','z','e','d'};

        char[] array1 = new char[0];

        char[] array2 = { 'a', 'b', 'c', 'd' };

        char[] array3 = new char[-1];

        char[] array4 = new char[1];

        System.out.println(Arrays.toString(characters) +
                " " + Arrays.toString(array1) + " "
                + Arrays.toString(array2) + " "
                + Arrays.toString(array3) + " "
                + Arrays.toString(array4));
    }
}