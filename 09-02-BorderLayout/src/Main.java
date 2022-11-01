import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Main {

	private JFrame frmBorderlayoutPractice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBorderlayoutPractice.setVisible(true);
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
		frmBorderlayoutPractice = new JFrame();
		frmBorderlayoutPractice.setTitle("BorderLayout Practice");
		frmBorderlayoutPractice.setBounds(100, 100, 400, 200);
		frmBorderlayoutPractice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBorderlayoutPractice.getContentPane().setLayout(new BorderLayout(5, 7));
		
		JButton btnNewButton = new JButton("West");
		frmBorderlayoutPractice.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("East");
		frmBorderlayoutPractice.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("North");
		frmBorderlayoutPractice.getContentPane().add(btnNewButton_2, BorderLayout.NORTH);
		
		JButton btnNewButton_3 = new JButton("South");
		frmBorderlayoutPractice.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("Center");
		frmBorderlayoutPractice.getContentPane().add(btnNewButton_4, BorderLayout.CENTER);
	}

}
