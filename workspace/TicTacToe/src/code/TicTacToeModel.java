package code;
import java.util.ArrayList;
import java.util.Observable;

public class TicTacToeModel extends Observable {
//representation of a board
	private Player [][] _board;  //creates 2d array
	private ArrayList<Player> _players; //arraylist to store all players
	
	public TicTacToeModel(){
		_board = new Player[3][3]; //creates 3x3 board
		_players = new ArrayList<Player>();
		_players.add(new Player('X')); //adds X and O from player class
		_players.add(new Player('O'));
	}
	
	private void switchPlayers(){
		//X O 
		_players.add(_players.remove(0)); 
	}
	
	public void mark(int row, int col){
		_board[row][col] = _players.get(0);
		switchPlayers(); //switch players after the marker is placed
		setChanged(); //inherited from Observable class
		notifyObservers(); //inherited as well
		
	}
	
	@Override //comes from object superclass
	public String toString(){
		
		StringBuffer sb = new StringBuffer();  //a class that helps with String concatenation. 'a'+'bc' = 'abc'
		for(int i=0; i<_board.length; i++){
			for(int j=0; j<_board[i].length; j++){
				Player who = _board[i][j];
				if(who == null){
					sb.append(' '); //append is the same as adding/concatenating
				}
				else{
					sb.append(who.getMark());
				}
			}
		}
		return sb.toString();
	}
}
