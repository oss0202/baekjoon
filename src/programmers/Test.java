package programmers;

public class Test {
    public static void main(String[] args) {
        String str = "abcdefg";
        for (int i = 1; i < str.length()/2; i++) {
            for (int j = 0; j < str.length()/i; j++) {
                System.out.println(str.substring(j*i, (j*i)+i));
            }
        }
    }
}
