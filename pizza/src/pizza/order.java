package pizza;

import java.util.*;

public class order {
	// Instance variables
	public double TOPPING_COST = 1.25;
	public int SMALL = 1;
	public int MEDIUM = 2;
	public int LARGE = 3;
	public double SMALL_COST = 8.0;
	public double MED_COST = 10.0;
	public double LARGE_COST = 12.0;
	  
	private int size = 0;
	private int numToppings = 0;
	private String toppingList = null;
	  
	// Default constructor
	public order() {

	}
	  
	// Getter
	public int getSize() {
		return this.size;
	}
	  
	// Setter
	public void setSize(int size) {
		if (size > 3 || size < 1) {
			throw new IllegalArgumentException();
		} 
		  
		this.size = size;
	}
	  
	// Getter
	public int getNumToppings() {
		return this.numToppings;
	}
	  
	// Setter
	public void setNumToppings(int toppings) {
		numToppings = toppings;
	}
	
	// Getter
	public String getToppingList() {
		return this.toppingList;
	}
	
	// Setter
	public void setToppingList (String newTopping) {
		toppingList = newTopping;
	}
	  
	// Method to calculate and return the price of the pizza object
	public double calcPrice() {
		if (size == 1) {
			return numToppings * TOPPING_COST + SMALL_COST;
		}
		
		else if (size == 2) {
			return numToppings * TOPPING_COST + MED_COST;
	    }
	    
		else {
			return numToppings * TOPPING_COST + LARGE_COST;
		}
	}
	  
	// Method that returns the pizza object as formatted string
	public String toString() {
		if (size == 1) {
			return String.format("\nSmall Pizza\n%d Toppings: %s\nTotal Price: $%.2f\n\n", numToppings, toppingList, calcPrice());
		}
		
		else if (size == 2) {
			return String.format("\nMedium Pizza\n%d Toppings: %s\nTotal Price: $%.2f\n\n", numToppings, toppingList, calcPrice());
		}
		
		else {
			return String.format("\nLarge Pizza\n%d Toppings: %s\nTotal Price: $%.2f\n\n", numToppings, toppingList, calcPrice());
		}
	}
}