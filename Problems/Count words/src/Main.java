import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String str = reader.readLine();
        str = str.trim();
        if (str.isEmpty()){
            System.out.println(0);
        } else {
            String[] result = str.split("\\s+");
            System.out.println(result.length);
        }

        reader.close();
    }
}