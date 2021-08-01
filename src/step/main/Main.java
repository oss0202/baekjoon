package step.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        System.out.println(Main.add(firstInt,secondInt));
    }
    public static int add(int a, int b){
        return a+b;
    }
}