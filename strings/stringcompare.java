package strings;

public class stringcompare {

	public static void main(String[] args) {
		// compare function check 3 cases while comparing
		// case 1 : s1>s2 return positive value
		// case2 : s1==s2 return 0
		// case3 : s1<s2 return negative value
		String name1 = "Sandy";
		String name2 = "Sandy";
		if(name1.compareTo(name2)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
	}
}