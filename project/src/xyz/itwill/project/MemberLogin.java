package xyz.itwill.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;


public class MemberLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberLogin frame = new MemberLogin();
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
	public MemberLogin() {
		setTitle("회원 로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 440, 250);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("시술 검색", null, scrollPane, null);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("디자이너 검색", null, scrollPane_1, null);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		tabbedPane.addTab("예약", null, scrollPane_2, null);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 250, 440, 40);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{80, 57, 57, 57, 57};
		gbl_panel.rowHeights = new int[]{23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton_2 = new JButton("예약 ");
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sel = tabbedPane.getSelectedIndex();
				switch (sel) {
				case 0 :
					
				case 1 :
					
					break;
				case 2 :
					ReservationInsert reservationInsertdialog = new ReservationInsert();
					reservationInsertdialog.setVisible(true);
					break;
				default:	
					System.out.println("선택한 탭에 해당하는 다이얼로그가 없습니다.");
					break;
				}
			}
		});
		
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 0;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("예약 확인");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sel = tabbedPane.getSelectedIndex();
				switch (sel) {
				case 0 :
					
				case 1 :
					
					break;
				case 2 :
					ReservationSelect reservationSelectdialog = new ReservationSelect();
					reservationSelectdialog.setVisible(true);
					break;
				default:	
					System.out.println("선택한 탭에 해당하는 다이얼로그가 없습니다.");
					break;
				}
			}
		});
		
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 0;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton = new JButton("예약 변경");
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sel = tabbedPane.getSelectedIndex();
				switch (sel) {
				case 0 :
					
				case 1 :
					
					break;
				case 2 :
					ReservationUpdate reservationUpdatedialog = new ReservationUpdate();
					reservationUpdatedialog.setVisible(true);
					break;
				default:	
					System.out.println("선택한 탭에 해당하는 다이얼로그가 없습니다.");
					break;
				}
			}
		});
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_3 = new JButton("예약 취소");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.gridx = 4;
		gbc_btnNewButton_3.gridy = 0;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
	
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			
				int selectedIndex = tabbedPane.getSelectedIndex();
                                     	
				if (selectedIndex == 0) {
                openMenuSelect();
				} else if (selectedIndex == 1) {
                openDesignerSelect();
				}
				}
			});
		}
	private void openMenuSelect() {      
		MenuSelect menuSelect = new MenuSelect();
		menuSelect.setVisible(true);
	}	
	private void openDesignerSelect() {      
		DesignerSelect designerSelect = new DesignerSelect();
		designerSelect.setVisible(true);
	}	

}

