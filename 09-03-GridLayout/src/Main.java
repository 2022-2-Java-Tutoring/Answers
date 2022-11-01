import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
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
		int nButtonsInARow = 10;
		int widthButton = 55;
		
		frame = new JFrame();
		frame.setTitle("Ten Color Buttons Frame");
		frame.setBounds(100, 100, nButtonsInARow*widthButton, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, nButtonsInARow, 0, 0));
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		for (Integer i=0; i.intValue()<10; i++)
			buttons.add( new JButton(i.toString()) );
		for (JButton jb : buttons)
			frame.getContentPane().add( jb );
		
	}

}
