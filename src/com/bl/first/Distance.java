package com.bl.first;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Compute Distance from origin");
		System.out.println("Enter Cooridnate X and Y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// Compute distance
		//double distance = Math.sqrt((x*x) + (y*y));
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Distance from (0,0) to " + x + "," + y +" is " + distance);
	}
}
	