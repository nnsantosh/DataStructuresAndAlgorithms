package com.test.sort;

public class BubbleSort {
	
	public static void main(String[] args){
		int[] unsortedArr = { 9, 8, 7, 6, 5, 4 };
		for (int i = 0; i < unsortedArr.length -1; i++) {
			for(int j =0; j < unsortedArr.length-1-i;j++){
				int temp = unsortedArr[j];
				int nextElement = unsortedArr[j + 1];
				if (unsortedArr[j] > nextElement) {
					unsortedArr[j + 1] = temp;
					unsortedArr[j] = nextElement;
				}
			}
		}
		for(int k=0; k < unsortedArr.length;k++){
			System.out.println(k + " element: "+unsortedArr[k]);
		}
	}

}
