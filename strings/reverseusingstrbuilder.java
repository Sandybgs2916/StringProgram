package strings;

public class reverseusingstrbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Sandy");
		for(int i = 0; i < sb.length()/2; i++) {
			int front = i;
			int back = sb.length()-1-i; // here 5-1-0 = 4th index
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
		// we can also used reverse method to reverse the string
		// sb.reverse();
		System.out.println(sb);
	}
}