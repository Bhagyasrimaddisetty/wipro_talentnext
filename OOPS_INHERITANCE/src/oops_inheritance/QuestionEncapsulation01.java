package oops_inheritance;
import java.util.Scanner;
	class Author {
	    private String name;
	    private String email;
	    private char gender;

	    public Author(String name, String email, char gender) {
	        this.name = name;
	        this.email = email;
	        this.gender = gender;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public char getGender() {
	        return gender;
	    }
	}

	class Book {
	    private String name;
	    private Author author;
	    private double price;
	    private int qtyInStock;

	    public Book(String name, Author author, double price, int qtyInStock) {
	        this.name = name;
	        this.author = author;
	        this.price = price;
	        this.qtyInStock = qtyInStock;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public Author getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQtyInStock() {
	        return qtyInStock;
	    }
	}

	public class QuestionEncapsulation01 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input Author details
	        System.out.print("Enter author name: ");
	        String authorName = sc.nextLine();

	        System.out.print("Enter author email: ");
	        String email = sc.nextLine();

	        System.out.print("Enter author gender (M/F): ");
	        char gender = sc.next().charAt(0);

	        Author author = new Author(authorName, email, gender);

	        // Input Book details
	        sc.nextLine();  // consume leftover newline
	        System.out.print("Enter book name: ");
	        String bookName = sc.nextLine();

	        System.out.print("Enter price: ");
	        double price = sc.nextDouble();

	        System.out.print("Enter quantity in stock: ");
	        int qty = sc.nextInt();

	        Book book = new Book(bookName, author, price, qty);

	        // Print Book details
	        System.out.println("\n--- Book Details ---");
	        System.out.println("Book Name: " + book.getName());
	        System.out.println("Author: " + book.getAuthor().getName());
	        System.out.println("Email: " + book.getAuthor().getEmail());
	        System.out.println("Gender: " + book.getAuthor().getGender());
	        System.out.println("Price: " + book.getPrice());
	        System.out.println("Quantity in Stock: " + book.getQtyInStock());

	        sc.close();
	    }
	}


