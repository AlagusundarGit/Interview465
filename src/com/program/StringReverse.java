package com.program;

public class StringReverse {

	public static void main(String[] args) {
		
		System.out.println("a");
		
		String as="alagusundar";
		char[] cc=as.toCharArray();
		char tempc;
		for(int i=0;i<cc.length-1;i=i+2) {
			tempc=cc[i];
			cc[i]=cc[i+1];
			cc[i+1]=tempc;
		}
		System.out.println(cc);

	}
}
