package com.bl.first;

import java.util.Scanner;

public class Triplets {
	
	public static void findTriplets(int[] array , int n) {
		boolean found = false;
		for(int i =0;i < n-2;i++) {
				for(int j = i+1; j < n-1; j++) {
					for(int k = j+1; k < n; k++) {
						if (array[i] + array[j] + array[k] == 0) {
							System.out.println(array[i]);
							System.out.println(" ");
							System.out.println(array[j]);
							System.out.println(" ");
							System.out.println(array[k]);
							System.out.println("\n");
							found=true;
						}
					}
				}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many number u want insert in Array");
		int a = sc.nextInt();
		int[] array =  new int[a];
		System.out.println("enter multiple value for operation of triplet");
		for (int l = 0; l < array.length; l++) {
			array[l] = sc.nextInt();
		}
		/*System.out.println("Given array is :" + Arrays.toString(array));*/
		int n = array.length;
		findTriplets(array,n);
	}
}	
