package algorithm.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxOfArray {
    public static void main(String[] args) throws IOException {
        System.out.println("키의 최댓값을 구합니다.~");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] height = new int[num];
        for (int i = 0; i < num; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }

    static int maxOf(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
