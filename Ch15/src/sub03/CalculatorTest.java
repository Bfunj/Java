package sub03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorTest() {
		setTitle("나의 계산기 v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 176, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(20, 65, 39, 38);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(60, 65, 39, 38);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(100, 65, 39, 38);
		contentPane.add(btn9);
		
		JButton btnDevide = new JButton("/");
		btnDevide.setBounds(140, 65, 39, 38);
		contentPane.add(btnDevide);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(20, 113, 39, 38);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(60, 113, 39, 38);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(100, 113, 39, 38);
		contentPane.add(btn6);
		
		JButton btnCom = new JButton("x");
		btnCom.setBounds(140, 113, 39, 38);
		contentPane.add(btnCom);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(20, 161, 39, 38);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(60, 161, 39, 38);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(100, 161, 39, 38);
		contentPane.add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(140, 161, 39, 38);
		contentPane.add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(20, 213, 39, 38);
		contentPane.add(btn0);
		
		JButton btnReset = new JButton("c");
		btnReset.setBounds(60, 213, 39, 38);
		contentPane.add(btnReset);
		
		JButton btnResult = new JButton("=");
		btnResult.setBounds(100, 213, 39, 38);
		contentPane.add(btnResult);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(140, 213, 39, 38);
		contentPane.add(btnPlus);
	}

}
