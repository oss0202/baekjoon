package old.gs;

// 백준 10819번
public class First_2 {
    public static void main(String[] args) {
        int[] num = new int[]{20, 8, 10, 1, 4, 15};
        perm(num, 0, num.length);
        System.out.println(max);
    }

    public int solution(int[] v){
        perm(v, 0, v.length);
        return max;
    }

    static int max =0;

    public static void perm(int[] a, int depth, int n){
        if(depth==n){
            sum(a, n);
            return;
        }
        for(int i=depth; i<n; i++){
            swap(a, i, depth);
            perm(a, depth+1, n);
            swap(a, i, depth);
        }
    }
    static void swap(int[] a, int depth, int n) {
        int temp = a[depth];
        a[depth] = a[n];
        a[n] = temp;
    }

    static void sum(int[] a, int k) {
        int sum =0;
        for (int i = 2; i <= k; i++) {
            sum += Math.abs(a[i-2]-a[i-1]);
        }
        if(max<sum){
            max = sum;
        }
    }
}
