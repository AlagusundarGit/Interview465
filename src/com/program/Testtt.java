package com.program;

public class Testtt {

	public static void main(String[] args) {
		String s="Alagu Tester 123"; 
		
		int[] a = { 1, 0, 7, 0, 3, 0, 0, 0 };
		
		int count=0;
		char[] c=s.toCharArray();
		for(Character x:c) {
			if(Character.isUpperCase(x)) {
					count++;
			}
		}
		System.out.println(count);
	}
}
