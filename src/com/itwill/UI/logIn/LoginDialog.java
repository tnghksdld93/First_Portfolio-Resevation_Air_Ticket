package com.itwill.UI.logIn;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

<<<<<<< HEAD

import com.itwill.UI.signUp.SignUpPanel;

import com.itwill.UI.main.MainFrame;
<<<<<<< HEAD

=======
=======
import com.itwill.UI.main.FlightReservationMainFrame;
>>>>>>> refs/remotes/origin/master
import com.itwill.UI.signUp.SignUpDialog;
>>>>>>> branch 'master' of https://github.com/2020-10-itwill-javapython/teamproject-flight.git
import com.itwill.passenger.PassengerService;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginDialog extends JDialog {

	private PassengerService passengerService;
<<<<<<< HEAD
	private PassengerServiceFrameMain frame;
=======
	private FlightReservationMainFrame frame;
>>>>>>> refs/remotes/origin/master
	private final JPanel contentPanel = new JPanel();
	private JTextField idTF;
	private JPasswordField pwTF;
	
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
						
						JOptionPane.showMessageDialog(null, "로그인에 성공했습니다.");
						dispose();
						
					}else if(result==1) {
						//아이디 존재안함
						JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
					}else if(result==2) {
						//비밀번호 불일치
						JOptionPane.showMessageDialog(null, "올바른 비밀번호를 입력하세요.");
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

				dispose();

			}
		});
		cancelBtn.setBounds(239, 174, 97, 23);
		contentPanel.add(cancelBtn);
		
		JButton signupBtn = new JButton("회원가입");
		signupBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpDialog signUpDialog = new SignUpDialog();
				signUpDialog.setVisible(true);
				signUpDialog.requestFocusInWindow();
				signUpDialog.setAlwaysOnTop(true);
				
				
				dispose();
			}
		});
		signupBtn.setBounds(168, 228, 97, 23);
		contentPanel.add(signupBtn);

		passengerService=new PassengerService();

		passengerService = new PassengerService();
<<<<<<< HEAD

=======
		
>>>>>>> branch 'master' of https://github.com/2020-10-itwill-javapython/teamproject-flight.git
	}//end constructor
	
<<<<<<< HEAD
	public void setFrame(PassengerServiceFrameMain passengerServiceFrameMain) {
		frame = passengerServiceFrameMain;
=======
	public void setFrame(FlightReservationMainFrame mainFrame) {
		frame = mainFrame;
>>>>>>> refs/remotes/origin/master
	}



	

}//End class
