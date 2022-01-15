package old.gs;

import java.util.Arrays;

public class First {
    static int n ;
    static int[] arr;
    static int result;
    static int[]  tArr;
    static boolean[] visited;
    public static void main(String[] args) {

        arr = new int[]{20, 8, 10, 1, 4, 15};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        visited =new boolean[n];
        tArr =new int[n];

        result=0;
        solve(0);
        System.out.println(result);
    }
    private static void solve(int count){
        if(count == n){
            int sum =0;
            for (int i = 0; i <n-1 ; i++) {
                sum += Math.abs(tArr[i] - tArr[i+1]);
            }
            result = Math.max(result,sum);
            return;
        }

        for (int i = 0; i <n ; i++) {
            if(visited[i]){
                continue;
            }
            visited[i] =true;
            tArr[count] = arr[i];
            solve(count+1);
            visited[i] =false;
        }
    }
}
