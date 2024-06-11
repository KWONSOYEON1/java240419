package proj;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Main1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
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
	public Main1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 400, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(10, 10, 78, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("로그아웃");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(86, 10, 86, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("종료");
		btnNewButton_2.setBounds(172, 10, 69, 23);
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(1, 51, 128, 132);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_3 = new JButton("시술 검색");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("시술 등록");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("시술 수정");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("시술 삭제");
		panel.add(btnNewButton_5);
		
		table = new JTable();
		table.setBounds(126, 53, 352, 293);
		contentPane.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 223, 129, 123);
		contentPane.add(panel_1);
		
		JButton btnNewButton_7 = new JButton("회원 관리");
		
		JButton btnNewButton_11 = new JButton("예약 확인");
		
		JButton btnNewButton_9 = new JButton("디자이너 관리");
		
		JButton btnNewButton_10 = new JButton("예약");
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_1.add(btnNewButton_7);
		panel_1.add(btnNewButton_9);
		panel_1.add(btnNewButton_10);
		panel_1.add(btnNewButton_11);
	}
}
