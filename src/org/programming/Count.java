package org.programming;

public class Count {
public static void main(String[] args) {
	int num = 12345678;
	int res = 1;
	int rem = 0;
	int count=0;
while (num>0) {
	num=num/10;
	count ++;
}
System.out.println("No of digits: "+count);
System.out.println("project completed");
}


}
