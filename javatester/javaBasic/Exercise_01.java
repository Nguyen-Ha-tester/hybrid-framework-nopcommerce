package javaBasic;

import java.util.HashSet;
import java.util.Set;

public class Exercise_01 {

	public int lengthOfLongestSubstring(String s) {
		Set<Character> set1 = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) == s.charAt(i + 1)) && !(set1.contains(s.charAt(i)))) {
				set1.add(s.charAt(i));
			}
		}
		return set1.size();

	}

	public static void main(String[] args) {
		Exercise_01 exercise = new Exercise_01();
		System.out.println(exercise.lengthOfLongestSubstring("abcabcbb")); // Output: 3
		System.out.println(exercise.lengthOfLongestSubstring("bbbbb")); // Output: 1
		System.out.println(exercise.lengthOfLongestSubstring("pwwkew")); // Output: 3
	}
}
