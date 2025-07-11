package exception.handling;
import java.util.Scanner;
class NegativeValueException extends Exception {
    private static final long serialVersionUID = 1L;

    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    private static final long serialVersionUID = 1L;

    public OutOfRangeException(String message) {
        super(message);
    }
}

public class QuestionExceptionHandling03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter student name:");
            String name = sc.nextLine();

            int[] marks = new int[3];
            int sum = 0;

            System.out.println("Enter marks in 3 subjects (between 8 and 100):");
            for (int i = 0; i < 3; i++) {
                int mark;
                try {
                    mark = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException occurred.");
                    return;
                }

                if (mark < 0) {
                    throw new NegativeValueException("Negative values not allowed.");
                }

                if (mark < 8 || mark > 100) {
                    throw new OutOfRangeException("Values out of range (8–100) not allowed.");
                }

                marks[i] = mark;
                sum += mark;
            }

            double average = sum / 3.0;
            System.out.println("Average marks of " + name + ": " + average);

        } catch (NegativeValueException | OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
