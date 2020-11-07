package sorting.test;

import java.util.Arrays;

import org.junit.Test;

import sorting.code.InsertionSort;

public class InsertionSortTest {

	@Test
	public void test() {
		int[] toSort = { 5, 2, 4, 6, 1, 3 };
		int[] sorted = { 1, 2, 3, 4, 5, 6 };
		InsertionSort.sortArray(toSort);
		assert (Arrays.equals(sorted, toSort));
	}

}
