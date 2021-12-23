package programmers;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] strings = {"12","123","6","678","9"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        boolean resultBl = true;

        out:
        for (int i = 0; i < strings.length-1; i++) {
            if(strings[i+1].startsWith(strings[i])){
                resultBl = false;
                break out;
            }
        }
        System.out.println(resultBl);
    }
}
