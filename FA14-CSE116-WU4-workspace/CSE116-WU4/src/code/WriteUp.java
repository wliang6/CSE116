package code;

public class WriteUp {
public int [][] solution (int [][] A){
	int [][] AT = new int [A[0].length][A.length];
	for (int i = 0; i<A.length; i++){
		for (int j = 0; j<A[0].length; j++){
			AT [j][i] = A[i][j];
		}
	}
	return AT;
}
}
