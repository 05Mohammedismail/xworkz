package com.xworkz.Strings;

import java.util.Arrays;

public class StringMethods {


	public static void main(String[] args) {
		
		System.out.println("Running main in String Methods");
		
		String collegeName = "Jawaharlal Nehru";
		String gmailId = "ismail05cobra@gmail.com";
		String name = "";
		String nums = "9901204699";
		String water = "The water is good";  
		
		
		char ref1 = collegeName.charAt(13); //finding character at particular index;
		System.out.println("1) Character at index is :"+ref1);
		
		String ref2 = collegeName.concat(" New College Of Engineering");
		System.out.println("2) String after Concatination are :"+ref2);
		
		String ref3 = collegeName.substring(2, 12);
		System.out.println("3) String charaters from 2 to 12 are :"+ref3);
		
		String ref4 = gmailId.toUpperCase();
		System.out.println("4) The upper case of this string is :"+ref4);
		
		int ref5 = gmailId.indexOf('a');
		System.out.println("5) The index value of that character is :"+ref5);
		
		String ref6 = gmailId.toLowerCase();
		System.out.println("6) The lower case of string is :"+ref6);
		
		int ref7 = collegeName.length();
		System.out.println("7) The length of String is :"+ref7);
		
		boolean ref8 = name.isEmpty();
		System.out.println("8) String boolean Empty :"+ref8);
		
		boolean ref9 = collegeName.isEmpty();
		System.out.println("9) String boolean Empty :"+ref9);
		
		String money  = "2530";
		char[] ref10 = money.toCharArray();
		for(int index=0;index<ref10.length;index++) {
		System.out.println("10) The char array of String is :"+ Arrays.toString(ref10));
		}
		
		int ref11 = collegeName.compareTo(nums);
		System.out.println("11)  trouble :"+ref11);
		  
		int ref12 = nums.compareToIgnoreCase("5");
		System.out.println("12)  trouble :"+ref12);
		
		boolean ref13 = gmailId.contentEquals(ref6);
		System.out.println("13) Is contents of 2 strings equal :"+ref13);
		
		boolean ref14 = gmailId.equals(gmailId);
		System.out.println("14) string-1 equals string-2 :"+ref14);
		
		boolean ref15 = ref4.equalsIgnoreCase(ref6);
		System.out.println("15) string1 = string2 without case sentivity :"+ref15);
		
		String ref16 = collegeName.replace('a', 'n');
		System.out.println("16) The string after replacing char with char is :"+ref16);
		
		String ref17 = nums.replace("990", "ismail");
		System.out.println("17) The string replacing String with string is :"+ref17);
		
		boolean ref18 = name.endsWith("4");
		System.out.println("18) The string ends with :"+ref18);
		
		boolean ref19 = collegeName.startsWith("wa", 2);
		System.out.println("19) String starting with that char AND that index is :"+ref19);
		
		String[] ref20 = water.split("\\s");
		System.out.println("20) The split value of String is :"+Arrays.toString(ref20));
		
		String ref21 = String.valueOf(2354l);
		System.out.println("21) The string form of this arguement is :"+ref21);
	}
	
	
}
