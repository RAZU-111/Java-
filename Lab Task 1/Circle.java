import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius :");
        Double radius=input.nextDouble();
        Double Area = 3.1416*radius*radius;
        System.out.printf("Area is : %.2f",Area);
    }
}
