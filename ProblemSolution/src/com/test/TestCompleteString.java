package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class TestCompleteString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N>=1 && N<=10){
        	for(int i=0;i<N;i++){

            	String str = br.readLine();
            	if(str.length()>=1 && str.length()<=100){
            		if(str.length()<26){
            			System.out.println("NO");
            		}else{
            			char[] chars = str.toCharArray();
            			Set<Character> set = new HashSet<Character>();
            			for(Character ch : chars){
            				set.add(ch);
            			}
            			if(set.size()==26){
            				System.out.println("YES");
            			}else{
            				System.out.println("NO");
            			}
            		}
            	}
            
        	}
        }
        

	}

}
