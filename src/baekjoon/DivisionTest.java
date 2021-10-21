package baekjoon;

public class DivisionTest {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("---- 각 자리 수 출력 ----");
        System.out.println("일의 자리 : " + num % 10);
        System.out.println("십의 자리 : " + (num/10) % 10);
        System.out.println("백의 자리 : " + (num/100) % 10);
        System.out.println("천의 자리 : " + (num/1000) % 10);
        System.out.println("만의 자리 : " + (num/10000) % 10);

    }
}
