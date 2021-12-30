package programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int n = 45;
        int jin = 3;

        int mok = 0;
        int rest = 0;

        List<Integer> intLnt = new ArrayList<>();

        while (n > 0){
            mok = n/jin;
            rest = n%jin;
            n =mok;
            intLnt.add(rest);
        }
        int result = 0;
        for (int i = 0; i < intLnt.size(); i++) {
            result += intLnt.get(i) * Math.pow(3, intLnt.size() - i - 1);
        }
        System.out.println(result);
    }
}
