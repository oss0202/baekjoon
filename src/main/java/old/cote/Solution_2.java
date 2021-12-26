package cote;

import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Solution_2 {

    public static void main(String[] args) {
        long aLong = 2322;
        Solution_2 s = new Solution_2();
        int result = s.solution(aLong);
        System.out.println(result);

    }
    public int solution(long n) {
        int answer = 0;
        long[] longs = Stream.of(String.valueOf(n).split("")).mapToLong(Long::parseLong).toArray();
        LongStream stream = Arrays.stream(longs);
        answer = (int) stream.distinct().filter(s -> n % s == 0).count();
        return answer;
    }
}
