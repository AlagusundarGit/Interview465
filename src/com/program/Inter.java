package com.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Inter {
	public static void main(String[] args) {
		String s="techmahindra";
	    
	    char[] c=s.toCharArray();
	    Map<Character,Integer> m=new HashMap<>();
	    
	    for(Character x:c) {
	    	if(x=='a') {
	        if(m.containsKey(x)){
	            Integer i=m.get(x);
	            m.put(x,i+1);
	        }else{
	            m.put(x,1);
	        }
	    }}
	    System.out.println(m);
	    
	    int[] i= {1,2,2,3,4,4,5};
	    Set<Integer> result=new HashSet<>();
	    for(int x:i) {
	    	result.add(x);
	    }
	    System.out.println(result.toString());
	    
	}
	}
	

