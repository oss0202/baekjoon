package baekjoon;

import java.util.ArrayList;
import java.util.List;

public class Test {
    long sum(int[] a){
        long sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = new int[10001];
        ints[0] = 1;
        ints[1] = 1;

        System.out.println(ints.length);

        List test = new ArrayList();
        test.add("11");
        System.out.println(test.size());

        String str = "가나다";
        System.out.println(str.length());
    }
}
