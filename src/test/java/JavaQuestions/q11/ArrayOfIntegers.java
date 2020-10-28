package JavaQuestions.q11;


import java.util.Arrays;


public class ArrayOfIntegers {
	/**
	 * Given an array of integers, find and print the maximum number of integers
	 * you can select from the array such that the absolute difference between
	 * any two of the chosen integers is less than or equal to . For example,
	 * if your array is , you can create two subarrays meeting the criterion:
	 * and . The maximum length subarray has  elements.
	 * @return
	 */


	static int maxNumbers() {
		int[] a= {4,6,5,3,3,1};
		return Arrays.stream(a).distinct()
				.map(n -> (int) Arrays.stream(a).filter(n0 -> n0 == n || n0 == n + 1).count())
				.max().orElse(0);
	}

	public static void main(String[] args){
		System.out.println(maxNumbers());
	}
}
