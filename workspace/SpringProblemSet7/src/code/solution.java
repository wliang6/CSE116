package code;

import java.util.ArrayList;
import java.util.HashMap;

import util.general.CharacterFromFileReader;

public class solution {

//question 1 
public class SortedList <E extends Comparable <E>>{
	ArrayList<E> data; 
	public void insertItem (E item){ 
		for(int i=0; i<data.size(); i++){
			if(data.get(i).compareTo(item) < 0){ //if first position's value is smaller than item
					data.add(i, item); 
					return; 
				} 
			} 
			data.add(data.size()-1, item); 
		} 
	}


//question 2
public HashMap<String, Integer> map (String inputFilePath){
	HashMap<String, Integer> map = new HashMap<String, Integer> ();
	CharacterFromFileReader cffr = new CharacterFromFileReader (inputFilePath);
	while(cffr.hasNext()){
		String s = readWord(cffr);
		if(s != ""){
			if(!map.containsKey(s))
				map.put(s, 1);
		}
			else{
				map.put(s, map.get(s) + 1);
			}
	}
	return map;
}

private String readWord(CharacterFromFileReader cffr) {
	String word = " ";
	char c = cffr.next();
	if(wordSeparator(c)){
		return word;
	}
	else{
		word = word + c;
	}
	return word;
}

private boolean wordSeparator(char c) {
	return c == ' ' || c == '.' || c == ',' || c == '\n' || c == '\t';
}



}	
