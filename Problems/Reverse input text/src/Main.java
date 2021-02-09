import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String str = reader.readLine();
        char[] result = str.toCharArray();
        for (int i = result.length - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
        reader.close();
    }
}