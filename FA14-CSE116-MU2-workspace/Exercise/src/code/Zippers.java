package code;

import java.util.ArrayList;

public class Zippers {
	
	/**
	 * YOUR TASK: Define this method so that it returns a new array of int which
	 * contains the items in the arrays r and s interleaved.  For example, if 
	 * r contains 1, 3, and 5, in that order, and s contains 2, 4, and 6 (in that
	 * order) then the result must contain 1, 2, 3, 4, 5, and 6 (in that order).
	 * 
	 * You can assume that r and s will either have the same size, or r will
	 * contain just one more item than s.  For example, if r contains 1, 3, and 5,
	 * in that order, and s contains just 2 and 4 (in that order) then the result
	 * must contain 1, 2, 3, 4 and 5 (in that order).
	 * 
	 * SEE ALSO THE Zippers.pdf FOR A VISUAL DEPICTION OF WHAT THIS CODE IS
	 * SUPPOSED TO DO.
	 * 
	 * @param r
	 * @param s
	 * @return the array which results from zipping r and s
	 */
	public int[] zip(int[] r, int[] s) {
		// TODO: CSE116 students - define this method
		int x = 0;
		r = new int [x];
		s = new int [x];

		for(int i=0;i<r.length; i++){
			for(int j=0;j<s.length; j++){
	
				if (r[x] > s[x]){
					r[x] = s[x];}
		// need elements of each array and compare the values of those elements in order to re-arrange the order
			else{
				s[x]++;
			}
		}
			
		}
		return r; //wrong..
}
}