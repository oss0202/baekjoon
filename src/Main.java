import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        int resultInt;

        if(X > 0){
            if(Y > 0) resultInt  = 1;
            else resultInt  = 4;
        }else{
            if(Y > 0) resultInt  = 2;
            else resultInt  = 3;
        }

        System.out.print(resultInt);

    }
}