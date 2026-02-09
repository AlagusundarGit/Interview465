package com.program;

import java.util.HashMap;
import java.util.Map;

public class WordsCount {
	
	public static void main(String[] args) {
		String s="hello world hello sundar hello banu";
		//String o=s.replace(" ", "");
		//System.out.println(o);
		//System.out.println(o.length());
		String[] a=s.split(" ");
		//char[] a=s.toCharArray();
		Map<String,Integer> m=new HashMap<>();
		for(String x: a) {
			//if(x=='l') {
			if(m.containsKey(x)) {
				Integer i=m.get(x);
				m.put(x, i+1);
			}else {
				m.put(x, 1);
			}
			}
		System.out.println(m);
		}

}

