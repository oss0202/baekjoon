import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int runCnt = Integer.parseInt(br.readLine());
        int a;
        int b;
        int[] resultInts = new int[runCnt];
        String[] strings;
        String str;
        for (int i = 0 ; i < resultInts.length; i++){
            str = br.readLine();
            strings = str.split(" ");
            a = Integer.parseInt(strings[0]);
            b = Integer.parseInt(strings[1]);
            sb.append(a+b+"\n");
        }
        br.close();
        System.out.println(sb);
    }
}