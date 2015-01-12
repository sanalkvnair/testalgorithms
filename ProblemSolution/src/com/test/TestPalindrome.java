package com.test;

import java.util.Scanner;

public class TestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt(); 
		if(T>=1 && T<=10){
			for(int t=0;t<T;t++){
				String str = in.next();
				if(str.length()>=1 && str.length()<=10E+4){
					char[] chars = str.toCharArray();
					int oper = 0;
					for(int i=0,j=chars.length-1;i<chars.length/2;i++,j--){
						if(chars[i] < chars[j]){
							oper += (chars[j] - chars[i]);
						}else if(chars[i] > chars[j]){
							oper += (chars[i] - chars[j]);
						}
					}
					System.out.println(oper);
				}
			
			}
		}

	}

}
