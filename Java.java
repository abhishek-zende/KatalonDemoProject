package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Testing
//		Program to find difference of consecutive array elements and print
//		the minimum difference {10, 5, 9, 14, 8}
		
		int number[]= {10, 5, 9, 14, 8};
		int min;
		
		List<Integer> difference=new ArrayList<Integer>();
		
		for(int i=0;i<number.length-1;i++) {
			
			
			int diff=number[i]-number[i+1];
			difference.add(diff);
		}
		
		String a="aabbcca";
		//String b="abcabc";
		
		String a1[]=a.split("");
		String b1[]=b.split("");
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		boolean value=Arrays.equals(a1, b1);
		
		System.out.println("CHar same? "+value);
		
		Collections.sort(difference);
		System.out.println(difference.get(0));
	}
Shreya edited
}
