package oops_inheritance;
import java.util.Scanner;
public class QuestionStringBuffer10 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
System.out.print("Enter the string: ");
String input = scanner.nextLine();
System.out.print("Enter the number n: ");
int n = scanner.nextInt();
if (n < 0 || n > input.length()) {
    System.out.println("Invalid input: n must be between 0 and the length of the string (" + input.length() + ")");
} else {
String lastNChars = input.substring(input.length() - n);
StringBuilder result = new StringBuilder();
for (int i = 0; i < n; i++) {
    result.append(lastNChars);
}

System.out.println("Output: " + result.toString());
        }

        scanner.close();
    }
}
