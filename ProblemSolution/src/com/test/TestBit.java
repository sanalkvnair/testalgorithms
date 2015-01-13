package com.test;

import java.util.Arrays;

public class TestBit {
	
	public static void main(String[] args){
		int _bit = 2147483647;
		System.out.println(~(1)&0xffffffffL);
		long N = 100000800000L;
		if(N > 0 && N <(10E+10)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		char[] lit = String.valueOf(N).toCharArray();
		for(int i=0;i<lit.length;i++){
			//System.out.print(lit[i]);
			int k = lit[i]-48;
			System.out.print(k);
		}
	}
}
