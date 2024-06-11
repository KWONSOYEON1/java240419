package project.project1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoLogin extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTable table_1;
	private Login login;

//	public static void main(String[] args) {
//		try {
//			Customer dialog = new Customer();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public NoLogin(JFrame frame, String title) {
		super(frame, title, true);
		setBounds(100, 100, 368, 497);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		String[] mHeader = {"No", "메뉴", "가격"};
		String mContents[][] = {
				{"1", "남성-커트", "20000"},
				{"2", "여성-커트", "30000"},
				{"3", "남성-파마", "40000"},
				{"4", "남성-파마", "50000"},
		};
		
		String[] dHeader = {"No", "이름", "직급", "경력"};
		String dContents[][] = {
				{"1", "홍길동", "원장", "19년"},
				{"2", "김갑돌", "부원장", "14년"},
				{"3", "임꺽정", "디자이너", "6년"}
		};
		
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(12, 10, 325, 388);
			contentPanel.add(tabbedPane);
			{
				JScrollPane scrollPane = new JScrollPane();
				tabbedPane.addTab("메뉴", null, scrollPane, null);
				{
					table = new JTable(mContents, mHeader);
					scrollPane.setViewportView(table);
				}
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				tabbedPane.addTab("디자이너", null, scrollPane, null);
				{
					table_1 = new JTable(dContents, dHeader);
					scrollPane.setViewportView(table_1);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("메인화면");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						login = new Login();
						login.setVisible(true);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("종료");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		

	}
}
