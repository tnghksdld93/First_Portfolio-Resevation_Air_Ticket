package com.itwill.UI.혜원;	//회원정보 수정 및 탈퇴

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdatePassenger extends JPanel {
	private JTextField idTF;
	private JTextField rePswTF;
	private JTextField newPswTF;
	private JTextField nameTF;
	private JTextField birthDateTF;
	private JTextField phoneNoTF;

	/**
	 * Create the panel.
	 */
	public UpdatePassenger() {
		setBackground(SystemColor.inactiveCaption);
		setLayout(null);
		
		JLabel titleLabel = new JLabel("내 계정 정보");
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(247, 10, 146, 72);
		add(titleLabel);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(144, 93, 84, 21);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 재입력");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1.setBounds(82, 140, 131, 21);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("새 비밀번호");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(109, 182, 84, 21);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이름");
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(159, 225, 84, 21);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("생년월일");
		lblNewLabel_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(129, 270, 84, 21);
		add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("휴대전화");
		lblNewLabel_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(129, 317, 84, 21);
		add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("문자수신여부");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(98, 363, 104, 21);
		add(lblNewLabel_1_1_1_1_1_1);
		
		idTF = new JTextField();
		idTF.setBounds(257, 90, 131, 21);
		add(idTF);
		idTF.setColumns(10);
		
		rePswTF = new JTextField();
		rePswTF.setColumns(10);
		rePswTF.setBounds(257, 139, 131, 21);
		add(rePswTF);
		
		newPswTF = new JTextField();
		newPswTF.setColumns(10);
		newPswTF.setBounds(257, 181, 131, 21);
		add(newPswTF);
		
		nameTF = new JTextField();
		nameTF.setColumns(10);
		nameTF.setBounds(257, 224, 131, 21);
		add(nameTF);
		
		birthDateTF = new JTextField();
		birthDateTF.setColumns(10);
		birthDateTF.setBounds(257, 269, 131, 21);
		add(birthDateTF);
		
		phoneNoTF = new JTextField();
		phoneNoTF.setColumns(10);
		phoneNoTF.setBounds(257, 316, 131, 21);
		add(phoneNoTF);
		
		JCheckBox messageRecevieCHK = new JCheckBox("");
		messageRecevieCHK.setBounds(258, 361, 21, 23);
		add(messageRecevieCHK);
		
		JButton pswConfirmButton = new JButton("확인");
		pswConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if(rePswTF.getText() == )
				JOptionPane.showMessageDialog(null, "확인 되었습니다");
			}
		}); 
		pswConfirmButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		pswConfirmButton.setBounds(413, 140, 57, 23);
		add(pswConfirmButton);
		
		JButton deleteAccountButton = new JButton("회원탈퇴");
		deleteAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "탈퇴 되었습니다");
			}
		});
		deleteAccountButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		deleteAccountButton.setBounds(477, 140, 84, 23);
		add(deleteAccountButton);
		
		JButton editButton = new JButton("수정");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "수정 되었습니다");
			}
		});
		editButton.setBounds(219, 419, 97, 23);
		add(editButton);
		
		JButton cancelButton = new JButton("취소");
		cancelButton.setBounds(365, 419, 97, 23);
		add(cancelButton);

	}
}
 