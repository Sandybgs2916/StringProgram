package strings;
import java.util.*;

public class asciidiffer {

	public static String solution(String str) {
		// example a b d g c a ASCII of a = 97, b = 98 so on
		// find ASCII difference of two consecutive char and print them as output	
		StringBuilder sb  = new StringBuilder();
		sb.append(str.charAt(0)); // first index char of input string will add in result string
		for(int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			int gap = curr - prev;
			sb.append(gap);
			sb.append(curr);
		}
		return sb.toString();
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String str = scn.next();
	System.out.println(solution(str));
}
}
// output order would be
// abcdgfc
 // output a1b1c1d3g-1f-3c