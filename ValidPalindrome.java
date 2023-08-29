package dsa_problems;

import java.util.Scanner;

public class ValidPalindrome {
	private static char getAtl;

	static boolean sentencePalindrome(String str) {
		int l=0;
		int h=str.length()-1;
		str=str.toLowerCase();
		while(l<=h)
		{
			char getAt1=str.charAt(l);
			char getAth=str.charAt(h);
			if(!(getAtl>='a' && getAtl<='z'))
				l++;
			else if(!(getAth>='a' && getAth<='z'))
				h--;
			else if(getAtl==getAth)
			{
				l++;
				h--;
			}
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();
		if(sentencePalindrome(str))
			System.out.println("Sentence is Palindrome");
		else
			System.out.println("Sentence is not a Palindrome");
	}

}
