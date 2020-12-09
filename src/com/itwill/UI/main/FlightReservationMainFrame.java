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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.UI.logIn.LoginDialog;
import com.itwill.UI.reservationList.ReservationFindPanel;
import com.itwill.UI.updatePassenger.UpdatePassengerPanel;
import com.itwill.passenger.Passenger;
import com.itwill.UI.reservation.ReservationPanel;
import javax.swing.JSeparator;

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
	private JMenuItem homepageMenu;
	private UpdatePassengerPanel updatePassengerPanel;


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
	 * 
	 * @throws Exception
	 */
	public FlightReservationMainFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 680);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("怨꾩젙愿�由�");
		menuBar.add(mnNewMenu);
		
		loginMenu = new JMenuItem("濡쒓렇�씤");
		loginMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					loginDialogShow();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		homepageMenu = new JMenuItem("�솃�쑝濡�");
		homepageMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel("mainP");
			}
		});
		mnNewMenu.add(homepageMenu);
		mnNewMenu.add(loginMenu);
		
		logoutMenu = new JMenuItem("濡쒓렇�븘�썐");
		logoutMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logout();
			}
		});
		logoutMenu.setEnabled(false);
		logoutMenu.setSelected(true);
		mnNewMenu.add(logoutMenu);
		
		updateMenu = new JMenuItem("�쉶�썝�젙蹂� �닔�젙");
		updateMenu.setEnabled(false);
		updateMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				changePanel("updatePassengerP");
			}
		});
		mnNewMenu.add(updateMenu);
		
		shutdownMenu = new JMenuItem("醫낅즺");
		shutdownMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		mnNewMenu.add(shutdownMenu);
		
		JMenu mnNewMenu_1 = new JMenu("�삁�빟");
		menuBar.add(mnNewMenu_1);
		
		reservationMenu = new JMenuItem("鍮꾪뻾湲� �삁�빟");
		reservationMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel("reservationP");
			}
		});
		reservationMenu.setEnabled(false);
		mnNewMenu_1.add(reservationMenu);
		
		reservationInfoMenu = new JMenuItem("�삁�빟�젙蹂� �솗�씤");
		reservationInfoMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel("reservationFindP");
			}
		});
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
		mainPanel.setMainFrame(this);
		parentPanel.add(mainPanel, "mainP");
		
		reservationPanel = new ReservationPanel();
		reservationPanel.setMainFrame(this);
		parentPanel.add(reservationPanel, "reservationP");
		
		reservationFindPanel = new ReservationFindPanel();
		reservationFindPanel.setMainFrame(this);
		parentPanel.add(reservationFindPanel, "reservationFindP");
		
		updatePassengerPanel = new UpdatePassengerPanel();
		updatePassengerPanel.setMainFrame(this);
		parentPanel.add(updatePassengerPanel, "updatePassengerP");
		
		
		this.setTitle("鍮꾪뻾湲� �삁留� �봽濡쒓렇�옩");
		
		mainPanel.setVisible(true);
		setVisible(true);
		loginDialogShow();
		
	}

	public void loginDialogShow() throws Exception {
		/*
		 * 濡쒓렇�씤 �떎�씠�뼹濡쒓렇
		 */
		
		LoginDialog loginDialog = new LoginDialog();
		loginDialog.setMainFrame(this);
		
		
		
		loginDialog.setModal(true);
		loginDialog.setVisible(true);
	}

	public void logout() {
		loginId = "";
		setTitle(loginId);
		loginMenu.setEnabled(true);
		logoutMenu.setEnabled(false);
		updateMenu.setEnabled(false);
		reservationMenu.setEnabled(false);
		reservationInfoMenu.setEnabled(false);
		JOptionPane.showMessageDialog(null, "濡쒓렇�븘�썐 �릺�뿀�뒿�땲�떎");
		changePanel("mainP");
	}

	public void loginSuccess(String id, Passenger p) {
		loginId = id;
		setTitle(id + "�떂 濡쒓렇�씤");
		loginPassenger=p;
		loginMenu.setEnabled(false);
		logoutMenu.setEnabled(true);
		updateMenu.setEnabled(true);
		reservationMenu.setEnabled(true);
		reservationInfoMenu.setEnabled(true);
		changePanel("reservationP");
		
	}
	
	public void changePanel(String panelName) {
		reservationFindPanel.setMainFrame(this);
		reservationPanel.setMainFrame(this);
		updatePassengerPanel.setMainFrame(this);
		mainCardLayout.show(parentPanel, panelName);
		
	}
}
