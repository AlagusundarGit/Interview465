package com.program;

import java.util.Arrays;

public class SwapCouple {

	public static void main(String[] args) {
		
		String a="Alagusundar";
		char[] r=a.toCharArray();
		char temp;
		for(int i=0;i<a.length()-1;i=i+2) {
			temp=r[i];
			r[i]=r[i+1];
			r[i+1]=temp;
		}
		
		System.out.println(new String(r));
	}
}
