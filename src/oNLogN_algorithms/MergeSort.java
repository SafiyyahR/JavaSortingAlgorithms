package oNLogN_algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int numbers[] = { 14, 33, 27, 10, 35, 19, 42, 44 };
		System.out.println(Arrays.toString(numbers));
		numbers = mergeSort(numbers);
	}

	public static int[] mergeSort(int[] numbers) {

		// return the array if its only one element
		if (numbers.length == 1) {
			return numbers;
		} else {

			// find the mid point of the array
			int mid = numbers.length / 2;

			// divide them into 2 at the middle to be merge sorted as well
			int arr1[] = Arrays.copyOfRange(numbers, 0, mid);
			int arr2[] = Arrays.copyOfRange(numbers, mid, numbers.length);

			arr1 = mergeSort(arr1);
			arr2 = mergeSort(arr2);

			System.out.println("Array1 = " + Arrays.toString(arr1) + " Array2 = " + Arrays.toString(arr2));

			// return a merged array
			return merge(arr1, arr2);
		}

	}

	public static int[] merge(int[] arr1, int[] arr2) {

		// create a new array which is the length of both passed arrays
		int arr3[] = new int[arr1.length + arr2.length];

		// pointers when adding element from two arrays to one
		// i for array 1, j for array 2 and k for the merged array
		int i = 0;
		int j = 0;
		int k = 0;

		// while both arrays have values
		while (i < arr1.length && j < arr2.length) {

			// check which of the elements that have not been added are smaller, and add
			// them to the array
			if (arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				i++;
			} else {
				arr3[k] = arr2[j];
				j++;
			}
			k++;
		}

		// if there are still some elements remaining in the first array, add them to
		// the merged array
		while (i < arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		// if there are still some elements remaining in the second array, add them to
		// the merged array
		while (j < arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}

		System.out.println(Arrays.toString(arr3));

		return arr3;
	}

}
