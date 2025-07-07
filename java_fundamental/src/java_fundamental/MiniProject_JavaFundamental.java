package java_fundamental;
import java.util.Scanner;
public class MiniProject_JavaFundamental {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee ID: ");
int inputEmpId = sc.nextInt();
int[] empId =       {1001, 1002, 1003, 1004, 1005, 1006, 1007};
String[] empName =  {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
String[] dept =     {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
char[] desigCode =  {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
int[] basic =       {20000, 30000, 10000, 12000, 50000, 23000, 29000};
int[] hra =         {8000, 12000, 8000, 6000, 20000, 9000, 12000};
int[] it =          {3000, 9000, 1000, 2000, 20000, 4400, 10000};

boolean found = false;

for (int i = 0; i < empId.length; i++) {
    if (empId[i] == inputEmpId) {
        found = true;
        String designation = "";
int da = 0;

switch (desigCode[i]) {
    case 'e':
designation = "Engineer";
    da = 20000;
    break;
case 'c':
designation = "Consultant";
    da = 32000;
    break;
case 'k':
designation = "Clerk";
    da = 12000;
    break;
case 'r':
designation = "Receptionist";
    da = 15000;
    break;
case 'm':
designation = "Manager";
    da = 40000;
    break;
default:
    designation = "Unknown";
        da = 0;
}

int salary = basic[i] + hra[i] + da - it[i];

System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
System.out.println(empId[i] + "\t" + empName[i] + "\t\t" + dept[i] + "\t\t" + designation + "\t\t" + salary);
        break;
    }
}

if (!found) {
    System.out.println("There is no employee with empid : " + inputEmpId);
        }

        sc.close();
    }
}


