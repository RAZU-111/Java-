import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int sum = x + y;
        int sub = x - y;
        int mul = x * y;
        int div = x / y;

        System.out.println("Sumation = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println(" Division = " + div);
    }
}