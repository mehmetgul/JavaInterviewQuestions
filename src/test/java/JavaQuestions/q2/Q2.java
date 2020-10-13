package JavaQuestions.q2;

public class Q2 {


	public static int minimumMoves(int[] arr1, int[] arr2) {

		int sum = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				sum += Math.abs(arr1[i] % 10 - arr2[i] % 10);
				arr1[i] = arr1[i] / 10;
				arr2[i] = arr2[i] / 10;
			}
		}

		return sum;

	}
}
