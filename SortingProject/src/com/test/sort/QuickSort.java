package com.test.sort;

public class QuickSort {
	
	/**
	 * 
	 * @param inputArray
	 * @param sourceIndex
	 * @param destIndex
	 */
	public static void swapElementsOfArray(int[] inputArray, int sourceIndex, int destIndex){
		int temp1 = inputArray[sourceIndex];
		inputArray[sourceIndex] = inputArray[destIndex];
		inputArray[destIndex] = temp1;
	}
	
	/**
	 * 
	 * @param inputArray
	 * @param startIndex
	 * @param endIndex
	 * @param middleIndex
	 * @return
	 */
	public static int partitionStep(int[] inputArray, int startIndex, int endIndex, int middleIndex){
		//int startIndex = 0;
		//int endIndex = inputArray.length - 1;
		//int middleIndex = (startIndex + endIndex) / 2;
		int pivotElement = inputArray[middleIndex];
		int indexOfPivotElement = middleIndex;
		while (startIndex != middleIndex && endIndex != middleIndex) {
			
				if (inputArray[startIndex] > pivotElement && inputArray[endIndex] < pivotElement) {
					swapElementsOfArray(inputArray, startIndex, endIndex);
					startIndex++;
					endIndex--;
					
				} else if (inputArray[startIndex] < pivotElement && inputArray[endIndex] < pivotElement) {
					
					startIndex++;
				} else if (inputArray[startIndex] > pivotElement && inputArray[endIndex] > pivotElement) {
					endIndex--;
				}else{
					startIndex++;
					endIndex--;
				}
			
		}
		if(endIndex == middleIndex && startIndex != middleIndex){
			while(startIndex != endIndex){
				if(inputArray[endIndex] < inputArray[startIndex]){
					swapElementsOfArray(inputArray, startIndex, endIndex);
					indexOfPivotElement = startIndex;
				}
				startIndex++;
			}
		}
		if(startIndex == middleIndex && endIndex != middleIndex){
			while(startIndex != endIndex){
				if(inputArray[endIndex] < inputArray[startIndex]){
					swapElementsOfArray(inputArray, startIndex, endIndex);
					indexOfPivotElement = endIndex;
				}
				endIndex--;
			}
		}
		
		return indexOfPivotElement;
	}
	
	/**
	 * 
	 * @param inputArray
	 * @param leftIndex
	 * @param rightIndex
	 */
	public static void quickSort(int[] inputArray, int leftIndex, int rightIndex) {
		if (leftIndex >= rightIndex) {
			return;
		}
		int middleIndex = (leftIndex + rightIndex) / 2;
		int indexOfPivotElement = partitionStep(inputArray, leftIndex, rightIndex, middleIndex);
		int leftArrayLength = (indexOfPivotElement- 1) - leftIndex;
		int rightArrayLength = rightIndex - indexOfPivotElement;
		if (leftArrayLength > 1) {
			quickSort(inputArray, leftIndex, indexOfPivotElement - 1);
		}
		if(rightArrayLength > 1){
			quickSort(inputArray, indexOfPivotElement, rightIndex);
		}
			
			
		
	}

	
	public static void main(String[] args) {
		//int[] inputArray= {1, 2};
		//int[] inputArray= {1, 2, 3, 4, 5 ,6};
		//int[] inputArray = { 6, 3, 1, 8, 5, 2, 7, 9, 15 };
		int[] inputArray = { 4, 9, 2, 8, 7, 3, 1, 5, 6 };
		//int[] inputArray = { 4, 9, 2, 8, 4, 7, 1, 5, 6 };
		//int[] outputArray = new int[inputArray.length];
		quickSort(inputArray, 0, inputArray.length -1);
		for(int i=0; i < inputArray.length;i++){
			System.out.println("inputArray at the end : "+ i+" element: "+inputArray[i]);
		}
		
	}

}
