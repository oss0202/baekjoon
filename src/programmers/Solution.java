package programmers;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {

        int month = 5;
        int day = 24;

        String answer = "";
        Calendar cal = Calendar.getInstance();
        cal.set(2016, month-1, day);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);

        answer = sdf.format(date).toUpperCase();


        Calendar cal2 = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month - 1, day).build();
        System.out.println(cal2.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase());

        LocalDate localDate = LocalDate.of(2016,month,day);
        System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase());
        System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
    }

    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016,a,b);
        String answer = localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase();
        return answer;
    }
}
