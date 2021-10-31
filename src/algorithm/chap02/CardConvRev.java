package algorithm.chap02;

import java.util.Arrays;

public class CardConvRev {
    public static void main(String[] args) {
        char[] chars = new char[100];
        int result = cardConR(59,2, chars);
        System.out.println("갯수 : " + result);
        for (char aChar : chars) {
            if(aChar != 0){
                System.out.println(aChar);
            }
        }
    }

    static int cardConR(int x, int r, char[] d){
        int digit = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digit++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        return digit;
    }
}
