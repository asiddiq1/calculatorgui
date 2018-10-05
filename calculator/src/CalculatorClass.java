import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorClass {

	private JFrame frame;
	private JTextField txtNum;
	private JTextField txtNum_1;
	private JTextField textans;
	private JButton btnX;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorClass window = new CalculatorClass();
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
	public CalculatorClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNum = new JTextField();
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNum.setBounds(51, 51, 186, 65);
		frame.getContentPane().add(txtNum);
		txtNum.setColumns(10);
		
		txtNum_1 = new JTextField();
		txtNum_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNum_1.setBounds(251, 51, 207, 65);
		frame.getContentPane().add(txtNum_1);
		txtNum_1.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 45));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans; 
				
				try {
					
					num1 = Integer.parseInt(txtNum.getText());
					num2 = Integer.parseInt(txtNum_1.getText());
					
					ans = num1 + num2; 
					textans.setText(Integer.toString(ans));
					
				}catch(Exception x)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
				
			}
		});
		btnNewButton.setBounds(71, 157, 81, 54);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans; 
				
				try {
					
					num1 = Integer.parseInt(txtNum.getText());
					num2 = Integer.parseInt(txtNum_1.getText());
					
					ans = num1 - num2; 
					textans.setText(Integer.toString(ans));
					
				}catch(Exception x1)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
				
				
			}
		});
		btnNewButton_1.setBounds(165, 157, 72, 54);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("The answer is:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(71, 387, 166, 46);
		frame.getContentPane().add(lblNewLabel);
		
		textans = new JTextField();
		textans.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textans.setBounds(251, 385, 180, 53);
		frame.getContentPane().add(textans);
		textans.setColumns(10);
		
		btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans; 
				
				try {
					
					num1 = Integer.parseInt(txtNum.getText());
					num2 = Integer.parseInt(txtNum_1.getText());
					
					ans = num1 * num2; 
					textans.setText(Integer.toString(ans));
					
				}catch(Exception x2)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
				
				
				
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnX.setBounds(252, 157, 72, 54);
		frame.getContentPane().add(btnX);
		
		btnNewButton_2 = new JButton("\u00F7 ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans; 
				
				try {
					
					num1 = Integer.parseInt(txtNum.getText());
					num2 = Integer.parseInt(txtNum_1.getText());
					
					ans = num1 / num2; 
					textans.setText(Integer.toString(ans));
					
				}catch(Exception x3)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
				
				
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2.setBounds(340, 157, 81, 54);
		frame.getContentPane().add(btnNewButton_2);
	}
}
