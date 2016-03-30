package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

	private TicTacToeModel _model;
	private int _row;
	private int _col;
	public ButtonHandler (int i, TicTacToeModel model){
		_model = model;
		_row = i/3;
		_col = i%3;
		
	
	}
	public void actionPerformed(ActionEvent e) {   //looks at the mark in the TicTacToeModel
		// TODO Auto-generated method stub
		_model.mark(_row, _col);

	}

}
