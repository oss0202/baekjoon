import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        System.out.println(Main.multiplication(firstInt,secondInt));
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
}