import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Point;

import javax.swing.JButton;

public class Main {

	private JFrame frame;
	private JTextField textField_1;

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
		frame.setTitle("여러 개의 패널을 가진 프레임");
		frame.setBounds(100, 100, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("열기");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("닫기");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("나가기");
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("Word Input");
		panel_1.add(btnNewButton_3);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(20);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		int nLabels = 10;
		Point from = new Point(1, 34);
		Point to = new Point(330, 220);
		for (Integer i=0; i.intValue()<nLabels; i++) {
			JLabel jl = new JLabel("*");
			jl.setForeground(Color.RED);
			jl.setBounds(
					(int)(Math.random()*(to.x - from.x)) + from.x,
					(int)(Math.random()*(to.y - from.y)) + from.y, 10, 10);
			frame.getContentPane().add( jl );
		}
		
		
	}
}
