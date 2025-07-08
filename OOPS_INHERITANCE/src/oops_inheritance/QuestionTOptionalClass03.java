package oops_inheritance;
import java.util.Optional;
import java.util.Scanner;

class InvalidEmployeeException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class MyEmployee {
    String name;
    MyEmployee(String name) {
        this.name = name;
    }
}

public class QuestionTOptionalClass03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name (or press Enter for null): ");
        String empName = sc.nextLine();

        MyEmployee emp = empName.isEmpty() ? null : new MyEmployee(empName);
        Optional<MyEmployee> empOpt = Optional.ofNullable(emp);

        try {
            empOpt.orElseThrow(() -> new InvalidEmployeeException("Invalid Employee Exception"));
            System.out.println("Valid Employee: " + emp.name);
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
        
    }
}
	