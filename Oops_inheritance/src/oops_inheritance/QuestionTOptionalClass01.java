package oops_inheritance;
	import java.util.Optional;
	import java.util.Scanner;
	public class QuestionTOptionalClass01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] names = new String[5];
    System.out.print("Enter a name (or press Enter to skip): ");
String input = sc.nextLine();
if (!input.isEmpty()) {
    names[0] = input;
}
Optional<String> nameOpt = Optional.ofNullable(names[0]);
System.out.println("Length: " + nameOpt.map(String::length).orElse(0));
        sc.close();
    }
}



