package org.programming;

public class CountOfDigits {
public static void main(String[] args) {
	int oddCount = 0,evenCount =0;
	for (int i = 1; i <= 100; i++) {
		if (i%2==0) {
			evenCount++;
			
		}else {
			oddCount++;
		}
	}
	System.out.println("odd numbers count :"+oddCount);
	System.out.println("Even number count :"+evenCount);
}
}
