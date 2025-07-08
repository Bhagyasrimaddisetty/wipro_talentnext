package oops_inheritance;
import java.util.Scanner;

public class QuestionStringBuffer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter first string: ");
String str1 = sc.nextLine();
System.out.println("Enter second string: ");
String str2 = sc.nextLine();
str1 = str1.toLowerCase();
str2 = str2.toLowerCase();

if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
   
    str2 = str2.substring(1);
}
String result = str1 +" "+ str2;
System.out.println("Result: "+ result);
sc.close();
    }
}


