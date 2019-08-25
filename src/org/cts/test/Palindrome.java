package org.cts.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String src = s.nextLine();
String rev="";
int l=src.length();
for (int i=l-1; i>=0; i--) {
	rev= rev+src.charAt(i);
}
if (src.equals(rev)) {
	System.out.println("Palindrome");
}
else {
	System.out.println("Not Palindrome");
}

	}

}
