package sub02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Font;

public class ConponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConponentTest frame = new ConponentTest();
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
	public ConponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setBounds(12, 10, 100, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("button 컴포넌트");
		lblNewLabel_1.setBounds(22, 38, 90, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1 클릭...");
			}
		});
		btn1.setBounds(5, 63, 80, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼 2 클릭");
			}
		});
		btn2.setBounds(96, 63, 80, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼 3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼 3 클릭..","대화상자 제목",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(184, 63, 80, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼 4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("yes클릭...");
				}else {
					System.out.println("No클릭...");
				}
			}
		});
		btn4.setBounds(284, 63, 80, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(12, 108, 117, 15);
		contentPane.add(lblNewLabel_2);
		
		txtf1 = new JTextField();
		txtf1.setBounds(13, 133, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setBounds(13, 164, 116, 21);
		contentPane.add(txtf2);
		txtf2.setColumns(10);
		
		txtf3 = new JTextField();
		txtf3.setBounds(13, 195, 116, 21);
		contentPane.add(txtf3);
		txtf3.setColumns(10);
		
		JLabel lblTxtf1Result = new JLabel("결과 :");
		lblTxtf1Result.setBounds(202, 139, 90, 15);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과 :");
		lblTxtf2Result.setBounds(202, 170, 90, 15);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과 :");
		lblTxtf3Result.setBounds(202, 201, 90, 15);
		contentPane.add(lblTxtf3Result);
		
		JButton btnTxtf1 = new JButton("확인");
		btnTxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과 : "+txt);
				
			}
		});
		btnTxtf1.setBounds(130, 132, 60, 23);
		contentPane.add(btnTxtf1);
		
		JButton btnTxtf2 = new JButton("확인");
		btnTxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2 = txtf2.getText();
				lblTxtf2Result.setText("결과 : "+txt2);
			}
		});
		btnTxtf2.setBounds(130, 163, 60, 23);
		contentPane.add(btnTxtf2);
		
		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt3 = txtf3.getText();
				lblTxtf3Result.setText("결과 : "+txt3);
			}
		});
		btnTxtf3.setBounds(130, 194, 60, 23);
		contentPane.add(btnTxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 226, 117, 15);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(14, 281, 50, 23);
		contentPane.add(chk1);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요");
		lblNewLabel_4.setBounds(28, 251, 129, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(79, 281, 50, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(140, 281, 50, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(202, 281, 50, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(266, 281, 50, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 :");
		lblChkResult.setBounds(22, 321, 230, 15);
		contentPane.add(lblChkResult);
		
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				lblChkResult.setText("결과 : "+chks.toString());
			}
		});
		btnChk.setBounds(326, 281, 60, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_5.setBounds(28, 359, 129, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(22, 396, 50, 23);
		contentPane.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(79, 396, 50, 23);
		contentPane.add(rdFemale);
		
		JLabel lblGenderResult = new JLabel("결과 :");
		lblGenderResult.setBounds(22, 428, 230, 15);
		contentPane.add(lblGenderResult);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdFemale);
		bg.add(rdMale);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> gender = new ArrayList<>();
				
				if(rdMale.isSelected()) {
					gender.add(rdMale.getText());
				}
				else {
					gender.add(rdFemale.getText());
				}
				
				
				lblGenderResult.setText("결과 : "+gender.toString());
			}
		});
		btnGender.setBounds(130, 396, 60, 23);
		contentPane.add(btnGender);
		
		
	
		
	
	}
}
