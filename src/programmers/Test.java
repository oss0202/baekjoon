package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String str = "abcdefg";
//        System.out.println(str.substring(1,3));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0,i) + " " + str.substring(i+1));
        }
//        int result = Integer.parseInt(null);
        Integer result2 = null;

//        System.out.println(str.substring(0,3));
    }

    public int solution(int[] A) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            integerSet.add(A[i]);
        }



        return 0;
    }
}
