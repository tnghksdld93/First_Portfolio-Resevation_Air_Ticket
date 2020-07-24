package com.itwill.UI.main;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainPanel extends JPanel {
	
	FlightReservationMainFrame flightReservationMainFrame;
	/**
	 * Create the panel.
	 */
	public MainPanel() {
		setBackground(Color.GRAY);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 680, 680);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\stu01\\git\\teamproject-flight\\이륙사진.jpg"));
		lblNewLabel.setBounds(79, 0, 601, 400);
		panel.add(lblNewLabel);

	}

	public void setMainFrame(FlightReservationMainFrame flightReservationMainFrame) {
		this.flightReservationMainFrame = flightReservationMainFrame;
	}
}
