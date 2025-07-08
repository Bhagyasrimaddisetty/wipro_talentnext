package oops_inheritance;
import java.util.Scanner;
public class QuestionStringBuffer01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string to check palindrome: ");
String input = sc.nextLine();

String original = input.toLowerCase();
String reversed = "";

for (int i = original.length() - 1; i >= 0; i--) {
    reversed += original.charAt(i);
}

if (original.equals(reversed)) {
    System.out.println(input + " is a palindrome.");
} else {
    System.out.println(input + " is not a palindrome.");
        }

        sc.close();
    }
}


