package oNLogN_algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int numbers[] = { 14, 17, 13, 15, 19, 10, 3, 16, 9, 12 };
		System.out.println(Arrays.toString(numbers));
		quickSort(numbers, 0, numbers.length - 1);
		System.out.println(Arrays.toString(numbers));
	}

	public static void quickSort(int[] numbers, int low, int high) {

		if (low < high) {

			// partition index gives one of the last indexes of the partition in which the
			// sorting is to occur
			int partitionIndex = partition(numbers, low, high);
			quickSort(numbers, low, partitionIndex - 1);
			quickSort(numbers, partitionIndex + 1, high);

		}

	}

	public static int partition(int[] numbers, int low, int high) {

		// take the element at the far right of the array as the pivot
		int pivot = numbers[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {

			// if the current element is smaller than or equal to the pivot
			if (numbers[j] <= pivot) {
				i++;

				// swap it with what is considered the smaller element
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}

		// the last swapped item is the largest value before the pivot
		// move the pivot after it. to put it in position.
		int temp = numbers[i + 1];
		numbers[i + 1] = numbers[high];
		numbers[high] = temp;

		// for the chosen pivot, all elements on the left are now less than it and the
		// ones on the right more
		System.out.println("Pivot: " + pivot + " => " + Arrays.toString(numbers));

		return i + 1;
	}

}
