package JavaQuestions.Balloon;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		String character = "BAONXXOLL";
	//	String character = "BAOOLLNNOLOLBBAX";
		//String character = "QAWABAWONL";
		Solution s = new Solution();
		int count = s .solution(character);
		System. out. println(" Count :" + count);
	}

	public int solution(String givenCharacter) {
		char[] arr = givenCharacter. toCharArray();
		List<Character> cList = new ArrayList<Character>();
		String b = "BALLOON";
		for (char c : arr) {
			cList.add(c);
		}
		char[] arrBallon = b .toCharArray();
		boolean isRetuen = true;
		int count = 0;

		while (isRetuen) {
			for (int i = 0; i < arrBallon .length; i++) {
				if (cList. contains(arrBallon[i])) {
					cList. remove((Character) arrBallon[i]);
				} else {
					isRetuen = false;
				}
			}
			if (isRetuen) {
				count++;
			}
		}
		return count;
	}


}

