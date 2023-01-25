package strings;

import java.util.Scanner;

public class deletepartofstr {

	public static void main(String[] args) {
		// Question input an email from user you have to create a username from email
		// by deleting the part comes after @ example:email = abc@gmail username = abc
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		String userName = " ";
		for(int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == '@') {
				break;
			}
			else {
				userName += email.charAt(i);
			}
		}
		System.out.println(userName);
	}
}