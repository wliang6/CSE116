package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import util.general.CharacterFromFileReader;

public class solution {

	//FINATE STATE MACHINE
//method 1
	public boolean drypaintsandwipe (String s){
		int s0 = 0;
		int s1 = 1;
		int s2 = 2;
		int s3 = 3;
		
		int currentState = s0;
		for(int i=0; i< s.length(); i++){
			char c = s.charAt(i);
			switch(currentState){
			case 0:
				if(c == 'P'){
					currentState = s2;
				}
				else if(c == 'S'){
					currentState = s1;
				}
				else{
					return false;
				}
				break;
			case 1:
				if(c == 'W'){
					currentState = s3;
				}
				else{
					return false;
				}
				break;
			case 2:
				if(c == 'D'){
					currentState = s0;
				}
				else if (c == 'S'){
					currentState = s1;
				}
				else{
					return false;
				}
				break;
			case 3:
				if(c == 'P'){
					currentState = s2;
				}
				else if(c == 'S'){
					currentState = s1;
				}
				else{
					return false;
				}
				break;
			}
		}	
		return true;
	}

	
//method 2
	public boolean method (String s){
		String word = "";
		
		
		return true;
		
	}
	
	
	
	

	
	
//method 3 - reads contents of a file one char at a time and segment the input each word at a time.
	//also keeps track of word counts in a java.util.HashMap<String, Integer>;
	
	public HashMap<String, Integer> accept (String inputFilePath){
	HashMap<String, Integer> map = new HashMap<String, Integer> ();
	CharacterFromFileReader cffr = new CharacterFromFileReader(inputFilePath);
	while (cffr.hasNext()){
		String s = readWord(cffr);
		if(s != ""){
			if(!map.containsKey(s)){
				map.put(s, 1);
			}
			else{
				map.put(s, map.get(s) + 1);
			}
		}
	}
	return map;
	}


	private String readWord (CharacterFromFileReader cffr) {
		String word = " ";
		char c = cffr.next();
		if(wordSeparator(c)){	
			return word;
		}
		else{
			word = word + 'c';
		}

		return word;
	}


	private boolean wordSeparator (char c){
		return c == ' ' || c == '.' || c == ',' || c == '\n' || c == '\t';
	}
	
	
	
	
	
	
	
	public HashMap<String,Integer>accept1(String path){
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		Scanner scan = null;
		try{
			scan = new Scanner(new File(path));
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			String word = "";
			for(int i=0; i<line.length(); ++i){
				if(line.charAt(i) != ' '){
					word += line.charAt(i);
				}
				else{
					if(map.containsKey(word)){
						map.put(word,  map.get(word) + 1);
					}
					else{
						map.put(word, 1);
						
					}
				}
			}
			if(word.equals("") == false){
				if(map.containsKey(word)){
					map.put(word, map.get(word)+1);
				}
				else{
					map.put(word, 1);
				}
				word = "";
			}
		}
		if(scan != null){
			scan.close();
		}
		
		return map;
	}
}
