package com.test.sort;

public class BinarySearch {
	
	public static void main(String[] args){
		
		//int[] inputArray= {1, 2, 3, 4, 5 ,6,7};
		int[] inputArray= {1};
		int elementToFind = 8;
		boolean elementFound = binarySearch(inputArray, elementToFind);
		System.out.println("element found: "+elementFound);
		
	}
	
	public static boolean binarySearch(int[] inputArray, int elementToFind){
		boolean elementFound = false;
		if(inputArray.length > 1){
			int startIndex = 0;
			int endIndex = inputArray.length -1;
			while(startIndex <= endIndex){
				int middleIndex = (startIndex + endIndex)/2;
				if(inputArray[middleIndex] == elementToFind){
					elementFound = true;
					return elementFound;
				}else if(elementToFind < inputArray[middleIndex]){
					endIndex = middleIndex -1;
				}else{
					startIndex = middleIndex +1;
				}
			}
		}else{
			if(inputArray[0] == elementToFind){
				elementFound = true;
			}
		}
		return elementFound;
	}

}
