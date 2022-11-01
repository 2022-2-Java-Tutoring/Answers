import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_0;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JTextPane textPane;
	private JTextPane textPane_1;

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
		frame.setTitle("계산기 프레임");
		frame.setBounds(100, 100, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		textPane_1 = new JTextPane();
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setEditable(false);
		textPane_1.setText("수식 입력");
		panel.add(textPane_1);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(20);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		textPane = new JTextPane();
		textPane.setBackground(Color.YELLOW);
		textPane.setEditable(false);
		textPane.setText("계산 결과");
		panel_1.add(textPane);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(20);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 4, 2, 2));
		
		btnNewButton_0 = new JButton("0");
		panel_2.add(btnNewButton_0);
		
		btnNewButton_1 = new JButton("1");
		panel_2.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("2");
		panel_2.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("3");
		panel_2.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("4");
		panel_2.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("5");
		panel_2.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("6");
		panel_2.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("7");
		panel_2.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("8");
		panel_2.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("9");
		panel_2.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("CE");
		panel_2.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("계산");
		panel_2.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("+");
		btnNewButton_12.setBackground(Color.CYAN);
		panel_2.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("-");
		btnNewButton_13.setBackground(Color.CYAN);
		panel_2.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("x");
		btnNewButton_14.setBackground(Color.CYAN);
		panel_2.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("/");
		btnNewButton_15.setBackground(Color.CYAN);
		panel_2.add(btnNewButton_15);

	}

}
