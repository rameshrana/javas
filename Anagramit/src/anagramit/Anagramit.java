package anagramit;

import java.util.Scanner;

public class Anagramit {
	
	public static void main (String args[]) {
		Scanner in=new Scanner(System.in);
		//Read a string from the user
		System.out.print("Enter a string:"); 
		String s = in.nextLine();

		//We convert the string to an array of characters. Basically
		//we want to freely change the letters in the string, and this
		//is not possible with class String, and is too cumbersome
		//with class StringBuffer.
		char[] text = new char[s.length()]; 
		for (int i=0; i<s.length(); i++) text[i] = s.charAt(i);
				
		System.out.println("Here are all the anagrams of " + s);
		makeAnagram(text, 0); 
		System.out.println("Goodbye!");
	} // end of main

	/* This method prints all anagrams of a obtained by leaving the first 
	   i characters unchanged and going through all possible orderings of 
	   characters i and beyond. For example:
	   makeAnagram("abc", 1) prints out abc acb 
	   makeAnagram("abc", 0) prints out abc acb bac bca cab cba
	   makeAnagram("abcd", 2) prints out abcd abdc
	*/
	static void makeAnagram(char[] a, int i) {
		//System.out.println("MakeAnagram i=" + i); //for debug
		if (i == a.length-1)  printArray(a);
		else {
			for (int j=i; j< a.length; j++) {
				//swap a[i] with a[j]
				char c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
				makeAnagram(a, i+1);
				//swap back
				c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
			}
		}
	}//end of makeAnagram
	
	//print an array
	static void printArray(char [] a) {
		for (int i=0; i< a.length; i++) System.out.print(a[i]); 
		System.out.println();
	} //end of printArray	
} // end of class