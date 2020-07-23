package com.itwill.UI.updatePassenger;	//회원정보 수정 및 탈퇴

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.itwill.passenger.Passenger;
import com.itwill.passenger.PassengerService;

public class JPanelUpdatePassenger extends JPanel {
	/************************************************/
	PassengerService passengerService;
	boolean isUpdate = false; //초기상태, true는 업뎃
	/************************************************/
	private JTextField idTF;
	private JTextField rePswTF;
	private JTextField newPswTF;
	private JTextField nameTF;
	private JTextField birthDateTF;
	private JTextField phoneNoTF;
	private JButton pswConfirmButton;
	private JButton deleteAccountButton;
	private JCheckBox messageRecevieCHK;
	
	/**
	 * Create the panel.
	 */
	public JPanelUpdatePassenger() {
		setBackground(SystemColor.inactiveCaption);
		setLayout(null);
		
		JLabel titleLabel = new JLabel("내 계정 정보");
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(267, 38, 146, 72);
		add(titleLabel);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(157, 161, 84, 21);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 재입력");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1.setBounds(95, 208, 131, 21);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("새 비밀번호");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(122, 250, 84, 21);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이름");
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(172, 293, 84, 21);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("생년월일");
		lblNewLabel_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(142, 338, 84, 21);
		add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("휴대전화");
		lblNewLabel_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(142, 385, 84, 21);
		add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("문자수신여부");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(111, 431, 104, 21);
		add(lblNewLabel_1_1_1_1_1_1);
		
		idTF = new JTextField();
		idTF.setEditable(false);
		idTF.setBounds(270, 158, 131, 21);
		add(idTF);
		idTF.setColumns(10);
		
		rePswTF = new JTextField();
		rePswTF.setColumns(10);
		rePswTF.setBounds(270, 207, 131, 21);
		add(rePswTF);
		
		newPswTF = new JTextField();
		newPswTF.setEditable(false);
		newPswTF.setColumns(10);
		newPswTF.setBounds(270, 249, 131, 21);
		add(newPswTF);
		
		nameTF = new JTextField();
		nameTF.setEditable(false);
		nameTF.setColumns(10);
		nameTF.setBounds(270, 292, 131, 21);
		add(nameTF);
		
		birthDateTF = new JTextField();
		birthDateTF.setEditable(false);
		birthDateTF.setColumns(10);
		birthDateTF.setBounds(270, 337, 131, 21);
		add(birthDateTF);
		
		phoneNoTF = new JTextField();
		phoneNoTF.setEditable(false);
		phoneNoTF.setColumns(10);
		phoneNoTF.setBounds(270, 384, 131, 21);
		add(phoneNoTF);
		
		messageRecevieCHK = new JCheckBox("");
		messageRecevieCHK.setEnabled(false);
		messageRecevieCHK.setBounds(271, 429, 21, 23);
		add(messageRecevieCHK);
		
		///확인 버튼 누르면 하단 TF 활성화
		pswConfirmButton = new JButton("확인");
		pswConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rePswTF.getText().equals(passengerService.memberPw ) &&
				   idTF.getText().equals(passengerService.memberId)) {
					JOptionPane.showMessageDialog(null, "확인 되었습니다");
					rePswTF.setEditable(true);
					newPswTF.setEditable(true);
					nameTF.setEditable(true);
					birthDateTF.setEditable(true);
					phoneNoTF.setEditable(true);
					messageRecevieCHK.setEnabled(true);
					deleteAccountButton.setEnabled(true);
					newPswTF.requestFocus();
					
				}
			}
		}); 
		pswConfirmButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		pswConfirmButton.setBounds(426, 208, 64, 23);
		add(pswConfirmButton);
		/*
		 * 1. 메인화면으로 이동 (JFrame)
		 * 2. 회원정보 ArrayList에서 삭제
		 */
		deleteAccountButton = new JButton("회원탈퇴");  
		deleteAccountButton.setEnabled(false);
		deleteAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "탈퇴 되었습니다");
			}
		});
		deleteAccountButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		deleteAccountButton.setBounds(502, 208, 84, 23);
		add(deleteAccountButton);
		
		JButton editButton = new JButton("수정");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    updateMember();     //왜 서비스에서 못불러오는지
				JOptionPane.showMessageDialog(null, "수정 되었습니다");
			}
		});
		editButton.setBounds(218, 529, 97, 23);
		add(editButton);
		
		JButton cancelButton = new JButton("취소");
		cancelButton.setBounds(364, 529, 97, 23);
		add(cancelButton);
		
		//passenger service 생성자
		try {
			passengerService = new PassengerService();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	protected void updateMember() {
		/*
		 * 수정완료시 TF 비활성화
		 */
		newPswTF.setEditable(false);
		nameTF.setEditable(false);
		birthDateTF.setEditable(false);
		phoneNoTF.setEditable(false);
		messageRecevieCHK.setEnabled(false);
		deleteAccountButton.setEnabled(false);
		/*
		 * 회원정보 ArrayList에 수정사항 반영
		 */
	
		
	}

	
		

		
	}


 