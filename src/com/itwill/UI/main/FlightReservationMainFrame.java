package com.itwill.UI.main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.UI.logIn.LoginDialog;
import com.itwill.UI.reservationList.ReservationFindPanel;
import com.itwill.UI.updatePassenger.UpdatePassengerPanel;
import com.itwill.passenger.Passenger;
import com.itwill.UI.reservation.ReservationPanel;

public class FlightReservationMainFrame extends JFrame {

	private JPanel contentPane;
	/************************************/
	public String loginId = "";
	public Passenger loginPassenger;
	private CardLayout mainCardLayout;
	/**********************************/
	private JPanel parentPanel;
	private JMenuItem loginMenu;
	private JMenuItem logoutMenu;
	private JMenuItem updateMenu;
	private JMenuItem reservationMenu;
	private JMenuItem reservationInfoMenu;
	private JMenuItem shutdownMenu;
	
	private MainPanel mainPanel;
	private ReservationPanel reservationPanel;
	private ReservationFindPanel reservationFindPanel;
	//private UpdatePassengerPanel updatePassengerPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightReservationMainFrame frame = new FlightReservationMainFrame();
					frame.setVisible(true);
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
	 * 
	 * @throws Exception
	 */
	public FlightReservationMainFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 680);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("홈페이지");
		menuBar.add(mnNewMenu);
		
		loginMenu = new JMenuItem("로그인");
		mnNewMenu.add(loginMenu);
		
		logoutMenu = new JMenuItem("로그아웃");
		logoutMenu.setEnabled(false);
		logoutMenu.setSelected(true);
		mnNewMenu.add(logoutMenu);
		
		updateMenu = new JMenuItem("회원정보 수정");
		updateMenu.setEnabled(false);
		updateMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				changePanel("updatePassengerP");
			}
		});
		mnNewMenu.add(updateMenu);
		
		shutdownMenu = new JMenuItem("종료");
		shutdownMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnNewMenu.add(shutdownMenu);
		
		JMenu mnNewMenu_1 = new JMenu("예약");
		menuBar.add(mnNewMenu_1);
		
		reservationMenu = new JMenuItem("비행기 예약");
		reservationMenu.setEnabled(false);
		mnNewMenu_1.add(reservationMenu);
		
		reservationInfoMenu = new JMenuItem("예약정보 확인");
		reservationInfoMenu.setEnabled(false);
		mnNewMenu_1.add(reservationInfoMenu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		parentPanel = new JPanel();
		contentPane.add(parentPanel);
		mainCardLayout = new CardLayout(0, 0);
		parentPanel.setLayout(mainCardLayout);

		mainPanel = new MainPanel();
		parentPanel.add(mainPanel, "mainP");
		
		reservationPanel = new ReservationPanel();
		parentPanel.add(reservationPanel, "reservationP");
		
		reservationFindPanel = new ReservationFindPanel();
		parentPanel.add(reservationFindPanel, "reservationFindP");
		
		UpdatePassengerPanel updatePassengerPanel = new UpdatePassengerPanel();
		updatePassengerPanel.setMainFrame(this);
		parentPanel.add(updatePassengerPanel, "updatePassengerP");
		
		
		this.setTitle("비행기 예매 프로그램");
		mainPanel.setVisible(true);
		loginDialogShow();
		
		
	}

	public void loginDialogShow() throws Exception {
		/*
		 * 로그인 다이얼로그
		 */
		LoginDialog loginDialog = new LoginDialog();
		loginDialog.setMainFrame(this);
		
		
		
		loginDialog.setModal(true);
		loginDialog.setVisible(true);
	}

	

	public void loginSuccess(String id, Passenger p) {
		loginId = id;
		setTitle(id + "님 로그인");
		loginPassenger=p;
		changePanel("reservationP");
		
	}
	
	public void changePanel(String panelName) {
		mainCardLayout.show(parentPanel, panelName);
	}
}
