package programmers;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};

        int result = 0;
        for (int i = 0; i < absolutes.length; i++) {
             if(signs[i]){
                 result += absolutes[i];
             }else{
                 result -= absolutes[i];
             }
        }
        System.out.println(result);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int result = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]){
                result += absolutes[i];
            }else{
                result -= absolutes[i];
            }
        }
        return result;
    }
}
