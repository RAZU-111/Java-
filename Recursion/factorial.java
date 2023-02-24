import java.util.Scanner;

public class factorial {
    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;

        }
        int res = calculateFactorial(n - 1);
        int fact_n = n * res;
        return fact_n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int output = calculateFactorial(n);
        System.out.print("Factorial is : "+output);
    }
}
