package calculator;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static SimpleCal simpleCal = new SimpleCal();
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				simpleCal.printNumFromTheList();
				break;
			case 2:
				insertNumber();
				break;
			case 3:
				AdditionOfNumbers();
				break;
			case 4:
				multiplyNumbers();
				break;
			case 5:
				divideNumbers();
				break;
			case 6:
				substractNumbers();
				break;
			case 7:
				quit = true;
				break;
			}
		}

	}
	
	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options");
		System.out.println("\t 1 - To print the list of numbers from the list");
		System.out.println("\t 2 - To insert a number in the list");
		System.out.println("\t 3 - To add numbers from the list");
		System.out.println("\t 4 - To multiply numbers from the list");
		System.out.println("\t 5 - To divide two numbers from the list");
		System.out.println("\t 6 - To substract numbers from the list");
		System.out.println("\t 7 - To quit the application");
	}
	
	public static void insertNumber() {
		System.out.print("Please enter a number to insert: ");
		simpleCal.addNumToList(scanner.nextInt());
		scanner.nextLine();
	}
	
	public static void AdditionOfNumbers() {
		System.out.println("Current list: " + simpleCal.getNumFromCalList());
		System.out.println("Addition value: " + simpleCal.getAdditionOfListNum());
	}
	
	public static void multiplyNumbers() {
		System.out.println("Current list: " + simpleCal.getNumFromCalList());
		System.out.println("Multiplication value: " + simpleCal.getMultiplicationOfListNum());
	}
	
	public static void divideNumbers() {
		System.out.println("Current list: " + simpleCal.getNumFromCalList());
		System.out.print("Enter a number from list for numerator: ");
		int a  = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter a number from list for denominator: ");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Division of two numbers: " + simpleCal.getDivisionOfTwoNum(a, b));
	}
	
	public static void substractNumbers() {
		System.out.println("Current list: " + simpleCal.getNumFromCalList());
		System.out.println("Substraction value: " + simpleCal.getSubstractionOfListNum());
	}
	
	
}
