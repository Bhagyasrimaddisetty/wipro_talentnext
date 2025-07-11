package inheritance.newfeatures;
import java.util.Scanner;
interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

public class QuestionInterfacesnewfeatures01 implements Vehicle, FourWheeler {
    @Override
    public void message() {
        Vehicle.super.message();
        FourWheeler.super.message();
        System.out.println("Inside Car");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press any key and hit Enter to display messages:");
        sc.nextLine();

        QuestionInterfacesnewfeatures01 obj = new QuestionInterfacesnewfeatures01();
        obj.message();
        sc.close();
    }
    
}
