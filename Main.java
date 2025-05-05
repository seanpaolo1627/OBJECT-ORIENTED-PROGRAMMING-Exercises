package SaliganJava_LabExercises;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		String partNumber = input.nextLine();
		String partDescription = input.nextLine();
		int quantity = input.nextInt();
		double price = input.nextDouble();
		
		Invoice ItemInfo = new Invoice(partNumber,partDescription,quantity,price);
		
		ItemInfo.getInvoice(quantity,price);

	}

}
