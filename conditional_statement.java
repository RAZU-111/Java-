import java.util.*;

public class conditional_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else {
            if (a > b) {
                System.out.println("A is gather than B");
            } else {
                System.out.println("B is grather ");
            }

        }
    }

}
