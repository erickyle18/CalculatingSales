import java.util.Scanner;

public class CalculatingSales {
	
	public static void main(String[] args) {
		
		//create the scanner object
		Scanner input = new Scanner(System.in);
		
		//initialize the products as doubles with respective amounts
		double product1 = 2.98;
		double product2 = 4.50;
		double product3 = 9.98;
		double product4 = 4.49;
		double product5 = 6.87;
		
		//declare the variables "itemTotal" and "realTotal"
		double itemTotal = 0;
		double realTotal = 0;
		
		//prompt the user to enter a product number
		System.out.print("Enter a product number or -1 to quit: ");
		int productNumber = input.nextInt();
		
		//begin the while loop
		while(productNumber != -1)
		{
			
			//prompt the user to enter the quantity for the product number
			System.out.print("\nEnter the quantity sold for product #" + productNumber + ": ");
			int quantitySold = input.nextInt();
			
			//start switch statement to determine retail price for each product
			switch(productNumber)
			{
			
			case 1: 
				itemTotal = product1 * quantitySold;
				break;
			case 2:
				itemTotal = product2 * quantitySold;
				break;
			case 3:
				itemTotal = product3 * quantitySold;
				break;
			case 4:
				itemTotal = product4 * quantitySold;
				break;
			default:
				System.out.println("\nInvalid Product Number.");
			}
			
			
			realTotal = realTotal + itemTotal;
			
			//prompt the user to enter another product number
			System.out.print("\nEnter another product number or -1 to quit: ");
			productNumber = input.nextInt();
			
		}
		
		
		System.out.printf("The retail value of all products sold: $%.2f",realTotal);
		
		
		
		
	}

}
