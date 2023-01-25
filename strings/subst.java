package strings;

public class subst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sandy";
		findSubS(str);
	}
	public static void findSubS(String str) {
		for(int i = 0; i < str.length(); i++ ) {
			for(int j = i; j < str.length(); j++ ) {
			System.out.println(str.substring(i,j+1));
		}
	}
}
}