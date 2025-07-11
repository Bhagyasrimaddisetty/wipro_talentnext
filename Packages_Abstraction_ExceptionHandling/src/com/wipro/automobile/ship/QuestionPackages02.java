package com.wipro.automobile.ship;
	import java.util.Scanner;
	public class QuestionPackages02 {
	    private double height;
	    private double width;
	    private double breadth;

	    public QuestionPackages02(double height, double width, double breadth) {
	        this.height = height;
	        this.width = width;
	        this.breadth = breadth;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public double getWidth() {
	        return width;
	    }

	    public double getBreadth() {
	        return breadth;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter height, width, and breadth for the ship compartment:");
	        double height = sc.nextDouble();
	        double width = sc.nextDouble();
	        double breadth = sc.nextDouble();

	        QuestionPackages02 shipCompartment = new QuestionPackages02(height, width, breadth);

	        System.out.println("Ship Compartment Details:");
	        System.out.println("Height: " + shipCompartment.getHeight());
	        System.out.println("Width: " + shipCompartment.getWidth());
	        System.out.println("Breadth: " + shipCompartment.getBreadth());

	        sc.close();
	    }
	}


