package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBrowser {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        char[] vowels = {'a','e','i','o','u'};
        for (int i = 0; i < N; i++) {
            String site = br.readLine();
            int count = 4;
            if(site.startsWith("www.") && site.endsWith(".com")){
            	String sub = site.substring(4, (site.indexOf(".com")));
            	for(char ch : vowels){
            		sub = sub.replaceAll(String.valueOf(ch), "");
            	}
            	count += sub.length();
            	System.out.println(count+"/"+site.length());
            }
        }
	}

}
