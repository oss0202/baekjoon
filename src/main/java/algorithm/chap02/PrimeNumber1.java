package algorithm.chap02;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;//나눗셈의 횟수

        //100 이하의 소스를 나열 하는 프로그램
        for (int i = 2; i <= 100; i++) {
            int n;
            for (n = 2; n < i; n++) {
                counter++;
                if(i % n == 0){
                    break;
                }
            }
            if(i==n){//기준 값보다 작은 값들로 나눠지지 않을 경우 그 수는 소수이다.
                System.out.println(i);
            }
        }
    }
}
