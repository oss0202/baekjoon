package programmers;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[2];
        System.out.println(a.length);

        List list = new ArrayList();
        list.add(11);
        list.add(11);
        list.add(11);
        System.out.println(list.size());

        String str = "abcde";
        System.out.println(str.length());
    }
}
