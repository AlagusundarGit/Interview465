package com.program;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LettersCount {
	
	public static void main(String[] args) {
		String s="hello world hello sundar hello banu";
		char[] c=s.toCharArray();
		Map<Character, Integer> m=new HashMap<>();
		for(Character x:c) {
			if(m.containsKey(x)) {
				Integer i=m.get(x);
				m.put(x, i+1);
			}
			else {
				m.put(x, 1);
			}
		}
		System.out.println(m);
		
	}
}

