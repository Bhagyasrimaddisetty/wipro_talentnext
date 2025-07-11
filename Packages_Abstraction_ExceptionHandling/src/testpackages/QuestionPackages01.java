package testpackages;
import java.util.Scanner;

class Foundation {
	@SuppressWarnings("unused")
    private int var1;
    int var2;
    protected int var3;
    public int var4;
}

public class QuestionPackages01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Foundation f = new Foundation();

        System.out.print("Enter value for var4 (public variable): ");
        int input = sc.nextInt();
        f.var4 = input;

        System.out.println("You entered var4 as: " + f.var4);

        sc.close();
    }
}