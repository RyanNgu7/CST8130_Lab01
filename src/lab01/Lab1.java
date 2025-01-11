/**
 * CET - CS Academic Level 3
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Ryan Nguyen
 * Student Number: 041137485
 * Section #: 302
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi PhD. 
 * 
  */
package lab01;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO - Exception handling:
		// done non-int option
		// done string option 
		// calculations when array is empty/not enough values

		Scanner scanner = new Scanner(System.in);
		Numbers numbers = new Numbers();
		
		int arraySize;
		int option = 0;

		while (option != 6) {
			displayMainMenu();
			
			try {
				option = scanner.nextInt();
	
				switch (option) {
				
				// 1: Initialize a default array
				case 1:
					numbers = new Numbers();
					break;
					
				// 2: Specify the max size of the array
				case 2:
					System.out.printf("Enter new size of array: ");
					arraySize = scanner.nextInt();
					numbers = new Numbers(arraySize);
					break;
	
				// 3: Add value to the array
				case 3:
					Float newFloat;
					
					System.out.printf("Enter value: ");
					numbers.addValue(scanner);
					break;
				// 4: Display values in the array
				case 4:
					System.out.println("Numbers are:\n" + numbers.toString());
					break;
				
				// 6: To Exit
				case 6:
					System.out.println("Exiting...");
					break;
					
				// Throw exception when user enters an integer that is not a listed option
				default:
					throw new IllegalArgumentException();
				}

			} catch (InputMismatchException ime) {
				// Handles the case of the user inputting a non-int value for option
				System.out.println("...invalid input...try again...");
				option = 0; // Reset option to prevent infinite loop
				scanner.nextLine(); // Clear scanner buffer
				
			} catch (IllegalArgumentException iae) {
				// Handles the case of the user inputting a valid integer but invalid option
				System.out.println("...invalid input...try again...");
				
			}
		}

	}

	private static void displayMainMenu() {
		System.out.printf("Please select one of the following:\n" + "1: Initialize a default array\n"
				+ "2: Specify the max size of the array\n" + "3: Add value to the array\n"
				+ "4: Display values in the array\n"
				+ "5: Display average of the values, minimum value, maximum value, max mod min, factorialMax \n"
				+ "6: To Exit\n" + "> ");
	}
}
