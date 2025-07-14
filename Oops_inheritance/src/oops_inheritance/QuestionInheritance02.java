package oops_inheritance;
import java.util.Scanner;
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearOfJoining;
    private String nationalInsuranceNo;

    public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearOfJoining = yearOfJoining;
        this.nationalInsuranceNo = nationalInsuranceNo;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public String getNationalInsuranceNo() {
        return nationalInsuranceNo;
    }

    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
    System.out.println("Name: " + getName());
    System.out.println("Annual Salary: " + annualSalary);
    System.out.println("Year of Joining: " + yearOfJoining);
    System.out.println("National Insurance No: " + nationalInsuranceNo);
    }
}

public class QuestionInheritance02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Annual Salary: ");
    double salary = sc.nextDouble();

    System.out.print("Enter Year of Joining: ");
    int year = sc.nextInt();
    sc.nextLine(); // consume newline

    System.out.print("Enter National Insurance Number: ");
        String insurance = sc.nextLine();

        Employee emp = new Employee(name, salary, year, insurance);
        emp.displayEmployeeDetails();

        sc.close();
    }
}


