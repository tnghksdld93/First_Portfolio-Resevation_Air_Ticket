package com.itwill.UI.logIn;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.passenger.PassengerService;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class JoinDialog extends JDialog {
	
	PassengerService passengerService;
	boolean isIdCheck = false;
	private final JPanel contentPanel = new JPanel();
	private JTextField idTF;
	private JTextField pwTF;
	private JTextField pwreTF;
	private JTextField nameTF;
	private JTextField birthTF;
	private JTextField phoneTF;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JoinDialog dialog = new JoinDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JoinDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(29, 25, 57, 15);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(29, 50, 57, 15);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호 재입력");
		lblNewLabel_2.setBounds(29, 75, 96, 15);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("이름");
		lblNewLabel_3.setBounds(29, 100, 57, 15);
		contentPanel.add(lblNewLabel_3);
		
		JLabel birthL = new JLabel("생년월일");
		birthL.setBounds(29, 125, 57, 15);
		contentPanel.add(birthL);
		
		JLabel phoneL = new JLabel("연락처");
		phoneL.setBounds(29, 150, 57, 15);
		contentPanel.add(phoneL);
		
		JCheckBox messageChk = new JCheckBox("문자수신여부");
		messageChk.setBounds(152, 172, 115, 23);
		contentPanel.add(messageChk);
		
		idTF = new JTextField();
		idTF.setBounds(151, 22, 116, 21);
		contentPanel.add(idTF);
		idTF.setColumns(10);
		
		pwTF = new JTextField();
		pwTF.setBounds(151, 47, 116, 21);
		contentPanel.add(pwTF);
		pwTF.setColumns(10);
		
		pwreTF = new JTextField();
		pwreTF.setBounds(152, 72, 116, 21);
		contentPanel.add(pwreTF);
		pwreTF.setColumns(10);
		
		nameTF = new JTextField();
		nameTF.setBounds(151, 97, 116, 21);
		contentPanel.add(nameTF);
		nameTF.setColumns(10);
		
		birthTF = new JTextField();
		birthTF.setBounds(151, 122, 116, 21);
		contentPanel.add(birthTF);
		birthTF.setColumns(10);
		
		phoneTF = new JTextField();
		phoneTF.setBounds(152, 147, 116, 21);
		contentPanel.add(phoneTF);
		phoneTF.setColumns(10);
		
		JButton idCheckBtn = new JButton("중복확인");
		idCheckBtn.setBounds(279, 21, 97, 23);
		contentPanel.add(idCheckBtn);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton signupBtn = new JButton("가입");
				signupBtn.setActionCommand("OK");
				buttonPane.add(signupBtn);
				getRootPane().setDefaultButton(signupBtn);
			}
			{
				JButton cancelBtn = new JButton("취소");
				cancelBtn.setActionCommand("Cancel");
				buttonPane.add(cancelBtn);
			}
		}
	}
}
