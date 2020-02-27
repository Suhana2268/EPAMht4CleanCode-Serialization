package com.epam.hometask4;

import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class Simple_Compound_interest {

	public static void interestCal() {
		Scanner sc = new Scanner(System.in);
		PrintStream pr = new PrintStream(new FileOutputStream(FileDescriptor.out));
		pr.print("Please enter principle amount :");
		try {
			double principleAmount = sc.nextDouble();
			pr.println("Please enter the time period");
			double timePeriod = sc.nextDouble();
			pr.println("Please enter the rate of interest per year");
			double rOfInt = sc.nextDouble();
			pr.println("Simple Interest is :" + (principleAmount * timePeriod * rOfInt)/100);
			pr.println("Compound Interest is :"+ ((principleAmount * Math.pow(1+(rOfInt/100), timePeriod))-principleAmount));
		}
		catch(Exception e) {
			pr.println("Invalid input!\nEnter the valid one!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple_Compound_interest.interestCal();
		

	}

}
