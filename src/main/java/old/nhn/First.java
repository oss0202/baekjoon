package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int hour = 0;
        int min = 0;

        int[] busHour = new int[5];
        int[] busMin = new int[5];

        String notTime[] = br.readLine().split(":");

        hour = Integer.parseInt(notTime[0]);
        min = Integer.parseInt(notTime[1]);

        String closeTimes = "";

        String[] splitBus;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        while (st.hasMoreTokens()){
            splitBus = st.nextToken().split(":");
            busHour[i] = Integer.parseInt(splitBus[0]);
            busMin[i] = Integer.parseInt(splitBus[1]);
            if(hour < busHour[i]){
                closeTimes = closeTimes + busHour[i] + busMin[i] + ",";
            }
            i++;
        }

        String[] closeTimeArr = closeTimes.split(",");
        int minVal = Integer.parseInt(closeTimeArr[0]);
        int nowVal = 0;
        for (int j = 1; j < closeTimeArr.length; j++) {
            nowVal = Integer.parseInt(closeTimeArr[j]);
            if(minVal > nowVal){
                minVal = nowVal;
            }
        }

        String lastTime = Integer.toString(minVal);

        String minHour = lastTime.substring(0,2);
        String minMin = lastTime.substring(2,4);

        int left = ((Integer.parseInt(minHour) * 60 ) - (hour * 60 ) + Integer.parseInt(minMin) - min);
        System.out.println(left);
    }
}
