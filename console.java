import java.util.Scanner;

public class java {
    public static void main(String[] args)
    {
        // Using Scanner for Getting Input from User
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        System.out.println("You entered string " + s);
    }
}
