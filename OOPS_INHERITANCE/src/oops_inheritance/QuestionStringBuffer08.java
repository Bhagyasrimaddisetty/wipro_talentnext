package oops_inheritance;
import java.util.Scanner;

public class QuestionStringBuffer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with *: ");
String input = sc.nextLine();

StringBuilder result = new StringBuilder();

for (int i = 0; i < input.length(); i++) {
    if (input.charAt(i) == '*') {
    continue;
} else if (i > 0 && input.charAt(i - 1) == '*') {
    continue;
} else if (i < input.length() - 1 && input.charAt(i + 1) == '*') {
        continue;
    } else {
        result.append(input.charAt(i));
    }
}

System.out.println("Output: " + result.toString());
sc.close();
	    }
	}


