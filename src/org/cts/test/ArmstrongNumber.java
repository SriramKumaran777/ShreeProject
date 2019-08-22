package org.cts.test;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int number = s.nextInt();
    int getnumber=number;
    int totaldigits=0;
   while (getnumber>0) {
	 getnumber =getnumber/10;
	totaldigits++;
}
   System.out.println(totaldigits);
   getnumber=number;
	int total=0;
	while (getnumber>0) {
		int j=getnumber%10;
		total=total+(int)Math.pow(j, totaldigits);
		getnumber=getnumber/10;
	}
	if (total==number) {
		System.out.println("Armstrong Number");
	}
	else {
		System.out.println("Not Armstrong Number");
	}
	}

}
