package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestProfilePic {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int L = Integer.parseInt(line);
        if(L >= 1 && L <= 10000){
        	line = br.readLine();
        	int N = Integer.parseInt(line);
        	if(N >= 1 && N <= 1000){
        		for(int i=0;i<N;i++){
        			line = br.readLine();
        			String[] WidthHeight = line.split(" ");
        			String msg = "";
        			int[] WH = new int[2];
        			int j = 0;
        			for(String s : WidthHeight){
        				int len = Integer.parseInt(s);
        				if(len >= 1 && len <= 10000){
        					WH[j++] = len;
        				}else{
        					break;
        				}
        			}
        			if((WH[0] >= L && WH[1] >= L)&&(WH[0] == WH[1])){
        				msg = "ACCEPTED";
        			}else if(WH[0] < L || WH[1] < L){
        				msg = "UPLOAD ANOTHER";
        			}else if(WH[0] > L || WH[1] > L){
        				msg = "CROP IT";
        			}
        			System.out.println(msg);
        		}
        	}
        }
	}

}
