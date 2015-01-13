package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestPassword {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\Users\\sananair\\Downloads\\input_password_01.txt");
		InputStream is = new FileInputStream(file);
		Scanner in = new Scanner(is);
		// Scanner in = new Scanner(System.in);
	     int N = in.nextInt();
	     Set<String> set = new HashSet<String>();
	     for(int i=0;i<N;i++){
	    	 char[] str = in.next().toCharArray();
	    	 char[] revstr = new char[str.length];
	    	 for(int j=str.length-1,k=0;j>=0;j--,k++){
	    		 revstr[k] = str[j]; 
	    	 }
	    	 int ind = (revstr.length/2);
	    	 set.add(String.valueOf(str));
	    	 if(!set.add(String.valueOf(revstr))){
	    		 System.out.println(revstr.length+" "+revstr[ind]);
	    		 break;
	    	 }
	     }
	     in.close();

	}

}
