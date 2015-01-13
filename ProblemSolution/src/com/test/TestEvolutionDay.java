package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestEvolutionDay {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int k = Integer.parseInt(line);
        if(k >= 1 && k <= 10E+5){
        	
        }

	}

}

class MyList{
	private int data;
	private MyList next;
	private MyList prev;
	
	public MyList(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	public void insert(MyList myList){
		
	}
}
