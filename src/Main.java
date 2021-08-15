import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strings = str.split(" ");

        int hour = Integer.parseInt(strings[0]);
        int minute = Integer.parseInt(strings[1]);

        LocalTime localTime = LocalTime.of(hour,minute);
        localTime = localTime.minusMinutes(45);

        System.out.println(localTime.getHour() + " " + localTime.getMinute());
    }
}