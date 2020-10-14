package JavaQuestions.Balloon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


	public static int solution2(String s) { // ## Author Melih Kaya ##

		List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList()); // create list from s`s each char

		char[] arr = "BALLOON".toCharArray(); // create char array from balloon`s char
		boolean isHas = true;
		int count = 0;

		while (isHas) { //chekc list has b,a,l,l,o,o,n  if has loop countinued and count++
			for (int i = 0; i < arr .length; i++) {
				if (list. contains(arr[i])) {
					list. remove((Character) arr[i]);
				} else {
					isHas = false;
					break;
				}
			}
			if (isHas) count++;
		}
		return count;

	}


}

