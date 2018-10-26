package com.herald.converter;

import java.util.Scanner;

public class MeterToFeet {

	public static void main(String[] args) {
        System.out.println("Enter meter to convert into feet : ");
		Scanner sc = new Scanner(System.in);
         double meter = sc.nextDouble();
         
         double centimeter = meter * 100;
         
         double tempInch = centimeter / 2.54;
         
         double feet = tempInch / 12;
         
         double inch = tempInch % 12;
         
         
         System.out.println(meter+ " meter is "+(int)feet+" feet "+(int)inch +" inch." );
         
	}

}
