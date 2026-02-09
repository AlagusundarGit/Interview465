package com.program;

public class ExpandLetters {
	
	public static void main(String[] args) {
		String s="a-e";
		char start=s.charAt(0);
		char end=s.charAt(2);
		
		StringBuffer result=new StringBuffer();
		
		for(char i=start;i<=end;i++) {
			result.append(i);
		}
		System.out.println(result);
		
		String n="1-8";
		char st=n.charAt(0);
		char en=n.charAt(2);
		
		StringBuffer numResult=new StringBuffer();
		
		for(char j=st;j<=en;j++) {
			numResult.append(j);
			if(j!=en) {
				numResult.append(",");
			}
		}
		
		System.out.println(numResult);
	}
}
