package com.test.sort;



public class InsertionSort {
	
	
	public static void main(String[] args) {

		int[] unsortedArr = { 9, 8, 7, 6, 5, 4 };
		for (int i = 0; i < unsortedArr.length; i++) {
			int elementToCompare = unsortedArr[i];
			if (i > 0) {
				for (int j = i; j > 0; j--) {
					int previousElement = unsortedArr[j-1];
					if (elementToCompare < previousElement) {
						int temp = previousElement;
						unsortedArr[j-1] = elementToCompare;
						unsortedArr[j] = temp;
					}
				}
			}
		}
		for(int k=0; k < unsortedArr.length;k++){
			System.out.println(k + " element: "+unsortedArr[k]);
		}
	}

}
