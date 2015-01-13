package com.test;

public class TestClass {
	public static void main(String[] args){
		Integer a1 = 100;
		Integer a2 = 100;
		
		System.out.println("a1 == a2 : "+(a1==a2));
		
		Integer b1 = new Integer(100);
		Integer b2 = new Integer(100);
		
		System.out.println("b1 == b2 : "+(b1==b2));
		
		Integer c1 = 150;
		Integer c2 = 150;
		
		System.out.println("c1 == c2 : "+(c1==c2));
	}

}
