package code;



public class WriteUp {
	public int [] Solution (String s){
		int []array = new int [3];
		for (int i = 0; i< s.length(); i++){
			char ch = Character.toLowerCase(s.charAt(i));
				if (ch >= 'a' && ch <= 'z'){
					if (ch < 'e'){
						array[0]++;
					}
					else{
						array[1]++;
					}}
				else{
					array[2]++;
					}
				}
			return array;
		}



	
	
public int smallestnumber (int []a){
	int small = a[0];
	for (int i = 0; i< a.length; i++){
		if (small>a.length){
			small = a.length;
		}
	}
	return small;
}



public int smallestindex (int[]a){
	int small = a[0];
	int index = 0;
	for (int i = 0; i<a.length; i++){
		if(small > a.length){
			small = a.length;
			index = 1;
		}
	}
	return index;
}
}
