import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = br.readLine().split(" ");
        int N = Integer.parseInt(firstInput[0]);
        int X = Integer.parseInt(firstInput[1]);

        String[] secondInput = br.readLine().split(" ");
        Arrays.stream(secondInput).filter(s -> Integer.parseInt(s)< X ).forEach(s -> System.out.print(s + " "));

        br.close();
    }
}