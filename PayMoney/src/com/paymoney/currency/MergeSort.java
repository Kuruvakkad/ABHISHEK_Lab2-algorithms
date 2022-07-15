package com.paymoney.currency;

public class MergeSort {
	// Main function that sorts array[left...right] using
    // merge()
	void mergeSort(int array[],int left,int right) {
		if(left<right) {
			int mid= (left+right)/2;
			mergeSort(array,left,mid);
			mergeSort(array,mid+1,right);
			Merge(array,left,mid,right);
		}
	}
	/*function to merge the sub arrays*/
	void Merge(int array[],int left,int mid,int right) {
		int n1=mid-left+1;
		int n2=right-mid;
		
		//creating temp array
		int LeftArray[]=new int[n1];
		int RightArray[]=new int[n2];
		
		/* copy data to temp arrays */
		for(int i=0;i<n1;i++) {
			LeftArray[i]=array[left+i];
		}
		for(int j=0;j<n2;j++) {
			RightArray[j]=array[mid+1+j];
		}
		int i=0;//initial index of 1st sub array
		int j=0;//initial index of 2nd sub array
		int k=left;//initial index of merged array
		
		while(i<n1 && j<n2) {
			if(LeftArray[i]<= RightArray[j]) {
				array[k]=LeftArray[i];
				i++;
			}
			else {
				array[k]=RightArray[j];
				j++;
			}
			k++;
		}
		/* Copy remaining elements of L[] if any */
		while(i<n1) {
			array[k]=LeftArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			array[k]=RightArray[j];
			j++;
			k++;
		}
		
		
		
	}
	
		
	}



