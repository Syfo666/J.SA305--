import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class lect4 extends JFrame{

	public lect4() {
		super();
	
	add(new Board());
	setTitle("S damn");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				JFrame frame = new lect4();
				frame.setVisible(true);
			}
		});
		
	}

}
