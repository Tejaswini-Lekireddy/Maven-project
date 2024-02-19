package com.main;

public class MainApp {
	 private String name;

	 // Constructor
	    public MainApp(String name) {
	        this.name = name;
	    }

	    // Method to set the name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Method to get the name
	    public String getName() {
	        return name;
	    }

	    // Method to greet
	    public void greet() {
	        System.out.println("Hello, " + name + "!");
	    }

	
	
	public static void main(String[] args) {
		MainApp example = new MainApp("Alice");

        // Call the greet method
        example.greet();

        // Change the name
        example.setName("Bob");

        // Call the greet method again
        example.greet();

	}

}
