package strings;

public class stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		System.out.println(s);
		System.out.println(s.length());
		for(int i = 0; i < s.length(); i++) {
		System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
		System.out.println(s.substring(1,4)); // here 4th index will not be included
		System.out.println(s.substring(1)); // here we get from 1st index to last index strings
		System.out.println(s.indexOf('l'));
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.startsWith("he"));
		System.out.println(s.startsWith("He"));
		System.out.println(s.endsWith("lo"));
		System.out.println(s.concat("abc"));
		String s2 = " abc";
		String s3 = s+s2;
		System.out.println(s3);
		System.out.println(s.replace("ll","r"));
	} 
} 