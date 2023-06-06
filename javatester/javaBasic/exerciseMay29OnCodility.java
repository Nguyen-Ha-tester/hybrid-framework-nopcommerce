package javaBasic;

import java.util.HashSet;

public class exerciseMay29OnCodility {

	public int solution(int[] A) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : A) {
			if (i > 0) {
				set.add(i);
			}
		}
		int small = 1;
		while (set.contains(small)) {
			small++;

		}
		return small;

	}

	public boolean solution(String S) {
		if (!(S.contains("a")) && (S.contains("b"))) {
			return true;
		} else if (S.contains("a") && !(S.contains("b"))) {
			return true;
		} else if (S.contains("a") && (S.contains("b"))) {
			int A = S.lastIndexOf("a");
			int B = S.lastIndexOf("b");
			if (A > B) {
				return false;
			} else
				return true;

		}
		return false;
	}
}
