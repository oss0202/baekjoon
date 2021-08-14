import java.io.IOException;
import java.io.InputStream;

public class Input_Test {
    public static void main(String[] args) throws IOException {

        InputStream inputStream =System.in;
        int a = inputStream.read();

        System.out.println(a);
    }
}
