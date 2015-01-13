package com.test;

import java.util.Scanner;

public class TestMaxXoR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int R = in.nextInt();
		if(L>=1 && L<=R && R<=10E+3){
			int max = 0;
			for(int i=L;i<=R;i++){
				for(int j=i;j<=R;j++){
					int res = (i^j);
					if(res > max){
						max = res;
					}
				}
			}
			System.out.println(max);
		}
		in.close();

	}

}
