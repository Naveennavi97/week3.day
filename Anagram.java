package week3.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length()==text2.length()) {
			System.out.println("both are equal");
		}
		char[] ch=text1.toCharArray();
		char[] ch2=text2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		if(ch==ch2) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}

}
