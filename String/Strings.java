import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String firstName = sc.next();
        // String lastName = sc.next();
        // String fullName = firstName + " " + lastName;
        // System.out.println("Your name is : " + fullName);
        // System.out.println(fullName.length());

        // // charAt()
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // reverse a string using stringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < sb.length() / 2; i++) {

            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }
}
