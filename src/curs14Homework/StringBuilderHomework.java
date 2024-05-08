package curs14Homework;

import java.util.Arrays;
import java.util.Collections;

public class StringBuilderHomework {

	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
		
		wordOccurenceCounterString(str, "Nulla");
		
//		splitByDotString("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.");
		
		
		System.out.println(removeCharacter(str,'a'));
	}
	
public static void wordOccurenceCounterString(String searchText, String targetWord) {
		
		StringBuilder sb = new StringBuilder(searchText);
		
		System.out.println(sb);
		
		// Clean text of punctuation marks
		searchText = searchText.replaceAll("\\p{Punct}", "");
		// Search through list of words
		int wordCount = Collections.frequency(Arrays.asList(searchText.split(" ")), targetWord);
		System.out.println("The count occurences of the target word is: " +wordCount);
	}


//public static void splitByDotString(String searchText) {
//		
//		StringBuilder sb = new StringBuilder(searchText);
//		System.out.println(sb);
//		
//		String[] splitString = sb.toString().split(".");
//		for (String string : splitString) {
//			System.out.print(string);
//		}
//
//		} 

public static String removeCharacter(String searchText, char a) {
	StringBuilder sb = new StringBuilder(searchText);
	
	char[] rmString = searchText.toCharArray();
	for(int i=0; i<rmString.length; i++) {
		if(rmString[i] == a) {
			i++;
		} else {
			sb.append(rmString[i]);
		}
	}
	return sb.toString();
	}
	
}



			

	
		

	


