package algorithm.chap02;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] ints = {12, 13, 14, 20, 24, 33, 42};
        for (int i = 0; i < ints.length/2; i++) {
            int now = ints[i];
            int opp = ints[ints.length -1 - i];
            ints[i] = opp;
            ints[ints.length -1 - i] = now;
        }
        Arrays.stream(ints).forEach(System.out::println);
    }
}
