package baekjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        double[] arrNum = new double[in.nextInt()];
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i]  = in.nextDouble();
        }
        in.close();

        double sum = 0;
        Arrays.sort(arrNum);
        for (int i = 0; i < arrNum.length; i++) {
            sum += ((arrNum[i] / arrNum[arrNum.length-1])* 100 );
        }
        System.out.println(sum/ arrNum.length);
    }
}
