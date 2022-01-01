package baekjoon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] result = {1,2,3,4,5,6};
        Arrays.stream(result)
                .filter(value -> value>3)
                .forEach(System.out::println);
    }
}
