import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String prompt) throws IOException {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.err.println("IOExeption: " + e);
        }
        return inputLine;
    }
}
