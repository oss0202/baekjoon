package programmers;

public class Test {
    public static void main(String[] args) {
        // 익명 클래스로 Runnable을 구현
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start to new thread!");
            }
        });
        
        // 람다 표현식으로 단순하게 표현
        thread = new Thread(()-> System.out.println("Start to new thread!"));
    }
}
