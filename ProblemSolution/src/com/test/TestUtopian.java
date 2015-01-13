package com.test;

import java.util.Scanner;

public class TestUtopian {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if(T>=1 && T<=10){
			for(int i=0;i<T;i++){
				int N = in.nextInt();
				int height = 1; 
				if(N>=0 && N<=60){
					if(N == 0){
						System.out.println(1);
						continue;
					}
					for(int j=1;j<=N;j++){
						if(j%2 == 0){
							height += 1;
						}else{
							height *= 2;
						}
					}
					System.out.println(height);
				}
			}
		}
		in.close();
	}

}
