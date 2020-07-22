package com.itwill.UI.reservation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.flight.Flight;
import com.itwill.flight.FlightDAO;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservationSearchResultDialog extends JDialog {

	/***************************************************************/
	ReservationPanel reservationPanel;
	
	/***************************************************************/
	
	private final JPanel contentPanel = new JPanel();
	ArrayList<Flight> flightList;
	int adultCount;
	int childCount;
	String seatRating;

	

	private JTable searchResultT;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public ReservationSearchResultDialog() {
		setBounds(100, 100, 563, 423);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				searchResultT = new JTable();
				
				searchResultT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				searchResultT.setFont(new Font("맑은 고딕", Font.BOLD, 17));
				searchResultT.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null},
					},
					new String[] {
						"\uD56D\uACF5\uD3B8", "\uD56D\uACF5\uC0AC", "\uCD9C\uBC1C\uC77C\uC2DC", "\uCD9C\uBC1C\uC9C0", "\uB3C4\uCC29\uC77C\uC2DC", "\uB3C4\uCC29\uC9C0", "\uC2B9\uAC1D", "\uC694\uAE08"
					}
				));
				searchResultT.getColumnModel().getColumn(3).setPreferredWidth(50);
				searchResultT.getColumnModel().getColumn(3).setMaxWidth(50);
				searchResultT.getColumnModel().getColumn(5).setPreferredWidth(50);
				searchResultT.getColumnModel().getColumn(5).setMaxWidth(50);
				scrollPane.setViewportView(searchResultT);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton reserveB = new JButton("예약");
				reserveB.setActionCommand("OK");
				buttonPane.add(reserveB);
				getRootPane().setDefaultButton(reserveB);
			}
			{
				JButton cancelB = new JButton("취소");
				cancelB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelB.setActionCommand("Cancel");
				buttonPane.add(cancelB);
			}
		}
		
		reservationPanel = new ReservationPanel();
		
		
	}
/************************************************************************************************/
	
	public ArrayList<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(ArrayList<Flight> flightList) throws Exception {
		this.flightList = flightList;
		this.getMemberList();
	}
	
	public int getAdultCount() {
			return adultCount;
		}
	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}
	public int getChildCount() {
		return childCount;
	}
	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}
	public String getSeatRating() {
		return seatRating;
	}
	public void setSeatRating(String seatRating) {
		this.seatRating = seatRating;
	}
	
	
	protected void getMemberList() throws Exception {
		ArrayList<Flight> flightList = getFlightList();
		
		//DefaultListModel listModel = new DefaultListModel();
		
		//DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
		
		DefaultTableModel tableModel = new DefaultTableModel();
		Vector columnVector = new Vector();
		
		columnVector.add("항공편");
		columnVector.add("항공사");
		columnVector.add("출발일시");
		columnVector.add("출발지");
		columnVector.add("도착일시");
		columnVector.add("도착지");
		columnVector.add("승객");
		columnVector.add("요금");
		
		tableModel.setColumnIdentifiers(columnVector);
		
		for (Flight flight : flightList) {
			//listModel.addElement(flight.getFlightName());
			//comboBoxModel.addElement(flight.getFlightName());			
			
			Vector rowVector = new Vector();
			
			rowVector.add(flight.getFlightName());
			rowVector.add(flight.getAirlineName());
			rowVector.add(flight.getFlightStartYear()+"/"+flight.getFlightStartMonth()+"/"+flight.getFlightStartDay()+flight.getFlightStartTime());
			rowVector.add(flight.getStartPoint());
			rowVector.add(flight.getFlightFinishYear()+"/"+flight.getFlightFinishMonth()+"/"+flight.getFlightFinishDay()+flight.getFlightFinishTime());
			rowVector.add(flight.getFinishPoint());
			rowVector.add("성인 : "+this.adultCount+"명, "+"소아 : "+childCount+"명");
			rowVector.add(flight.getFee());
			
			tableModel.addRow(rowVector);
		}
		
		Vector rowVector = new Vector();
		searchResultT.setModel(tableModel);
		System.out.println(adultCount);
	}
	
	
	/*
	protected void getMemberList() throws Exception {
		ArrayList<Member> memberList = memberService.memberList();
		
		
		DefaultListModel listModel = new DefaultListModel();
		
		DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();	
		
		DefaultTableModel tableModel = new DefaultTableModel();
		Vector columnVector = new Vector();
		columnVector.add("아이디");
		columnVector.add("이름");
		columnVector.add("주소");
		columnVector.add("나이");
		columnVector.add("결혼여부");
		tableModel.setColumnIdentifiers(columnVector);
		
		
		
		for (Member member : memberList) {
			listModel.addElement(member.getId());
			comboBoxModel.addElement(member.getId());
			Vector rowVector = new Vector();
			
			rowVector.add(member.getId());
			rowVector.add(member.getName());
			rowVector.add(member.getAddress());
			rowVector.add(member.getAge());
			rowVector.add(member.isMarried());
			
			tableModel.addRow(rowVector);
		}
		memberListL.setModel(listModel);
		memberCB.setModel(comboBoxModel);
		memberTBL.setModel(tableModel);
		
	}
	*/
	
	
	
	
	
	
	/*
	protected void displayMember() throws Exception {
				
		for (Flight flight : flightList) {
			String flightName = flight.getFlightName();
			String airLineName = flight.getAirlineName();
			
			int flightStartMonth = flight.getFlightStartMonth();
			int flightStartday = flight.getFlightStartDay();
			String startPoint = flight.getStartPoint();
			
			int flightFinishMonth = flight.getFlightFinishMonth();
			int flightFinishDay = flight.getFlightFinishDay();
			String finishPoint = flight.getFinishPoint();
			
			int fee = flight.getFee();
		}
		
	
		
		
		idTF.setText(findMember.getId());
		nameTF.setText(findMember.getName());
		addressTF.setText(findMember.getAddress());
		ageTF.setText(findMember.getAge()+"");
		if (findMember.isMarried()) {
			marriedCHK.setSelected(true);
		}else {
			marriedCHK.setSelected(false);
		}
		updateBtn.setEnabled(true);
		deleteBtn.setEnabled(true);
		
	}
	*/
}
	


