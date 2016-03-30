package code;

public class solution {
	
//Method 1 encoding .. A = N, B = 0, C = P, D = Q, E = R.. so forth
	public static String encode (String s){
		String coded = "";
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c >= 'a' && c <= 'z'){
				int z = c - 'a';     //finding the value of the letter 
				z += 13;             //since A = N.. it starts on the 13th letter of the alphabet
				z %= 26;             //loops around the alphabet after it finishes one cycle
				c = (char)(z + 'a');
				coded = coded + c;
			}
			else if(c>= 'A' && c<= 'Z'){
				int z = c - 'A'; 
				z += 13; 
				z %= 26;
				c = (char)(z + 'A');
				coded = coded + c;
			}
			else{
			   coded = coded + c; 
			}
		}
		return coded;}
	
				
//Method 2
	public static String encode1 (String encode, String keyword){
		String coded = "";
		String newcode = helpermethodencode1(keyword);    //from helper method 1
		for(int i=0; i<keyword.length();i++){
			char c = keyword.charAt(i);
			if(c>= 'A' && c<= 'Z'){
				int value = c - 'A';
				char z = newcode.charAt(value);    //pulling out characters from the new encrypted code; we SEE what the characters are in their certain positions
				coded = coded + z; //basically the deciphering process of turning the first string "encode" into the new encrypted string using the newcode system we made
			}
			else{
				coded = coded + c;  //any other characters besides the alphabet, you just include it (for ex. !, you include !)
			}
		}
		return coded;
	}
	
	public static String helpermethodencode1 (String abc){    //encoder
		String cipher = "";
		for(int i=0; i<abc.length();i++){
			char c = abc.charAt(i);
			cipher = cipher + c;                          
		}
		for(char c = 'A'; c <= 'Z'; c++){
			if(charinString(c, abc) != true){     //
				cipher = cipher + c;
			}
			}
		return cipher;
		}
		
	
	public static boolean charinString(char c, String s){    //check if characters are in that particular string, then return true
		for(int i=0; i<s.length(); i++){
			if(c == s.charAt(i)){
				return true;
			}
		}
		return false;
		
	}

	


		
		
//Method 4
	public static boolean anagram (String input1, String input2){
		 int ln1=0;
		 int ln2=0;
		 input1.toLowerCase();
		 input2.toLowerCase();
		 int a=0;
		 for(int i=0; i<input1.length(); i++){
		 if(input1.charAt(i)!=' '){
			 ln1++;
		 }
	}
		 for (int i=0; i<input2.length(); i++){
			 if(input2.charAt(i)!=' '){
				 ln2++;	 
			 }
		 }
		 for (int i=0; i<input1.length(); i++){	
			 char ch=input1.charAt(i);
			 if(isIn(input2,ch)){
				 a++;
		 }
	 }	 
		 if(ln1==ln2){		 
			 if(ln1==a){	 
				 return true;
			 }
		}
		 return false;
		 }
		 
		private static boolean isIn(String input2, char ch) {
		if(ch!=' '){
		 for (int i=0; i<input2.length(); i++){ 
			 if(input2.charAt(i)==ch){
				 return true;
			 }
		 }
		 return false;
	}
	return false;
}
		
			
		

//Method 5- swapping 2 elements' positions in an array
	public static int [] swap (int[] inputarray, int first, int second){

			int temp = inputarray[first];
			inputarray[first] = inputarray[second];
			inputarray[second] = temp;
		
		return inputarray;
		
	}

//Method 6- alternating elements in a new array from 2 equal length arrays
	public static int[] zip(int[] array1, int[] array2) {
		int size = array1.length;
		int size2 = array2.length;
		int[] zipped = new int [size+size2];
		int place = 0;
		int place2 = 1;
		int counter = 0;
		int counter2 = 0; 
		while(counter < size){
			int temp = array1[counter];
			zipped[place] = temp;
			counter = counter + 1;
			place = place + 2;
		}
		while(counter2 < size2){
			int temp2 = array2[counter2];
			zipped[place2] = temp2;
			counter2 = counter2 + 1;
			place2 = place2 + 2;
		}
		return zipped;
	}
		/*for(int i=0; i<zipped.length-1; i=i+2){
			for(int j=0; i<array1.length-1; i=i+1){
				int first = array1[j];
				int second = array2[j];
				zipped[i] = first;
				zipped[i+1] = second;
			}
		}
			return zipped;
		}
		
	
		*/
		
		

		

//Method 7- merging two arrays together and rearranging from smallest to biggest
	public static int [] merge(int[] array1, int[] array2, int [] merged) {
		int size = array1.length;
		int size2 = array2.length;
		merged = new int [size + size2];
		int countersize = 0;
		int counter1 = 0;
		int counter2 = 0;
		while(counter1 < size && counter2 < size2){
			if(array1[counter1] <= array2[counter2]){
				merged[countersize] = array1[counter1];
				countersize = countersize + 1;
				counter1 = counter1 + 1;
			}
			else if(array2[counter2] <= array1[counter1]){
				merged[countersize] = array2[counter2];
				countersize = countersize + 1;
				counter2 = counter2 + 1;
			}
			else if(array1[counter1] <= array1[counter1+1]){
				merged[countersize] = array1[counter1];
				countersize = countersize + 1;
				counter1 = counter1 + 1;
			}
			else if(array2[counter2] <= array2[counter2 + 1]){
				merged[countersize] = array2[counter2];
				countersize = countersize + 1;
				counter2 = counter2 + 1;
			}
		}
		return merged;	
	}
	
		
	}
	
	

