import java.util.Scanner;

public class Recursion1 {
    public static void printNumber(int x) {
        if (x == 0)
            return;
        System.out.print(+x + " ");
        printNumber(x - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);// n=5
    }
}