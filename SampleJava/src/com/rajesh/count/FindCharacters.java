package com.rajesh.count;

public class FindCharacters {
	private static int countOccurences(String someString, char searchedChar, int index) {
			    if (index >= someString.length()) {
			        return 0;
			    }
			     
			    int count = someString.charAt(index) == searchedChar ? 1 : 0;
			    return count + countOccurences(
			      someString, searchedChar, index + 1);
			}
public static void main(String[] args) {
	int count = FindCharacters.countOccurences("hello world", 'l', 3);
	System.out.println("Hello = "+ count);
}
}
