package com.paymoney.driver;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		int size;
		int array[];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array:");
		size = sc.nextInt();
		array = new int[size];
		System.out.println("Enter the values of array:");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved:");
		int totalNumTarget = sc.nextInt();

		while (totalNumTarget-- != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the value of target:");
			target = sc.nextInt();

			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum = sum + array[i];
				if (sum >= target) {
					System.out.printf("Target achieved after %d transactions", ++i);
					System.out.println();
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.printf("Target not achieved");

			}
		}
		

	}

}
