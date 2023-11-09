package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float pricePerKm = .21F;
		
		System.out.println("\nWhat'is your age?: ");
		int age = sc.nextInt();
		
		
		System.out.println("\nWhat is the length (km) of your trip??: ");
		int distance = sc.nextInt();
		
		sc.close();
		
		float price = distance * pricePerKm;
		
		if(age < 18) {
			
			price = price / 100 * 80;
		} else if (age > 65) {
			
			price = price / 100 * 60;
		}
		
		System.out.println("final price: " + String.format("%.02f", price) + "euro");
		
		
	}

}
