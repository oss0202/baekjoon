package algorithm.chap02;

public class ArrayEqual {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,4};
        System.out.println("--- 다른 길이의 배열 ---");
        System.out.println(equals(a, b));

        int[] c = {1, 2, 3, 4, 5};
        int[] d = {1, 2, 3, 4, 6};
        System.out.println("--- 다른 요소의 배열 ---");
        System.out.println(equals(c, d));

        int[] e = {1, 2, 3, 4, 5};
        int[] f = {1, 2, 3, 4, 5};
        System.out.println("--- 같은 요소의 배열 ---");
        System.out.println(equals(e, f));

    }
    static boolean equals(int[] a, int[] b){
        // 배열의 길이가 다르면 다른 배열
        if(a.length != b.length){
            return false;
        }
        // 배열의 요소가 다르면 다른 배열
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                return false;
            }
        }
        // 나머지의 경우에는 같은 배열
        return true;
    }
}
