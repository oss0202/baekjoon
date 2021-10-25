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
        int[] arr = new int[2];
        for (int i = 0; i < 10; i++) {
            arr[0] += arr[0] + 1;
            arr[1]++;
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
