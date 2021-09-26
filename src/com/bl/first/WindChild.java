package com.bl.first;

import java.util.Scanner;

public class WindChild {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== Wind Chill Computation");
		System.out.print("Enter Temperature in Frahenit");
		double t = sc.nextDouble();
		System.out.print("Enter Wind Speed in mph: ");
		double v = sc.nextDouble();
		double windChild = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16);
		System.out.println("Given temperatureof " + t + " Fahrenheit" + " and  a wind speed of " + v + "mph");
		System.out.format("The windchil is = %.4f " , windChild);
	}
}
