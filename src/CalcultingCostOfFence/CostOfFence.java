package CalcultingCostOfFence;

import java.util.Scanner; 

public class CostOfFence {

	public static void main(String[] args) {
		
		// inputing  int, doubles, string variables
		int costWood = 25;
		int costChainLink = 15;
		int costGate = 150;
		int buildingPermit = 50;
		double taxRate = 0.06;
		double subtotalCost = 0;
		double totalCost = 0;
		String fencingType;
		int numGate;
		int lengthFence;
		int widthFence;
		int selectedFenceType = 0;
		double salesTax = 0;
		
		//scanner initiation 
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("What type of fencing would you like to use? Wooden or Chain-link?");
		fencingType = scan.nextLine();
		
		// using if/else  and else if statement to give code a choice 
		if(fencingType.equals("Wooden")) {
			selectedFenceType = costWood;
		} else if (fencingType.equals("Chain-link")) {
			selectedFenceType = costChainLink;
		}
		System.out.println("How many gates would you like installed? Must have at least 1!");
       //how many gates you purchase
		numGate = scan.nextInt();
		System.out.println("What is the length of the fence?");
		//length/width of gate
		lengthFence = scan.nextInt();
		System.out.println("What is the width of the fence?");
		// what is the total amount
		widthFence = scan.nextInt();
		salesTax = ((2 * lengthFence * selectedFenceType) + (2 * widthFence * selectedFenceType) + (numGate * costGate)) * taxRate ; subtotalCost = salesTax + ((2 * lengthFence * selectedFenceType) + (2 * widthFence * selectedFenceType) + (numGate * costGate)); totalCost = subtotalCost + buildingPermit; 
		System.out.println("Total Cost for fence is: $ " + totalCost);
	}
}