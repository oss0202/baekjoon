package baekjoon;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader sr = new InputStreamReader(inputStream);

        int c = sr.read();

        System.out.println(c);
        System.out.println((char)c);
    }
}
