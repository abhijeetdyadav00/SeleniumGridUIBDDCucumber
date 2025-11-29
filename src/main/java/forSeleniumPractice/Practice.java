package forSeleniumPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Practice {
	

	
	public static void main(String[] args) {

//		Write a program to calculate the count of non-space characters in a string.
//		Input: This is a string
//		Output: 13
		
		
//	 String str="This is a string";
//	 String str2=str.replace(" ", "");
//	 System.out.println(str2);
//
//	 System.out.println(str2.length());
		
		
		
//		rite a program to remove duplicate characters in a given String.
//		Input: hackerearth
//		Output: hackert
		
		
		
	 

		
//		. Write a method that will take a string as an argument. The method will reverse the position of words and return it.("apple banana kiwi")

//		output=kiwi banana apple
	 
		
//		String str="apple banana kiwi";
//		String [] str2= str.split(" ");
//		
//		for(int i=str2.length-1;i>=0;i--) {
//			System.out.print(str2[i]+" ");
//		}
		
		
		
		
//		Count Frequency of Each Character in Alphabetical Order:
//			Input: “coodinng”
//			Output: c1 d1 g1 i1 n2 o2
		
//		String str="coodinng";
//		
//		
//		HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
//		
//		for(int i=0;i<str.length();i++) {
//			Character key=str.charAt(i);
//			
//			if(hmap.containsKey(key)) {
//				hmap.put(key, hmap.get(key)+1);
//				
//			}
//			else {
//				
//				hmap.put(key, 1);
//			}
//		}
//		
//		
//		System.out.println(hmap);
		
		
		
//		Group Anagrams Together in a List:
//			Input: [“eat”, “tea”, “tan”, “ate”, “nat”, “bat”]
//			Output: [[“bat”], [“nat”, “tan”], [“ate”, “eat”, “tea”]]
		
		
		
//		Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.
//		4, 781, 8, 99, 103
		
//		int [] a= {4, 781, 8, 99, 103};
//		
//		
//	   Arrays.sort(a);
//	   System.out.println("Smallest number =  "+a[0]);
//	   System.out.println("max number  ="+a[a.length-1]);
		
		
		
		
		
		
		 String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		 HashMap<String, List<String>> hmap=new HashMap <String, List<String>>();
		 
		 for(String word:input) {
			 char[] chars=word.toCharArray();
			 Arrays.sort(chars);
			 String key=new String(chars);
			 
//			 if(!hmap.containsKey(key)) {
//				 hmap.put(key, new ArrayList<>());
//			 }
			 
			 //or use below lamda function
			 
			 hmap.computeIfAbsent(key, somekey->new ArrayList<>());
			 
			 
			 hmap.get(key).add(word);
			 
		 }
		 System.out.println(hmap.values());
		 System.out.println(hmap);
		
		
		
		
	}
	
	
}
