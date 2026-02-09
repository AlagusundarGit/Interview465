package com.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s="My name is Alagu is My sundar";
		String[] sa=s.split(" ");
		
		Set<String> ss=new HashSet<>(Arrays.asList(sa));
		System.out.println(ss);
		
	}
}
