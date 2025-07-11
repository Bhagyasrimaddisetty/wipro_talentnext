package exception.handling;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class QuestionExceptionHandling05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = sc.nextLine();

            System.out.println("Enter your age:");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 18 || age > 68) {
                throw new InvalidAgeException("Age must be between 18 and 68.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Valid age entered.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Please enter a valid integer for age.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
