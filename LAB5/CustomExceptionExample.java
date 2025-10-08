import java.util.Scanner;
import java.util.InputMismatchException;

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter marks (0-100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100.");
            } else {
                System.out.println("Marks entered: " + marks);
            }

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            System.out.println("Program continues...");
            sc.close();
        }
    }
}

// Custom Exception class (below main class)
class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}
