package TikalProject;
import javax.swing.JFrame;

public class Tile {
	public static Display f = new Display ();
	public static int w = 600;
	public static int h = 400;
	public static void main (String args []){
		f.setSize(w,h);
		f.setResizable(true);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Tikal");
		f.setLocationRelativeTo(null);
		
	}
	public static void setData() {
		// TODO Auto-generated method stub
		
	}

}