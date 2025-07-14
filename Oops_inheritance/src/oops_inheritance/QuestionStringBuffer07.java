package oops_inheritance;
import java.util.Scanner;
public class QuestionStringBuffer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
String input = sc.nextLine();

int len = input.length();

if (len == 0) {
    System.out.println("Output: ");
} else {
    if (input.startsWith("x")) {
    input = input.substring(1);
    len--;
}

if (len > 0 && input.endsWith("x")) {
    input = input.substring(0, input.length() - 1);
}

System.out.println("Output: " + input);
            sc.close();
        }
    }
}


