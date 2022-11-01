import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
		frame = new JFrame();
		frame.setTitle("Random Labels");
		frame.setBounds(100, 100, 300+24, 300+46);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		int nLabels = 20;
		int widthLabel = 10;
		int heightLabel = 10;
		Color colorLabel = Color.BLUE;
		Point from = new Point(50, 50);
		Point to = new Point(250, 250);
		
		for (Integer i=0; i.intValue()<nLabels; i++) {
			JLabel jl = new JLabel();
			jl.setBackground( colorLabel );
			jl.setSize(widthLabel, heightLabel);
			jl.setOpaque(true);
			jl.setLocation(
					(int)(Math.random()*(to.x - from.x)) + from.x,
					(int)(Math.random()*(to.y - from.y)) + from.y );
			frame.getContentPane().add( jl );
		}
		
	}

}
