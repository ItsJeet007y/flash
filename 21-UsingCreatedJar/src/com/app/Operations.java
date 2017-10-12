package com.app;

public class Operations {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("Operation for number 10 and 15");
		System.out.println("Addition:"+c.add(10, 15));
		int s=c.substract(10, 15);
		System.out.println("Sub:"+s);
		int m=c.multiply(10, 15);
		System.out.println("Mutiple:"+m);
		System.out.println("Devision:"+c.devide(15, 7));
	}
}
