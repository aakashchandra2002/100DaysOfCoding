package dsa_problems;

import java.util.Scanner;

public class ValidPalindromeStringBuilder {
	static boolean sentencePalindrome(String s)
	{
		if(s.isEmpty())
		{
			return true;
		}
		String str =s.toLowerCase();
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder revstr = new StringBuilder(str);
		revstr.reverse();
		String rstr=revstr.toString();
		if(str.equals(rstr))
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = scanner.nextLine();
		if(sentencePalindrome(s))
			System.out.println("Sentence is Palindrome");
		else
			System.out.println("Sentence is not a Palindrome");
	}


}
