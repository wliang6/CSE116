package code;
import util.general.CharacterFromFileReader;
import java.util.HashMap;
public class Homework5Practice {

	public HashMap<String, Integer> solution(String inputPath){
		
		if(inputPath == null){
			throw new IllegalArgumentException();
		}
		else{
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			CharacterFromFileReader c = new CharacterFromFileReader (inputPath);
			String word = "";
			int state = 0;
			
			while(c.hasNext()){
			char temp = c.next();
			
			switch(state){
			case 0:
				if(temp == '<'){
					state = 1;
				}
				else{
					state = 0;
				}
				break;
			
			case 1:
				if(temp == 'A'){
					state = 2;
				}
				else if(temp == '<'){
					state = 1; 
				}
				else{
					state = 0;
				}
				break;
			
			case 2:
				if(temp == 'U'){
					state = 3;
				}
				else if(temp == '<'){
					state = 1;
				}
				else{
					state = 0;
				}
				break;
				
			case 3:
				if(temp == '>'){
					state = 4;
				}
				else if(temp == '<'){
					state = 1;
				}
				else{
					state = 0;
				}
				break;
			case 4:
				if(temp == '<'){
					//move into closing tag states
					state = 5;
				}
				else{
					word += temp;
				}
				break;
			case 5:
				if(temp == '/'){
					state = 6;
				}
				else if(temp == '<'){
					word += temp;
					state = 5;
				}
				else{
					word += "<"; 
					word += temp;
					state = 4;
				}
				break;
			case 6:
				if(temp == 'A'){
					state = 7;
				}
				else if (temp == '<'){
					word += "</";
					state = 5;
				}
				else{
					word += "</" + temp;
					state = 4;
				}
				break;
			case 7:
				if(temp == 'U'){
					state = 8;
				}
				else if (temp == '<'){
					word += "</A";
					state = 5;
				}
				else{
					word += "</A";
					word += temp;
					state = 4;
				}
				break;
			case 8:
				if(temp == '>')
				{
					// check word in hashmap
					// return state back to 0
					// return word back to ""
					
					if(map.containsKey(word)){
						int oldValue = map.get(word);
						int newValue = oldValue +1;
						map.put(word,  newValue);
						state = 0;
						word = "";
					}
					else{
						map.put(word,1);
						state = 0;
						word = "";
					}
				}
				else if(temp == '<'){
					word += "</AU";
					state = 5;
				}
				else{
					word += "</AU";
					word += temp;
					state = 4;
				}
				break;
				}
			
		
		return map;
			}
		}
	}
}
