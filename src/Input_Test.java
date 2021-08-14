import java.io.IOException;
import java.io.InputStream;

public class Input_Test {
    public static void main(String[] args) throws IOException {

        InputStream inputStream =System.in;

        byte[] bytes = new byte[10];
        inputStream.read(bytes);

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
    }
}
