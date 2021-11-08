package pizza;

import java.util.Scanner;

/**
 *
 * @author Dapos
 */
public class pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	// A scanner for keyboard input
        Scanner in = new Scanner(System.in);

        char morePizza = 'Y'; // Used to control outer loop
        double orderTotal = 0; // Total for the order of many pizzas
        String output = "";  // Output to show at the end of the order
        String input; // Input for order
        
        System.out.println("Welcome to Daeho Pizza, please begin your order.");
        
        // While the clerk has more pizzas for this order
        while (morePizza == 'Y') {
        	// Pizza object
            order order = new order();

            // Variables needed for user input
            int size = 0;
            int numberOfToppings = 0;
            char choice;
            String toppings = "";

            // Flag to keep track of valid values
            boolean isValid = false;

            // While user input is not valid, keep asking
            while (!isValid) {
                try {
                	//Prompt user and get topping choices one at a time
                	System.out.println("\nToppings are $1.25 each," + " choose from");
                	System.out.println("Cheese, Pepperoni, Sausage, Onion, Mushroom\n");
                    
                	System.out.print("Do you want Cheese?  (Y/N):  ");
                	input = in.nextLine();
                	choice = input.charAt(0);
                	
                	if (choice == 'Y' || choice == 'y') {
                		numberOfToppings += 1;
                		toppings = toppings + "Cheese ";
                	}
                	
                	System.out.print("Do you want Pepperoni?  (Y/N):  ");
                	input = in.nextLine();
                	choice = input.charAt(0);
                	
                	if (choice == 'Y' || choice == 'y') {
                		numberOfToppings += 1;
                		toppings = toppings + "Pepperoni ";
                	}
                	
                	System.out.print("Do you want Sausage?  (Y/N):  ");
                	input = in.nextLine();
                	choice = input.charAt(0);
                	
                	if (choice == 'Y' || choice == 'y') {
                		numberOfToppings += 1;
                		toppings = toppings + "Sausage ";
                	}
                	
                	System.out.print("Do you want Onion?  (Y/N):  ");
                	input = in.nextLine();
                	choice = input.charAt(0);
                	
                	if (choice == 'Y' || choice == 'y') {
                		numberOfToppings += 1;
                		toppings = toppings + "Onion ";
                	}
                	
                	System.out.print("Do you want Mushroom?  (Y/N):  ");
                	input = in.nextLine();
                	choice = input.charAt(0);
                	
                	if (choice == 'Y' || choice == 'y') {
                		numberOfToppings += 1;
                		toppings = toppings + "Mushroom ";
                	}
                	
                	order.setNumToppings(numberOfToppings);
                	order.setToppingList(toppings);

                    // If we get here, it all must be valid
                    isValid = true;
                }
                
                catch (Exception ex) {
                    // User either entered a string or they
                    // Entered an invalid number of toppings
                    System.out.println("Invalid input, or exeeding limit for number of toppings.");
                    
                    // Purge buffer
                    in.nextLine();
                }
            }
            
            // Reset the flag for the next input
            isValid = false;
            
            // While user input is not valid, keep asking
            while (!isValid) {
                try {
                    // Get the size of the pizza
                    System.out.print("\nEnter pizza size (Small = 1, Medium = 2, Large = 3): ");
                    size = in.nextInt();

                    order.setSize(size); // Set the pizza object's size

                    // If we get here, then it must be valid
                    isValid = true;
                }
                
                catch (Exception ex) {
                    // User either entered a string or they 
                    // Entered an invalid size number
                    System.out.println("Invalid value for pizza size.");
                    
                    // Purge buffer
                    in.nextLine();
                }
            }

            double pizzaCost = order.calcPrice();// Get the cost of the pizza
            System.out.print(order); // Print out pizza object's order formatted with toString() method

            orderTotal += pizzaCost; // Add the cost to the total

            output += (pizzaCost + "\n"); // Concatenated order

            // Is there another pizza in this order?
            System.out.print("Add another pizza? (Y/N): ");
            morePizza = in.next().toUpperCase().charAt(0);
            
            // Purge buffer
            in.nextLine();
        }

        // Display the complete order
        System.out.println("Order Total:");
        System.out.println(output);
        
        // Display the final order total
        System.out.println("--------------");
        System.out.printf("Final Total: $%.2f%n", orderTotal);
    }

}