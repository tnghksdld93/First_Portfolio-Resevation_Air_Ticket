package com.itwill.UI.logIn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PassengerServiceFrameMain extends JFrame {

	private JPanel contentPane;
	PassengerMainPanel passengerMainPanel; //다이알로그 접근 위해 private 제거
	String loginId="";
	private JMenuItem loginMI;
	private JMenuItem logoutMI;
	private JMenuItem signupMI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerServiceFrameMain frame = new PassengerServiceFrameMain();
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
	public PassengerServiceFrameMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu passengerM = new JMenu("회원");
		menuBar.add(passengerM);
		//loginMI
		
		JMenuItem loginMI = new JMenuItem("로그인");
		loginMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					loginProcess();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		passengerM.add(loginMI);
		
		JMenuItem logoutMI = new JMenuItem("로그아웃");
		logoutMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logoutUI();
			}
		});
		logoutMI.setEnabled(false);
		passengerM.add(logoutMI);
		
		JMenuItem signupMI = new JMenuItem("회원가입");
		signupMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JoinDialog joinDialog = new JoinDialog();
				joinDialog.setVisible(true);
			}
		});
		passengerM.add(signupMI);
		
		JSeparator separator = new JSeparator();
		passengerM.add(separator);
		
		JMenuItem exitMI = new JMenuItem("종료");
		passengerM.add(exitMI);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		PassengerMainPanel passengerMainPanel = new PassengerMainPanel();
		contentPane.add(passengerMainPanel, BorderLayout.CENTER);
		//logoutUI();
		//loginProcess();
	}
	protected void loginProcess() throws Exception {
		/*
		 * 로그인다이알로그 띄우기
		 */
		 LoginDialog loginDialog=new LoginDialog();
		 loginDialog.setFrame(this);
		 
		 loginDialog.setModal(true);
		 loginDialog.setVisible(true);
	}
	
	public void loginUI(String id) {
		this.loginId=id;
		setTitle(this.loginId+" 님로그인");
		//passengerMainPanel.passengerTapPane.setSelectedIndex(1);
		//passengerMainPanel.passengerTapPane.setEnabledAt(1, true);
		
		loginMI.setEnabled(false);
		logoutMI.setEnabled(true);
		signupMI.setEnabled(false);
		
		
	}
	protected void logoutUI() {
		this.loginId="";
		setTitle(loginId);
		//passengerMainPanel.passengerTapPane.setSelectedIndex(0);
		//passengerMainPanel.passengerTapPane.setEnabledAt(0, false);
		//passengerMainPanel.passengerTapPane.setEnabledAt(1, false);
		
		loginMI.setEnabled(true);
		logoutMI.setEnabled(false);
		signupMI.setEnabled(true);
		
	
	}
}
