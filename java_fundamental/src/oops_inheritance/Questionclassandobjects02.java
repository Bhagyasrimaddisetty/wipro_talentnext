package oops_inheritance;
import java.util.Scanner;
class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class Questionclassandobjects02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer base for powerInt: ");
int intBase = sc.nextInt();

System.out.print("Enter integer exponent for powerInt: ");
int intExp = sc.nextInt();

System.out.println("Result (powerInt): " + Calculator.powerInt(intBase, intExp));

System.out.print("Enter double base for powerDouble: ");
double doubleBase = sc.nextDouble();

System.out.print("Enter integer exponent for powerDouble: ");
int doubleExp = sc.nextInt();

System.out.println("Result (powerDouble): " + Calculator.powerDouble(doubleBase, doubleExp));

    sc.close();
}
	}


