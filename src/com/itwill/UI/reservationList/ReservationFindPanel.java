package com.itwill.UI.reservationList;

import javax.swing.JPanel;

import java.awt.Checkbox;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.itwill.flight.FlightDAO;

import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservationFindPanel extends JPanel {
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public ReservationFindPanel() {
		setBackground(new Color(102, 153, 255));
		setLayout(null);
		
		JTextArea myReserve = new JTextArea();
		myReserve.setForeground(new Color(255, 255, 255));
		myReserve.setBackground(new Color(102, 153, 255));
		myReserve.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		myReserve.setText("MY 예약 내역");
		myReserve.setBounds(266, 10, 120, 32);
		add(myReserve);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("회원 정보");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(102, 153, 255));
		rdbtnNewRadioButton.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBounds(20, 47, 90, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("항공권 정보");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBackground(new Color(102, 153, 255));
		rdbtnNewRadioButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setBounds(20, 148, 95, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("탑승객 및 항공여행 정보");
		rdbtnNewRadioButton_2.setSelected(true);
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBackground(new Color(102, 153, 255));
		rdbtnNewRadioButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_2.setBounds(20, 395, 177, 23);
		add(rdbtnNewRadioButton_2);
		
		JScrollPane customInfoScrollP = new JScrollPane();
		customInfoScrollP.setBounds(30, 76, 598, 50);
		add(customInfoScrollP);
		
		JTextArea customInfoText = new JTextArea();
		customInfoText.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		customInfoScrollP.setViewportView(customInfoText);
		
		JScrollPane airlineTicketInfoScrollP = new JScrollPane();
		airlineTicketInfoScrollP.setBounds(30, 177, 598, 116);
		add(airlineTicketInfoScrollP);
		
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setBackground(Color.WHITE);
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"", "\uC5EC\uC815", "\uD56D\uACF5\uD3B8", "\uCD9C\uBC1C\uC77C\uC2DC", "\uB3C4\uCC29\uC77C\uC2DC", "\uC88C\uC11D\uAD6C\uBD84", "\uC608\uC57D\uC0C1\uD0DC"
			}
		));
		airlineTicketInfoScrollP.setViewportView(table);
		
		JCheckBox agreeCheckBox = new JCheckBox("  상기 내용을 확인하고 동의합니다.");
		agreeCheckBox.setBackground(new Color(230, 230, 250));
		agreeCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		agreeCheckBox.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 11));
		agreeCheckBox.setBounds(191, 299, 240, 23);
		agreeCheckBox.setSelected(false);
		add(agreeCheckBox);
		
		
		JScrollPane travelInfoScrollP = new JScrollPane();
		travelInfoScrollP.setBounds(30, 424, 598, 216);
		add(travelInfoScrollP);
		
		table_1 = new JTable();
		table_1.setForeground(new Color(0, 0, 0));
		table_1.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\uD0D1\uC2B9\uAC1D", "\uD2F0\uCF13\uBC88\uD638", "\uD56D\uACF5\uC694\uAE08", "\uC720\uB958\uD560\uC99D\uB8CC", "\uACF5\uACFC\uAE08", "\uBC1C\uAD8C\uB300\uD589\uC218\uC218\uB8CC"
			}
		));
		table_1.getColumnModel().getColumn(1).setPreferredWidth(79);
		travelInfoScrollP.setViewportView(table_1);
		
		JButton changeBtn = new JButton("예매 변경");
		changeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (agreeCheckBox.isSelected() == false) {
					JOptionPane.showMessageDialog(null, "상기내용 확인후 동의해 주세요 !");
//					2번패널.setSelectedIndex(2번패널index);
				}
				
			}
		});
		changeBtn.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		changeBtn.setBounds(195, 345, 108, 38);
		add(changeBtn);
		
		JButton cancelBtn = new JButton("예매 취소");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (agreeCheckBox.isSelected() == false) {
					JOptionPane.showMessageDialog(null, "상기내용 확인후 동의 바랍니다~!!");
				}else {
					JOptionPane.showConfirmDialog(null, "예매내역을 삭제 하시겠습니까? 정말?", "예매내역 삭제", 
													JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				}
			}
		});
		cancelBtn.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		cancelBtn.setBounds(331, 345, 108, 38);
		add(cancelBtn);

		
		
		
		
	}
}
