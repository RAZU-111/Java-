import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        String fullName = firstName + " " + lastName;
        System.out.println("Your name is : " + fullName);
        System.out.println(fullName.length());

        // charAt()
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
