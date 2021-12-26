package algorithm.greedy;

import java.util.Arrays;
import java.util.Collections;

public class CoinChange {
    static int[] coins = {10, 50, 100, 500};
    public static void main(String[] args) {
       int nowMonney = 710;
       Integer[] integersCoin = Arrays.stream(coins).boxed().toArray(Integer[]::new);
       Arrays.sort(integersCoin, Collections.reverseOrder());
        System.out.println(Arrays.toString(integersCoin));




//       int coin500 = (int) nowMonney/500;
//       nowMonney = nowMonney - coin500 * 500;
//       System.out.println(nowMonney);
//
//       int coin100 = nowMonney/100;
//       nowMonney = nowMonney - coin100 * 100;
//       System.out.println(nowMonney);


    }
}
