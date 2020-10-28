package JavaQuestions.q5;

import java.util.*;

public class Main
{
	private static int findMissing(Collection<Integer> array)
	{
		if(array==null)
			return 0;
		for(int i=1;i<=array.size()+1; i++){
			if(!array.contains(i)) return i;
		}
		return -1;
	}
//alternate
	private static int findMissing1(Collection<Integer> array)
	{
		// Implement findMissing Here
		if(array==null) return 0;
		for(int i=1; i<=array.size()+1; i++ ){
			if(!array.contains(i)) return i;
		}
		return -1;
	}

	private static boolean test(Integer size)
	{
		ArrayMaker array = size == null ? null : new ArrayMaker(size);
		int expected = size == null ? 0 : array.GetMissing();
		int actual = findMissing(size == null ? null : array.GetArray());

		boolean passed = expected == actual;

		System.out.printf("findMissing() %s -> %d == %d: %s\n",
				size == null ? "NULL" : String.format("Array(%d)", size),
				actual,
				expected,
				passed ? "PASSED" : "FAILED");

		return passed;
	}

	public static void main(String[] args)
	{
		boolean allPassed = true;

		allPassed = test(null) && allPassed;
		allPassed = test(1) && allPassed;
		allPassed = test(10) && allPassed;
		allPassed = test(100) && allPassed;
		allPassed = test(1000) && allPassed;
		allPassed = test(10000) && allPassed;

		System.out.println();
		System.out.println(allPassed ? "ALL TESTS PASSED" : "THERE ARE TEST FAILURES");
	}
}