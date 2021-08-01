import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        // 첫째 줄에 (A+B)%C,
        System.out.println(Main.Calc1(int1, int2, int3));
        // 둘째 줄에 ((A%C) + (B%C))%C,
        System.out.println(Main.Calc2(int1, int2, int3));
        // 셋째 줄에 (A×B)%C,
        System.out.println(Main.Calc3(int1, int2, int3));
        // 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
        System.out.println(Main.Calc4(int1, int2, int3));
    }
    public static int Calc1(int A, int B, int C){
        return (A+B)%C;
    }
    public static int Calc2(int A, int B, int C){
        return ((A%C) + (B%C))%C;
    }
    public static int Calc3(int A, int B, int C){
        return (A*B)%C;
    }
    public static int Calc4(int A, int B, int C){
        return ((A%C) * (B%C))%C;
    }
}