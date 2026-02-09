package com.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrontArray {
	public static void main(String[] args) {
		
		int[] n= {1,0,7,0,3,0,0,0};
		
		int[] result=new int[n.length];
		int index=n.length-1;
		
		for(int i=n.length-1;i>=0;i--) {
			if(n[i]!=0) {
				result[index--]=n[i];
			}
			
		}
		System.out.println(Arrays.toString(result));
		System.out.println(result);
		
	}
}
