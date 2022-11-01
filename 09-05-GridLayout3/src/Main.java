import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Color colors[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY, Color.PINK, Color.GRAY, Color.WHITE, Color.BLACK, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA};
		int nButtonsInARow = 4;
		int widthButton = 140;
		int nButtonsInACol = 4;
		int heightButton = 60;
		
		frame = new JFrame();
		frame.setTitle("4x4 Color Frame");
		frame.setBounds(100, 100, nButtonsInARow*widthButton, nButtonsInACol*heightButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(nButtonsInACol, nButtonsInARow, 0, 0));
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		for (Integer i=0; i.intValue()<nButtonsInARow*nButtonsInACol; i++) {
			JButton jb = new JButton( i.toString() );
			jb.setBackground( colors[i] );
			jb.setHorizontalAlignment(SwingConstants.LEFT);
			jb.setMargin(new Insets(0, 0, 0, 0));
			buttons.add( jb );
		}
			
		for (JButton jb : buttons)
			frame.getContentPane().add( jb );
		
	}

}
