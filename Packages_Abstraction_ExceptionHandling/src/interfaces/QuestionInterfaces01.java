package interfaces;
import java.util.Scanner;

interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Playing Veena...");
    }
}

class Saxophone implements Playable {
    public void play() {
        System.out.println("Playing Saxophone...");
    }
}

public class QuestionInterfaces01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an instrument:");
System.out.println("1. Veena");
System.out.println("2. Saxophone");
System.out.println("Enter the instrument choice: ");
int choice = scanner.nextInt();

Playable instrument;
if (choice == 1) {
    instrument = new Veena();
} else if (choice == 2) {
    instrument = new Saxophone();
} else {
    System.out.println("Invalid choice.");
            scanner.close();
            return;
        }
        instrument.play();
        scanner.close();
    }
}


