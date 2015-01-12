package com.test;

import java.util.Scanner;

public class TestAlternatingChar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T= in.nextInt();
		if(T>=1 && T<=10){
			for(int i=0;i<T;i++){
				String str = in.next();
				if(str.length()>=1 && str.length()<=10E+5){
					int rmCount = 0;
					char[] chars = str.toCharArray();
					for(int j=0;j<chars.length;j++){
						for(int k=j+1;k<chars.length;k++){
							if(str.charAt(j) == str.charAt(k)){
								chars[k] = 0;
							}else{
								break;
							}
						}
					}
					for(int c=0;c<chars.length;c++){
						if(chars[c] == 0)
							rmCount++;
					}
					System.out.println(rmCount);
				}
			}
		}
		in.close();

	}

}