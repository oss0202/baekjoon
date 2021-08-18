import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
            resultInts[i] = a + b;
        }

        IntStream intStream = Arrays.stream(resultInts);
        intStream.forEach(System.out::println);
    }
}