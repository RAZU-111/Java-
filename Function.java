import java.util.Scanner;

public class Function {
    public static void PrintName(String name) {
        System.out.println(name);
        return;

    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void calculateFactorial(int n) {

        if (n < 0) {
            System.out.println("Invalid Number ");
        }

        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial is : " + factorial);
        return;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = input.nextLine();
        System.out.printf("String print : ");
        PrintName(name);

        Scanner sc = new Scanner(System.in);
        System.out.printf(" Input 1 : ");
        int a = sc.nextInt();
        System.out.printf("Input 2  : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.printf("Output : ");
        System.out.println(sum);

        System.out.printf("Enter a number for calculate factorial :");
        int n = sc.nextInt();

        calculateFactorial(n);
    }
}
