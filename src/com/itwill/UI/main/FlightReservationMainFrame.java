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
import com.itwill.UI.reservationList.ReservationFindPanel;
import java.awt.BorderLayout;


public class FlightReservationMainFrame extends JFrame {

	private JPanel contentPane;
	String loginId = "";
	CardLayout cl_parentPanel;
	private JPanel parentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightReservationMainFrame frame = new FlightReservationMainFrame();
				
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
	public FlightReservationMainFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		parentPanel = new JPanel();
		contentPane.add(parentPanel);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		MainPanel mainPanel = new MainPanel();
		parentPanel.add(mainPanel, "name_259986977080600");
		
		ReservationPanel reservationPanel = new ReservationPanel();
		parentPanel.add(reservationPanel, "name_260006817583600");
		
		ReservationFindPanel reservationFindPanel = new ReservationFindPanel();
		parentPanel.add(reservationFindPanel, "name_260024961090700");
		
		JPanelUpdatePassenger panelUpdatePassenger = new JPanelUpdatePassenger();
		parentPanel.add(panelUpdatePassenger, "name_260042892476500");
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
