package code;
import java.util.HashMap;

import util.general.CharacterFromFileReader;
public class WriteUp {
	public HashMap<String,Integer>Solution(String a){
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		CharacterFromFileReader c = new CharacterFromFileReader(a);
		int state = 0;
		char s = ""; 
		while(c.hasNext()){
			c.next();
			switch(state){
			case 1:
				if(s == '<'){
					state = 1;
				}
				else{
					state = 0;
				}
				break;
			case 2:
				if(s == 'A'){
					state = 2;
				}
				else if (s == '<'){
					state = 1;
				}
				else{
					state = 0;
				}
				break; 
			case 3:
				if(s == '>'){
					state = 3;
				}
				else if (s == '<'){
					state =1;
				}
				else{
					state = 0;
				}
				break;
			case 4:
				if(s == '<'){
					state = 4;
				}
				else{
					state = 3;
					a+=s;
				}
				break;
			case 5:
				if(s == '/'){
					state = 5;
				}
				else if (s == '<'){
					state = 4;
					a+=s;
					s+='/';
				}
				else{
					state = 3;
				}
				break;
			case 6:
				if(s == 'A'){
					state = 6;
				}
				else if (s == '<'){
					state = 4;
					a+=s;
					s+='<';
				}
				else{
					state = 3;
				}
				break;
				
			case 7:
				if(s == '>'){
					state = 7;
					addtomap(h,s);
				}
				else if (s == '<'){
					state = 4;
					a+=s; 
					s+='<';
				}
				else{
					state = 3;
				}
				break;
			default:
		}
		return map;
	}

public void addtomap(h, String s){
	if (s.containsKey()){
		s.put(s,h.get(s)+1);}
	else{
		s.put(s,1);
	}
}
	
}
}
