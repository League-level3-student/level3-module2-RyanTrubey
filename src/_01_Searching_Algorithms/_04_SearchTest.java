package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = new String[3];
		words[0] = "asdf";
		words[1] = "lkj";
		words[2] = "hi";
		assertEquals(_00_LinearSearch.linearSearch(words, "hi"), 2);
		assertEquals(_00_LinearSearch.linearSearch(words, "laskdjf"), -1);
		assertEquals(_00_LinearSearch.linearSearch(words, "asdf"), 0);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = new int[3];
		array[0] = 2;
		array[1] = 5;
		array[2] = 26;
		assertEquals(_01_BinarySearch.binarySearch(array, 0, 2, 26), 2);
		assertEquals(_01_BinarySearch.binarySearch(array, 0, 2, 5), 1);
		assertEquals(_01_BinarySearch.binarySearch(array, 0, 2, 3), -1);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = new int[3];
		array[0] = 6;
		array[1] = 8;
		array[2] = 10;
		assertEquals(_02_InterpolationSearch.interpolationSearch(array, 8), 1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(array, 6), 0);
		assertEquals(_02_InterpolationSearch.interpolationSearch(array, 13), -1);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = new int[5];
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, 3), 3);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, 0), 0);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, 5), -1);
	}
}
