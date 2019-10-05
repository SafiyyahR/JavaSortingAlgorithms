package oN2_algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int numbers[] = { 14, 33, 27, 10, 35, 19, 42, 44 };

		System.out.println(Arrays.toString(numbers));
		for (int i = 1; i < numbers.length; i++) {

			// get the first element from the unsorted side of the array.
			int currentElement = numbers[i];
			int j = i - 1;

			// check if the element in the unsorted side of the array is smaller than the
			// largest element of the sorted one
			// if it is, then move the largest sorted element to the right of the array.
			// repeat until you find the element less than the current unsorted element
			while (j >= 0 && numbers[j] > currentElement) {
				numbers[j + 1] = numbers[j];
				j = j - 1;
			}
			// add the current unsorted element to this position
			numbers[j + 1] = currentElement;
			System.out.println(Arrays.toString(numbers));
		}
	}

}
