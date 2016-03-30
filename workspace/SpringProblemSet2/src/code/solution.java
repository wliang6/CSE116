package code;
// int.parseInt(String, int) === allows you to get an int out of a hexadecimal value

public class solution {
// method 1
	public static int x2ten(String s, int base){
		int sum = 0;
		for(int i=0; i<s.length();i++){
			int index = s.length()- (i+1);
			char c = s.charAt(index); //we begin at the end of the string for calculation
			int d = charToInt(c);
			if(d == -1){
				return -1;
			}
			sum = (int) (sum + d*Math.pow(base, i));
		}
		return sum;
	}
	
	public static int charToInt(char character){
		if(character >= '0' && character <= '9'){
			return  character - '0'; //according to ASCII chart... '0' is 48
		}
		else if(character >= 'A' && character <= 'Z'){
			return character - 'A' + 10; //according to ASCII chart, 'A' is 65
		}
		else{
			return -1;
		}
	}
	
	
	
/*	public int x2ten(String s, int a){
		int sum = 0;
		for(int i=0; i<s.length(); i++){
			int index = s.length()- (i+1);
			//interpret charAt(index)
			sum = sum + y*(n^i) // Math.pow
		}
	}
	return sum;
  }
}*/
	

//method 2
	public static String ten2x (int number, int base){
		String sum = ""; 
		for(int i=0; i>=0; i/=base){
			int remainder = i%base; 
			char c = intToChar(remainder);
			sum = c + sum;
			
		}
		return sum;
	}
	
	public static char intToChar(int x){
		if(x >= 0 && x <=9){
			return (char)(x + '0');
			
		}
		else if(x>= 10 && x <= 36){
			return (char)(x+'A' -10);
		}
		return 0;
		
	}

	
	
//method 3
	public static int sumOfDigits (String s){
		int sum = 0;
		for(int i=0; i<s.length(); i++){
		if(s.charAt(i)<= 9){
				sum += s.charAt(i);
			}
		}
		return sum;
		
}
	
	
//method 4
	public String x2y (String s, int x, int y){
		return s;
		
		
	}
	
	
//method 5
	public static int largest (int[]array){
		int largest = array[0];
		for(int i = 0; i<array.length; i++){
			if(array[i] > largest){
				largest = array[i];
			}
		}
		return largest;
	}
	
	
//method 6
	public static int indexOfLargest (int[]array){
		int largest = array[0];
		int index = 0;
		for(int i = 0; i<array.length; i++){
			if(array[i] > largest){
				largest = array[i];
				index = i;
			}
		}
		return index;
	}
	
	

	
//method 7
	public static int [] countAll (String s){
		int [] array = new int [27];
		for(int i=0; i<s.length(); i++){
			char c = Character.toLowerCase(s.charAt(i)); //this method changes all capitals to lower case
			if(c >= 'a' && c <= 'z'){
				if(c <= 'e'){
					array[0]++;
				}
				else if(c >= 'e'){
					array[1]++;
				}
				else{
					array[2]++;
				}
			}
		}
		return array;
	}
	
	


	}