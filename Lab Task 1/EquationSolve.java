import java.util.Scanner;

public class EquationSolve {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        int A = 5;
        int B = 6;
        int C = 7;
        int D = 8;
        int a = (A * B - C * D);
        int b = (2 * A - B + 3 * D);
        int c = ((A * A + B * B) - (C * C + D * D));
        int d = (A * A * A + B - C * C);
        System.out.println( "Solution of a is :"+a);
        System.out.println( "Solution of b is :"+b);
        System.out.println( "Solution of c is :"+c);
        System.out.println( "Solution of d is :"+d);
    }
}
