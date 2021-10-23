package baekjoon;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean[] check = new boolean[10001]; // 1부터 10000까지

        //생성자인 수 찾기
        for (int i = 1; i < check.length; i++) {
            int n = d(i);
            if(n < check.length){ // 10000이 넘는 수는 필요가 없음
                check[n] = true;
            }
        }

        //생성자가 없는 수 출력
        for (int i = 1; i < check.length; i++) {
            if(!check[i]){
                System.out.println(i);
            }
        }
   }
   // num을 생성자로 하는 수를 리턴하는 함수 생성
    public static int d(int num){
        int sum = num;
        int one = 0;
        while (num != 0){
            one = (num % 10); //첫 째 자리수
            sum += one;
            num = num/10; // 10으로 나누어 첫 째 자리를 없앤다.
        }
        return sum;
    }
}
