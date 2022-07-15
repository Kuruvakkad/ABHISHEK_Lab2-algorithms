package com.paymoney.driver;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		int array[];
		int size;
		int targetValue,tranTarget = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of transaction array: ");
		size=sc.nextInt();
		array= new int[size];
		System.out.println();
		System.out.println("Enter the values of array: ");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the value of target:");
		targetValue=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			tranTarget=tranTarget+array[i];
			if(tranTarget>=targetValue) {
				System.out.printf("target achieved after %d transactions ", ++i);
				break;
			}
			
			
		}
		if(tranTarget<targetValue) {
			System.out.println("target not achieved ");
			
		}

	}

}
