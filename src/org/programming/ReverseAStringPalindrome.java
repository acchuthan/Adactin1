package org.programming;

public class ReverseAStringPalindrome {
public static void main(String[] args) {
	String s = "madam";
	int length = s.length();
	String rev = " ";
	for (int i = length-1; i >= 0; i--) {
		char c =s.charAt(i);
		rev =rev+c;
	}
		if (s.equals(rev)) {
			System.out.println("Given String is a palindrome");
		}else {
			System.out.println("Given string is not a palindrome");
		}
	
}
}
