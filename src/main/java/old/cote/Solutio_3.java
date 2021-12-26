package cote;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solutio_3 {

    public static void main(String[] args) {
        int i = 2015;
        Solutio_3 s = new Solutio_3();
        int result = s.solution(i);
        System.out.println(result);
    }
    public int solution(int p) {
        p++;
        int[] ints = Stream.of(String.valueOf(p).split("")).mapToInt(Integer::parseInt).toArray();
        while ((int) Arrays.stream(ints).distinct().count() != 4){
            p++;
            ints = Stream.of(String.valueOf(p).split("")).mapToInt(Integer::parseInt).toArray();
        }
        int answer = p;
        return answer;
    }
}
