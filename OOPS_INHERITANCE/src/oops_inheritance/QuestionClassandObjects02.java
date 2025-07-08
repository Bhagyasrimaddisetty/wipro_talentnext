package oops_inheritance;
import java.util.Scanner;
public class QuestionClassandObjects02 {
public static int powerInt(int num1, int num2) {
    return (int)Math.pow(num1, num2);
}

public static double powerDouble(double num1, int num2) {
    return Math.pow(num1, num2);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Integer power
System.out.print("Enter an integer base (num1): ");
int intBase = sc.nextInt();
System.out.print("Enter an integer exponent (num2): ");
int intExponent = sc.nextInt();
int resultInt = powerInt(intBase, intExponent);
System.out.println("Result of powerInt: " + resultInt);

// Double power
System.out.print("Enter a double base (num1): ");
double doubleBase = sc.nextDouble();
System.out.print("Enter an integer exponent (num2): ");
int doubleExponent = sc.nextInt();
double resultDouble = powerDouble(doubleBase, doubleExponent);
System.out.println("Result of powerDouble: " + resultDouble);

        sc.close();
    }
}


