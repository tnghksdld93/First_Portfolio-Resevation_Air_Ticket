package com.itwill.UI.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.itwill.UI.logIn.LoginDialog;
import com.itwill.UI.updatePassenger.JPanelUpdatePassenger;
import com.itwill.UI.reservation.ReservationPanel;


public class MainFrame extends JFrame {

	private JPanel contentPane;
	String loginId = "";
	private JTextField textField;
	private JTextField textField_1;
	private JPanel mainP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	public String getLoginId() {
		return loginId;
	}

	
	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MainFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		mainP = new JPanel();
		contentPane.add(mainP, "name_203722688980900");
		mainP.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\stu01\\git\\teamproject-flight\\이륙사진.jpg"));
		lblNewLabel.setBounds(89, 0, 565, 400);
		mainP.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 153, 255));
		panel_1.setBounds(0, 0, 89, 400);
		mainP.add(panel_1);
		panel_1.setLayout(null);
		
		JButton logInB = new JButton("로그인");
		logInB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginDialog loginDialog;
				try {
					loginDialog = new LoginDialog();
					loginDialog.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		logInB.setBounds(0, 135, 82, 28);
		panel_1.add(logInB);
		
		JButton shutdownB = new JButton("종료");
		shutdownB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		shutdownB.setBounds(0, 225, 82, 23);
		panel_1.add(shutdownB);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 400, 654, 231);
		mainP.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("어서오세요");
		textField.setBounds(0, 0, 654, 124);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("우리 여행사를 방문해 주셔서 감사합니다");
		textField_1.setBounds(0, 123, 654, 108);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		this.setTitle("비행기 예매 프로그램");
		setVisible(true);
		loginProgress();
	}
	public void loginProgress() throws Exception {
		/*
		 * 로그인 다이얼로그
		 */
		LoginDialog loginDialog = new LoginDialog();
		loginDialog.setFrame(this);
		loginDialog.setModal(true);
		loginDialog.setVisible(true);
	}

	public void loginUI(String id) {
		loginId = id;
		setTitle(id + "님 로그인");
		
	}
}
