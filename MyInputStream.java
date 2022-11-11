import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStream {
    public static void main(String[] args) throws IOException {
        System.out.print("Please Enter text: ");
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String mysStr = br.readLine();
        System.out.println("You entered string: "+ mysStr);
    }
}
