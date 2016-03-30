package code;

public class Solution {
	
	
	//Define a method named count_e that accepts a String as input and returns the number of times the char 'e'
	//occurs, as an int.
	public int count_e(String s){
		int count = 0; 
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == 'e'){
				count++;
			}
		}
		return count;	
	}
	

	//Define a method named count_one_char that accepts a String and and a char as input and returns
	//the number of times the char occurs in the String, as an int
	public int count_one_char(String s, char a){
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == a){
				count++;
			}
		}
		return count;
	}
	
	public int count_two_chars(String s, char a, char b){
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == a){
				count++;
			}
		}
		for(int j = 0; j<s.length(); j++){
			if(s.charAt(j) == b){
				count++;
			}
		}
		return count;
	}
	

	
	
	//Define a method named count_chars_in_String that accepts two Strings as input. Assuming that the two
	//parameters are named s and characters, define this method so that it returns, as an int, the number of times
	//any of the chars in the second String(characters) occur in the first String (s).
	public int count_chars_in_String(String s, String t){
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			for(int j = 0; j<t.length(); j++){
				if(s.charAt(i) == t.charAt(j)){
					count++;
				}
			}
		}
		return count;
	}
	
	
	//Define a method named isPalindrome that accepts a String as input and retunrs, as a boolean, whether
	//the inputs is a palindrome or not. A palindrome reads the same way forward and backwards.
	//Remember that uppercase and lowercase characters are distinct.
	public boolean isPalindrome(String s){
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				return false;
			}
		}
	return true;
}

	
	

	
	public boolean hasAdjacentRepeats(String s){
		for(int i=0; i<s.length();i++){
			if(s.charAt(i) == s.charAt(i+1)){
				return true;
			}
		}
		return false;
	}	

	public int firstIndexofAdjcentRepeats(String s){
		for(int i=0; i<s.length();i++){
			if(s.charAt(i) == s.charAt(i+1)){
				return s.charAt(i);			
			}
		}
				return -1;
	}	
		
	
	

	
	
	public String replaceVowels(String input){
		String replacement = "";
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i) == 'a' || input.charAt(i) == 'A' ||
			input.charAt(i) == 'e' || input.charAt(i) == 'E' ||
			input.charAt(i) == 'i' || input.charAt(i) == 'I' ||
			input.charAt(i) == 'o' || input.charAt(i) == 'O' ||
			input.charAt(i) == 'u' || input.charAt(i) == 'U'){
				replacement = replacement + "*";
			}
			else{
				replacement = replacement + input.charAt(i);
			
		}
		
	}
		return replacement;
		}

	
	public String replaceCharacters(String input, String targets, char c){
		String original = "";
		for(int i=0; i<input.length(); i++){
			for(int j=0; j<input.length(); j++){
			if(input.charAt(i) == targets.charAt(i)){
				original = original + c;
			}
		}}
		return original;
	}}



	