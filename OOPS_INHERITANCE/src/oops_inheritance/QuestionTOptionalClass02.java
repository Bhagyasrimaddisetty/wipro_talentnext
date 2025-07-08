package oops_inheritance;
import java.util.Optional;
import java.util.Scanner;

public class QuestionTOptionalClass02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter address (or press Enter for null): ");
String addressInput = sc.nextLine();
String address = addressInput.isEmpty() ? null : addressInput;

Optional<String> addressOpt = Optional.ofNullable(address);
System.out.println(addressOpt.orElse("India"));
        sc.close();
    }
}


