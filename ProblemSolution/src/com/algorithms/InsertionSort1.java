package com.algorithms;

import java.util.Scanner;

public class InsertionSort1 {
    
    

    public static void insertIntoSorted(int[] ar) {
        int V = ar[ar.length-1];
        int i;
        for(i=ar.length-2;i>=0;i--){
        	if(ar[i] > V){
        		ar[i+1] = ar[i];
        		printArray(ar);
        	}else if(ar[i] < V){
        		ar[i+1] = V;
        		printArray(ar);
        		return;
        	}
        }
        ar[0] = V;
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    

}
