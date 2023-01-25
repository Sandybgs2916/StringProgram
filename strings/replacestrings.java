package strings;

import java.util.Scanner;

public class replacestrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// question: Input a string from the user create a new string in which replace the letter
		// 'e' with i in new string
		// example original = eabcd result = iabcd
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'e') {
				result += 'i';
			}
			else {
				result += str.charAt(i);
			}
		}
		System.out.println(result);
	}
}