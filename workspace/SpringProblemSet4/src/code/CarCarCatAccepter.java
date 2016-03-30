package code;

public class CarCarCatAccepter {
	public boolean accept(String s){
		int ACCEPT_STATE = 0;
		int S1 = 1;
		int S2 = 2;
		int S3 = 3;
		
		int currentState = S3;
//FINITE STATE MACHINES	 (LOOK AT DIAGRAM)
		for (int i=0; i<s.length(); i = i+1){
			char c = s.charAt(i);
			
			switch (currentState){   //c can be called anything! :D
			case 3:     
				if (c == 'c'){
					currentState = S1;
				}
				else{
					return false;
				}
				break; 				 //don't forget break statement at the end of each case!
			case 1:
				if (c == 'a'){
					currentState = S2;
				}
				else{
					return false;
				}
				break;
			case 2: 
				if (c == 'r'){
					currentState = S3;
				}
				else if (c == 't'){
					currentState = ACCEPT_STATE;
				}
				else{
					return false;
				}
				break;
			case 0:					//in ACCEPT_STATE but since there are no paths out and there's a character
					return false;	//we reject the string by returning false
			}
		}
		/* if (currentState == ACCEPT_STATE){
			return true;
		} */
		/*else{
			return false; */
		
		return currentState == ACCEPT_STATE;    //treated as a boolean statement (will return true if it's true)
		}
	}


