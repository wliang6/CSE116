package code;

public class Submission {
	
	public static int solution (String s){
		int timesteps = 0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(containsDirectionInput(ch)){
				for(int j=0; j<s.length(); j++){
					if(ch == 'M'){
						j = j + 1;
					}
					else if(ch == 'X'){
						j = j - 1;		
					}
					int index;
					index = j;
					timesteps = timesteps + index;
				}
			}
		}
	return timesteps;
	}


		
	

	public static boolean containsDirectionInput(char ch){
		if(ch == 'M'){
			return true;
		}
		else if(ch == 'X'){
			return true;
		}
		else{
			return false;
		}
	
	}
	}

