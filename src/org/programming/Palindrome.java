package org.programming;

public class Palindrome {
public static void main(String[] args) {
	int num = 252,res=0,rem=0,rev=num;
	while(num>0) {
		rem = num%10; 
		res = (res*10)+rem; 
		num = num/10;
	}
   System.out.println("Reverse :" +res);
   
   if (rev==res) {
	System.out.println("The given no is palindrome");
}else {
	System.out.println("The given no is not palindrome");
}
}

}
