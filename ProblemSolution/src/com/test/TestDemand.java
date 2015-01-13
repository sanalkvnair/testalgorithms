package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestDemand {

	public static void main(String[] args) throws IOException {
		if(919845426262703497L>585335723211047202L){
			System.out.println("true");
		}else
			System.out.println("false");
//		File file = new File("D:\\Users\\sananair\\Downloads\\input-808da4b.txt");
		File file = new File("D:\\Users\\sananair\\Downloads\\input_d.txt");
		File oFile = new File("D:\\Users\\sananair\\Downloads\\output-808da4b.txt");
		InputStream is = new FileInputStream(file);
		OutputStream os = new FileOutputStream(oFile);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        if(S!=null && S.length()>=1 && S.length()<=10E+5){
        	int Q = Integer.parseInt(br.readLine());
        	if(Q>=1 && Q<=10E+5){
        		for(int i=0;i<Q;i++){
        			String[] ab = br.readLine().split(" ");
        			long a = Long.parseLong(ab[0]);
        			long b = Long.parseLong(ab[1]);
        			System.out.println(a + "  "+b);
        			long k = 919845426262703497L;
        			if(a>=1 && a<=10E+18 && b>=1 && b<=10E+18){
        				int sLength = S.length();
        				long A =  (a % sLength == 0 ? sLength : (a % sLength));
        				long B =  (b % sLength == 0 ? sLength : (b % sLength));
        				int AA = (int)A;
        				int BB = (int)B;
//        				System.out.println("A= "+A+"  B="+B +"  AA="+AA+"   BB="+BB);
        				System.out.println(a+" "+b+" ="+((S.charAt(AA-1)==S.charAt(BB-1))?"Yes":"No"));
//        				bw.write((S.charAt(AA-1)==S.charAt(BB-1))?"Yes"+"\n":"No"+"\n");
        			}
        			
        		}
        	}
        }
        br.close();
        bw.close();
		System.out.println((252509054433933447L%5)+"   "+(760713016476190629L%5));
	}

}
