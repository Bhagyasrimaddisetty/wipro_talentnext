package oops_inheritance;
import java.util.Scanner;
public class QuestionStringBuffer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string (a): ");
String a = sc.nextLine();

System.out.print("Enter second string (b): ");
String b = sc.nextLine();

String result;

if (a.length() < b.length()) {
    result = a + b + a;
} else {
    result = b + a + b;
}

System.out.println("Output: " + result);
sc.close();
    }
}


