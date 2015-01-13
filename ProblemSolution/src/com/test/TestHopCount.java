package com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestHopCount {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Users\\sananair\\Downloads\\hop_input_03.txt");
		File oFile = new File("D:\\Users\\sananair\\Downloads\\hop_output_03_A.txt");
		InputStream is = new FileInputStream(file);
		OutputStream os = new FileOutputStream(oFile);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		Scanner in = new Scanner(is);
		//Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i=0;i<T;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int M = in.nextInt();
			int v = (b/M)-(a/M);
			v = (a%M == 0) ? v+1 : v;
			System.out.println(a+":"+(a%M)+" "+b+":"+(b%M)+" "+M+" ->"+v);
			bw.write(v+"\n");
		}
		in.close();
		bw.close();
		
//a+" "+b+" "+M+" ->"+
	}

}
