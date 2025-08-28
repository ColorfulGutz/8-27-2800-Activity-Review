import java.util.Scanner;
public class loopsDoWhileReview {
    public void isPasswordJava() {
        System.out.println("This is the do while loop review!");
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter your password: ");
            password = input.nextLine();
        } while (!password.equals("java"));

        System.out.println("Correct Password!");
    }
}
