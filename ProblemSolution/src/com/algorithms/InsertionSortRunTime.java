package com.algorithms;

import java.util.Scanner;

public class InsertionSortRunTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] ar = new int[N];
		for(int i=0;i<N;i++){
			ar[i] = in.nextInt();
		}
		insertionSortRunTime(ar);

	}
	
	private static void insertionSortRunTime(int[] ar){
		int count = 0;
		for(int i=1;i<ar.length;i++){
    		for(int j=i;j>0;j--){
    			if(ar[j] < ar[j-1]){
    				int t = ar[j];
    				ar[j] = ar[j-1];
    				ar[j-1] = t;
    				count++;
    			}
    		}
    	}
		System.out.println(count);
	}
	

}
