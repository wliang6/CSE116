package code;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TicTacToeGUI implements Observer, Runnable{  //runnable also acts as a driver

	private TicTacToeModel _model;
	private ArrayList<JButton> _buttons;
	
	public TicTacToeGUI(){
		_model = new TicTacToeModel();		
		_model.addObserver(this);               //tells who the observer is.. inherited from TicTacToe object
		_buttons = new ArrayList<JButton>();
	}
	
	public static void main(String[]args){
		SwingUtilities.invokeLater(new TicTacToeGUI());
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		String s = _model.toString();
		for(int i=0; i<s.length(); i++){
			_buttons.get(i).setText("" + s.charAt(i));
		}
		
	}
	
	public void run(){  //Layout managers
		JFrame window = new JFrame ("Best TicTacToe"); //title
		JPanel p = new JPanel ();
		p.setLayout(new GridLayout(3,3,1,1));
		for(int i=0; i<9; i++){
			JButton b = new JButton(" ");
			p.add(b); //adds the button to panel
			//add action listener
			b.addActionListener(new ButtonHandler(i,_model));
			_buttons.add(b);
		}
		window.add(p);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}

}
