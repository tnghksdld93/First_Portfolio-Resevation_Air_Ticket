package com.itwill.UI.reservation;	//예매

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import org.jdatepicker.JDatePicker;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;


public class ReservationPanel extends JPanel {
	private JComboBox finishPointCB;
	private JDatePicker startDayDP;
	private JDatePicker comingDayDP;
	private JComboBox seatRatingCB;
	/**
	 * @wbp.nonvisual location=28,134
	 */
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel passengerTypePanel;
	private JSpinner adultCountSP;
	private JSpinner childCountSP;
	private JButton PassengerTypeB;
	
	
	/**
	 * Create the panel.
	 */
	public ReservationPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		passengerTypePanel = new JPanel();
		passengerTypePanel.setVisible(false);
		passengerTypePanel.setBackground(SystemColor.menu);
		passengerTypePanel.setLayout(null);
		passengerTypePanel.setBounds(118, 303, 175, 141);
		panel.add(passengerTypePanel);
		
		JLabel lblNewLabel = new JLabel("성인");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(36, 34, 62, 25);
		passengerTypePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("소아");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(36, 67, 62, 32);
		passengerTypePanel.add(lblNewLabel_1_1);
		
		adultCountSP = new JSpinner();
		adultCountSP.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		adultCountSP.setBounds(81, 35, 50, 24);
		passengerTypePanel.add(adultCountSP);
		
		childCountSP = new JSpinner();
		childCountSP.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		childCountSP.setBounds(81, 71, 50, 24);
		passengerTypePanel.add(childCountSP);
		
		finishPointCB = new JComboBox();
		finishPointCB.setBackground(Color.WHITE);
		finishPointCB.setModel(new DefaultComboBoxModel(new String[] {"","다낭", "파리", "런던", "마드리드", "뉴욕"}));
		finishPointCB.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		finishPointCB.setBounds(366, 101, 185, 67);
		panel.add(finishPointCB);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		textPane.setText("인천");
		textPane.setEditable(false);
		textPane.setBounds(171, 101, 112, 80);
		panel.add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		//ImageIcon객체를 생성
		String imgPath="C:\\Users\\STU-09\\Downloads\\pngwing.com.png";
		ImageIcon originIcon = new ImageIcon(imgPath);  
		//ImageIcon에서 Image를 추출
		java.awt.Image originImg = originIcon.getImage(); 
		//추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg= originImg.getScaledInstance(40, 38, Image.SCALE_SMOOTH );
		//새로운 Image로 ImageIcon객체를 생성
		ImageIcon Icon = new ImageIcon(changedImg);
		lblNewLabel_1.setIcon( Icon);
		lblNewLabel_1.setBounds(284, 119, 60, 38);
		panel.add(lblNewLabel_1);
		
		startDayDP = new JDatePicker();
		startDayDP.setBounds(118, 219, 175, 27);
		panel.add(startDayDP);
		
		comingDayDP = new JDatePicker();
		comingDayDP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comingDayDP.setBounds(332, 219, 175, 27);
		panel.add(comingDayDP);
		
		seatRatingCB = new JComboBox();
		seatRatingCB.setModel(new DefaultComboBoxModel(new String[] {"이코노미", "비즈니스"}));
		seatRatingCB.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		seatRatingCB.setBounds(332, 271, 175, 27);
		panel.add(seatRatingCB);
		
		JRadioButton oneWayRB = new JRadioButton("편도");
		oneWayRB.setBackground(Color.WHITE);
		oneWayRB.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		oneWayRB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state=e.getStateChange();
				if(state==ItemEvent.SELECTED) {
					comingDayDP.setEnabled(false);
				}
			}
		});
		
		oneWayRB.setBounds(25, 39, 60, 27);
		panel.add(oneWayRB);
		
		JRadioButton roundTripRB = new JRadioButton("왕복");
		roundTripRB.setBackground(Color.WHITE);
		roundTripRB.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		roundTripRB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int state=e.getStateChange();
				if(state==ItemEvent.SELECTED) {
					comingDayDP.setEnabled(true);
				}
			}
		});
		oneWayRB.setSelected(true);
		roundTripRB.setBounds(91, 36, 66, 32);
		panel.add(roundTripRB);
		buttonGroup.add(roundTripRB);
		buttonGroup.add(oneWayRB);
		
		
		PassengerTypeB = new JButton("탑승객 선택");
		PassengerTypeB.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		PassengerTypeB.addActionListener(new ActionListener() {
			boolean b=true;
			public void actionPerformed(ActionEvent e) {
				
				passengerTypePanel.setVisible(b);
				b=!b;
								
			}
			
			
		});
				
		
		PassengerTypeB.setBounds(118, 275, 175, 27);
		panel.add(PassengerTypeB);
		
		JButton searchB = new JButton("항공권 검색");
		searchB.setOpaque(false);
		searchB.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		searchB.setBounds(196, 335, 242, 47);
		panel.add(searchB);

	}
	
	public void countShow() {
		PassengerTypeB.setText(new String("성인 "+adultCountSP.getValue()+"명, 소아 "+childCountSP.getValue()+"명"));
	}
	
	
}
