package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        String[] strings = {"B", "AA", "BB", "A"};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
//        System.out.println(Arrays.toString(strings));
        System.out.println("12".compareTo("21"));
        System.out.println("21".compareTo("12"));
        System.out.println("-------------------");

        String[] stringInts = { "2","3","1"};
        Arrays.sort(stringInts, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                System.out.println("o1 : " + o1);
                System.out.println("o2 : " + o2);
//                System.out.println("o1+o2 : " + (o1+o2));
//                System.out.println("o2+o1 : " + (o2+o1));
                int result = (o1+o2).compareTo(o2+o1);
                System.out.println(result);
                return result;
            }
        });

        System.out.println(Arrays.toString(stringInts));
    }
}
