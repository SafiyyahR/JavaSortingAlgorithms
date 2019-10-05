package oN2_algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int numbers[] = { 14, 33, 27, 10, 35, 19, 42, 44 };
		System.out.println(Arrays.toString(numbers));
		
		for (int i = 0; i < numbers.length - 1; i++) {
			
			// considered the current element in the unsorted part of the array as the minimum 
			int min = numbers[i];
			int minPos = i;
			
			// search for the minimum in the rest of the unsorted part of the array.
			for (int j = i; j < numbers.length; j++) {
				if (numbers[j] < min) {
					minPos = j;
					min = numbers[j];
				}
			}
			
			// swap the minimum value and the element in its proper index
			int temp = numbers[i];
			numbers[i] = numbers[minPos];
			numbers[minPos] = temp;
			System.out.println(Arrays.toString(numbers));
		}
	}

}
