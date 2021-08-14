import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        int resultInt = 0;

        if(A%4==0){
            if(A%100!=0 || A%400 ==0){
                resultInt =  1;
            }else{
                resultInt = 0;
            }
        }else{
            resultInt =  0;
        }

        System.out.print(resultInt);

    }
}