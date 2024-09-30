import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their birth month
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        // Output based on input of birth month
        if (birthMonth >= 1 & birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }


    }
}