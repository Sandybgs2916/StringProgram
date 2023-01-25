package strings;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Radar";
		String reverseStr = "";
		int strLength = str.length();
		for(int i = (strLength-1); i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome String");
		}
		else {
			System.out.println(str + " is not a Palindrome String");	
		}  	
	}
	}
// the toLowerCase()method converts both str and reversestr to lowercase
// this is because java is case sensitive so 'r' and 'R' are two different values 