package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TestFibo {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\Users\\sananair\\Downloads\\input06.txt");
		InputStream is = new FileInputStream(file);
		//Scanner in = new Scanner(is);
		Scanner in = new Scanner(System.in);
		long T = in.nextLong();
		long start = System.currentTimeMillis();
		if(T >= 1 && T <= 10E+5){
			for(long d=0; d<T; d++){
				long N = in.nextLong();
				if(N >= 1 && N <= 10E+10){
					if(isFibonacci(N)){
						System.out.println("IsFibo");
					}else{
						System.out.println("IsNotFibo");
					}
				}
			}
			
			
		}
		long end = System.currentTimeMillis();
		System.out.println("Time; "+(end-start));
		in.close();
	}
	
	static boolean isPerfectSquare(long x){
		System.out.println("x: "+x);
		System.out.println("sqr: "+Math.sqrt(x));
		double db = Math.sqrt(x);
		long s = Math.round(Math.sqrt(x));
		System.out.println("s:"+s+"      s*s = "+(s*s)+"    db*db: "+(db*db));
		return (s*s == x);
	}
	
	static boolean isFibonacci(long n){
		return isPerfectSquare(5*n*n-4) || isPerfectSquare(5*n*n+4);
	}

}
