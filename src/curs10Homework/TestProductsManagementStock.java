package curs10Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProductsManagementStock {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        // create an empty arraylist to hold the stocks
	        ArrayList<Product> products = new ArrayList<>();

	        // display the menu and ask for user input
	        int choice;
	        do {
	            System.out.println("1. Add product");
	            System.out.println("2. Remove product");
	            System.out.println("3. View products");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = input.nextInt();

	            switch (choice) {
	                case 1:
	                    // ask for products stock details
	                	System.out.println("The product is expired?: ");
	                	boolean isExpired = input.hasNext();
	                	System.out.println("The product is defect?: ");
	                	boolean isDefect = input.hasNext();
	                    System.out.println("Enter the product name: ");
	                    String name = input.next();
	                    System.out.println("Enter the product quantity: ");
	                    int quantity = input.nextInt();
	                    System.out.println("Enter the product price: ");
	                    double price = input.nextDouble();

	                    // create a new Product object and add it to the arraylist
	                    Product newProduct = new Product(name, quantity, price);
	                    products.add(newProduct);

	                    System.out.println("Product added successfully");
	                    break;

	                case 2:
	                    // ask for the product name and quantity to remove
	                    System.out.print("Enter the product name: ");
	                    String productName = input.next();
	                    System.out.print("Enter the quantity to remove: ");
	                    int removeQuantity = input.nextInt();

	                    // loop through the products to find the matching stock
	                    boolean productFound = false;
	                    for (Product product : products) {
	                        if (product.getName().equals(productName)) {
	                            // if the stock is found, remove the specified quantity
	                            productFound = true;
	                            product.removeQuantity(removeQuantity);
	                            System.out.println("Product removed successfully");
	                            break;
	                        }
	                    }
	                    if (!productFound) {
	                        System.out.println("Product not found");
	                    }
	                    break;

	                case 3:
	                    // display the list of products
	                    System.out.println("Current products:");
	                    for (Product product : products) {
	                        System.out.println(product.toString());
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting the program...");
	                    break;

	                default:
	                    System.out.println("Invalid choice, try again.");
	                    break;
	            }

	        } while (choice != 4);

	        input.close();
	    }

	}
