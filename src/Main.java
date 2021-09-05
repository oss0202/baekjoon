import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInput;
        int result;
        while (true){
            firstInput = br.readLine().split(" ");
            if(Arrays.stream(firstInput).allMatch(s->Integer.parseInt(s)==0)){
                break;
            }
            result = Arrays.stream(firstInput).map(Integer::parseInt).reduce(0, Integer::sum);
            System.out.println(result);
        }
    }
}