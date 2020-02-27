package com.epam.hometask4;

import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class HouseConstructionCost {

	public static void constructionCost() {
		Scanner sc = new Scanner(System.in);
		int choice;
		PrintStream pr = new PrintStream(new FileOutputStream(FileDescriptor.out));
		pr.println("  ***Construction Cost Estimation***"+"\t");
		pr.println();
		pr.println("\t" + "Available materials :"+ "\t");
		pr.println("\n1. Construction- Standard materials\n2. Construction- Above standard materials\n3. Construction- High standard materials\n4. Construction- High standard materials and fully automated home");
		pr.println("Choose between 1 to 4");
		try {
			choice = sc.nextInt();
			double area, price;
			switch(choice) {
			case 1:
				pr.println("Please enter the area of house :");
				area = sc.nextDouble();
				price = (1200 * area);
				pr.println("The cost to constuct the house = " + price + "INR");
				break;
			case 2:
				pr.println("Please enter the area of house :");
				area = sc.nextDouble();
				price = (1500 * area);
				pr.println("The total cost to construct the house = " + price + "INR");
				break;
			case 3:
				pr.println("Please enter the area of house :");
				area = sc.nextDouble();
				price = (1800 * area);
				pr.println("The total cost to construct the house = " + price + "INR");
				break;
			case 4:
				pr.println("Please enter the area of house :");
				area = sc.nextDouble();
				price = (2500 * area);
				pr.println("The total cost to construct the house = " + price + "INR");
				break;
			default:
				pr.println("Invalid input! Please enter a valid input!");
			}
		}
			catch(Exception e) {
				pr.println("Invalid input! Please enter a valid input!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseConstructionCost.constructionCost();
	}

}
