package com.test;

import java.util.Scanner;

public class TestNumFind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int V = in.nextInt();
		int n = in.nextInt();
		if (n >= 1 && n <= 1000) {
			for(int i=0;i<n;i++){
				int ar = Integer.parseInt(in.next());
				if(ar == V){
					System.out.println(i);
					break;
				}
			}
		}

	}
}
