package strings;

public class stringbuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Sandy");
		System.out.println(sb);
		// char at index 0
		System.out.println(sb.charAt(0));
		// set char at index
		sb.setCharAt(0, 'C'); // this will replace s of sandy by c at index 0
		System.out.println(sb);
		// insert
		sb.insert(4, 'a');  // at index 4 a will be placed and next element will move further index
		System.out.println(sb);
		// delete element
		sb.delete(4, 5); // 5th index will be exclusive hence only 4th index element will be deleted
		System.out.println(sb);
		// append use to add element after last index
		sb.append(" Warner");
		System.out.println(sb);
		System.out.println(sb.length());
	} 
}