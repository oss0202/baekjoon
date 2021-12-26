package co11st;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] ints = {1,1,2,3,3};
        int k = 3;

        System.out.println(ints.length);
        Arrays.sort(ints);

        ints = Arrays.stream(ints).distinct().sorted().toArray();
        System.out.println(ints.length);

//        int[] ints = {1,1,3};
//        int k = 2;
//        System.out.println(solution(ints, k));
    }

    public static boolean solution(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
//            if (A[i] < A[i + 1])
                return false;
        }
        if (A[0] != 1 && A[n - 1] != K)
            return false;
        else
            return true;
    }
}
