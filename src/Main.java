import java.util.Scanner;
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input your score.");
    int grade = input.nextInt();

        if (grade == 100) {
            System.out.println("Perfect Score!");
        } else if (grade >= 90) {
            System.out.println("Grade A");
        } else if (grade >= 80) {
            System.out.println("Grade B");
        } else if (grade >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
}