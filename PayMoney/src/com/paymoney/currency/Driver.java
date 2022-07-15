package com.paymoney.currency;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int size;
		int array[];
		int payAmount;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations:");
		size=sc.nextInt();
		
		array=new int[size];
		System.out.println("Enter the currency denominations value:");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("entered denominations are:");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
				
		MergeSort ob= new MergeSort();
		ob.mergeSort(array, 0, array.length-1);
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the amount you want to pay:");
		payAmount=sc.nextInt();
		
		int []paymentDenomination= new int[array.length];
		
		for(int i=array.length-1;i>=0;i--) {
			if(payAmount>=array[i]) {
				paymentDenomination[i]=payAmount/array[i];
				payAmount= payAmount- (array[i]*paymentDenomination[i]);
				
			}
		}
		if(payAmount>0) {
			System.out.println("Exact amount cannot be given with these denominations");
		}else {
			System.out.println("Your payment approach in order to give min no of notes will be ");
			for(int i=array.length-1;i>=0;i--) {
				if(paymentDenomination[i]!=0) {
					System.out.println(array[i]+":"+paymentDenomination[i]);
				}
			}
		}

	}

}
