import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rowNum = Integer.parseInt(br.readLine());
        for (int i = 1 ; i <= rowNum; i++){
            System.out.println(i);
        }
        br.close();
    }
}
