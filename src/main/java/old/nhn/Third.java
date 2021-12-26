package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third {

    public enum result {
        YES, No
    }

    public static void main(String[] args) throws IOException {
//        String test1 = "IMPS";
//        String test2 = "MISSISSIPPI";
//
//        String test3 = "CIA";
//        String test4 = "SACRIFICE";
//        System.out.println(solution(test1, test2));
//        System.out.println(solution(test3, test4));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        System.out.println(solution(input[0], input[1]));
    }
    public static result solution(String A, String B){
        String[] BSplit = B.split("");
        for(String b:BSplit){
            if(!A.contains(b)){
                return Third.result.No;
            }
        }
        return Third.result.YES;
    }
}
