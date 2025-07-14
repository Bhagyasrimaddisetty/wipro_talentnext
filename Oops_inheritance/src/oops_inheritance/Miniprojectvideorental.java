package oops_inheritance;
import java.util.ArrayList;
import java.util.Scanner;

class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        this.checkout = true;
    }

    public void doReturn() {
        this.checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

class VideoStore {
    private ArrayList<Video> store;

    public VideoStore() {
        store = new ArrayList<>();
    }

    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
}

public void doCheckout(String name) {
    for (Video v : store) {
        if (v.getName().equalsIgnoreCase(name)) {
            v.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        return;
    }
}
System.out.println("Video not found!");
}

public void doReturn(String name) {
    for (Video v : store) {
        if (v.getName().equalsIgnoreCase(name)) {
            v.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        return;
    }
}
System.out.println("Video not found!");
}

public void receiveRating(String name, int rating) {
    for (Video v : store) {
        if (v.getName().equalsIgnoreCase(name)) {
            v.receiveRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        return;
    }
}
System.out.println("Video not found!");
}

public void listInventory() {
    System.out.println("-------------------------------------------------");
System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
for (Video v : store) {
    System.out.println(v.getName() + "\t\t|\t" + v.getCheckout() + "\t\t|\t" + v.getRating());
}
System.out.println("-------------------------------------------------");
    }
}

public class Miniprojectvideorental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice;

        do {
            System.out.println("\nMAIN MENU");
System.out.println("===========");
System.out.println("1. Add Videos");
System.out.println("2. Check Out Video");
System.out.println("3. Return Video");
System.out.println("4. Receive Rating");
System.out.println("5. List Inventory");
System.out.println("6. Exit");
System.out.print("Enter your choice (1..6): ");
choice = sc.nextInt();
sc.nextLine(); // consume newline

switch (choice) {
    case 1:
        System.out.print("Enter the name of the video you want to add: ");
    String nameToAdd = sc.nextLine();
    store.addVideo(nameToAdd);
    break;
case 2:
    System.out.print("Enter the name of the video you want to check out: ");
    String nameToCheckout = sc.nextLine();
    store.doCheckout(nameToCheckout);
    break;
case 3:
    System.out.print("Enter the name of the video you want to return: ");
    String nameToReturn = sc.nextLine();
    store.doReturn(nameToReturn);
    break;
case 4:
    System.out.print("Enter the name of the video you want to rate: ");
String nameToRate = sc.nextLine();
System.out.print("Enter the rating for this video: ");
int rating = sc.nextInt();
sc.nextLine(); // consume newline
    store.receiveRating(nameToRate, rating);
    break;
case 5:
    store.listInventory();
    break;
case 6:
    System.out.println("Exiting...!! Thanks for using the application.");
    break;
default:
    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        } while (choice != 6);

        sc.close();
    }
}


