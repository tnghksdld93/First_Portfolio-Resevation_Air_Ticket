package com.itwill.UI.logIn;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.passenger.PassengerService;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginDialog extends JDialog {

	private PassengerService passengerService;
	private PassengerServiceFrameMain psframe;
	private final JPanel contentPanel = new JPanel();
	private JTextField idTF;
	private JPasswordField pwTF;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginDialog dialog = new LoginDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws Exception 
	 */
	public LoginDialog() throws Exception {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel idLb = new JLabel("아이디");
		idLb.setBounds(97, 71, 68, 15);
		contentPanel.add(idLb);
		
		JLabel pwLb = new JLabel("패스워드");
		pwLb.setBounds(97, 115, 68, 15);
		contentPanel.add(pwLb);
		
		idTF = new JTextField();
		idTF.setBounds(177, 68, 116, 21);
		contentPanel.add(idTF);
		idTF.setColumns(10);
		
		pwTF = new JPasswordField();
		pwTF.setBounds(177, 113, 116, 18);
		contentPanel.add(pwTF);
		
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String id = idTF.getText();
					String pw = String.valueOf(pwTF.getPassword());
					int result =  passengerService.login(id,pw);
					if(result==0) {
						//로그인 성공
						psframe.loginUI(id);
						JOptionPane.showMessageDialog(null, "로그인 성공");
						dispose();
						
					}else if(result==1) {
						//아이디 존재안함
						JOptionPane.showMessageDialog(null, "아이디 존재안함");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
					}else if(result==2) {
						//비밀번호 불일치
						JOptionPane.showMessageDialog(null, "비밀번호 불일치");
						pwTF.requestFocus();
						pwTF.setSelectionStart(1);
						pwTF.setSelectionEnd(pw.length());
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		loginBtn.setActionCommand("로그인");
		getRootPane().setDefaultButton(loginBtn);
		
		
		loginBtn.setBounds(97, 174, 97, 23);
		contentPanel.add(loginBtn);
		
		JButton cancelBtn = new JButton("취소");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //닫기
			}
		});
		cancelBtn.setBounds(239, 174, 97, 23);
		contentPanel.add(cancelBtn);
		
		JButton signupBtn = new JButton("회원가입");
		signupBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		signupBtn.setBounds(168, 228, 97, 23);
		contentPanel.add(signupBtn);
		passengerService=new PassengerService();
	}//end constructor
	public void setFrame(PassengerServiceFrameMain passengerServiceFrameMain) {
		this.psframe = passengerServiceFrameMain;
	}

}//End class
