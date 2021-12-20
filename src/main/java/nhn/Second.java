package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Second {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String notUseString = br.readLine();//왜 받는지 모르겠습니다.
//        String[] score = br.readLine().split(" ");
//
//        Set<String> sales = new HashSet<>();
//        for (int i = 0; i < score.length; i++) {
//            sales.add(score[i]);
//        }
//        System.out.println(sales.size());

        String input0 = "6";
        int i1 = Integer.parseInt(input0);
//        String input = "100 200 100 200 100 20";
        String input = br.readLine();//.split(" ");;
        String[] score = input.split(" ");

        Set<String> sales = new HashSet<>();
        for (int i = 0; i < score.length; i++) {
            sales.add(score[i]);
        }


        if(i1 == sales.size()){
            System.out.println("sales.size() = " + sales.size());
        }else{
            System.out.println(i1/sales.size());
        }

    }
}
