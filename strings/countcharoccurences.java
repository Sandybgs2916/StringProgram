package strings;

public class countcharoccurences {

	public static void main(String[] args) {
		String str = "Java Programming Tutorial";
		int totcount = str.length(); // total length
		int totcount_withouta = str.replace("a","").length(); // total length without a
		 int count = totcount - totcount_withouta;	
		 System.out.println("Number of occurence of a are : " + count);
	}
}