package org.programming;

public class SumofDigits {
public static void main(String[] args) {
	int num=54826;
	int res=0;
	int rem=0;
	while(num>0) {
		rem = num%10;
		res = res+rem;
		num=num/10;
	}
	System.out.println("Sum of digits :"+res);
}
}
