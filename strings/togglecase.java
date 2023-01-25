 package strings;

import java.util.Scanner;

public class togglecase {
	public static String toggleCase(String str) {
		StringBuilder sb  = new StringBuilder(str);
		for(int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				char uch = (char)('A' + ch - 'a'); // upper case
				sb.setCharAt(i, uch);
			}else if(ch >= 'A' && ch <= 'Z') {
				char lch = (char)('a' + ch - 'A'); // lower case
				sb.setCharAt(i, lch);
		}
	}
		return sb.toString();
	}
	public static void main(String[] args) {
		// toggle case means convert small case of string into Capital case and vice-versa
		// p - a = P - A
		// p = a + P -A  i.e lower case = a + upper case - A
		// P = A + p - a i.e Upper case = A + lower case - a
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}
}