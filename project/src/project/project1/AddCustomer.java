package project.project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class AddCustomer extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField idFeild;
	private JTextField pwField;
	private JTextField nameFeild;
	private JTextField birthFeild;
	private JTextField phoneFeild;
	private JTextArea memoArea;
	private JLabel erLabel;

	private boolean idb = false;
	private boolean pwb = false;
	private boolean nameb = false;
	private boolean genderb = false;
	private boolean birthb = false;
	private boolean phoneb = false;

	private JCheckBox checkM;
	private JCheckBox checkF;

	

	/**
	 * Create the dialog.
	 */
	public AddCustomer(Designer designer, String title) {

		super(designer, title, true);
		setBounds(100, 100, 355, 535);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel_7 = new JLabel("ex) 2000-01-01");
			lblNewLabel_7.setForeground(new Color(128, 128, 128));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_7.setBounds(206, 199, 117, 15);
			contentPanel.add(lblNewLabel_7);
		}

		{
			idFeild = new JTextField();
			idFeild.setBounds(104, 10, 223, 32);
			contentPanel.add(idFeild);
			idFeild.setColumns(10);
		}

		{
			JLabel lblNewLabel = new JLabel("ID :");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel.setBounds(12, 9, 80, 32);
			contentPanel.add(lblNewLabel);
		}

		{
			pwField = new JTextField();
			pwField.setColumns(10);
			pwField.setBounds(104, 53, 223, 32);
			contentPanel.add(pwField);
		}

		{
			JLabel lblNewLabel_1 = new JLabel("비밀번호 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_1.setBounds(12, 52, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}

		{
			nameFeild = new JTextField();
			nameFeild.setColumns(10);
			nameFeild.setBounds(104, 96, 223, 32);
			contentPanel.add(nameFeild);
		}

		{
			JLabel lblNewLabel_2 = new JLabel("이름 :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_2.setBounds(12, 95, 80, 32);
			contentPanel.add(lblNewLabel_2);
		}

		{
			checkM = new JCheckBox(" 남자");
			checkM.setSelected(true);
			checkM.setFont(new Font("굴림", Font.PLAIN, 14));
			checkM.setBounds(135, 143, 68, 23);
			contentPanel.add(checkM);

			checkF = new JCheckBox(" 여자");
			checkF.setFont(new Font("굴림", Font.PLAIN, 14));
			checkF.setBounds(233, 143, 68, 23);
			contentPanel.add(checkF);

			ButtonGroup genderCheck = new ButtonGroup();
			genderCheck.add(checkM);
			genderCheck.add(checkF);
		}

		{
			JLabel lblNewLabel_3 = new JLabel("성별 :");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_3.setBounds(12, 138, 80, 32);
			contentPanel.add(lblNewLabel_3);
		}

		{
			birthFeild = new JTextField();
			birthFeild.setColumns(10);
			birthFeild.setBounds(104, 182, 223, 32);
			contentPanel.add(birthFeild);
		}

		{
			JLabel lblNewLabel_4 = new JLabel("생년월일 :");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_4.setBounds(12, 181, 80, 32);
			contentPanel.add(lblNewLabel_4);
		}

		{
			phoneFeild = new JTextField();
			phoneFeild.setColumns(10);
			phoneFeild.setBounds(104, 225, 223, 32);
			contentPanel.add(phoneFeild);
		}

		{
			JLabel lblNewLabel_5 = new JLabel("전화번호 :");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_5.setBounds(12, 224, 80, 32);
			contentPanel.add(lblNewLabel_5);
		}

		
		memoArea = new JTextArea();
		memoArea.setBounds(22, 301, 301, 152);
		contentPanel.add(memoArea);

		{
			JLabel lblNewLabel_6 = new JLabel("메모 : ");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_6.setBounds(12, 267, 80, 32);
			contentPanel.add(lblNewLabel_6);
		}

		{
			erLabel = new JLabel("");
			erLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			erLabel.setForeground(new Color(255, 0, 0));
			erLabel.setBounds(32, 429, 295, 24);
			contentPanel.add(erLabel);
		}

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);

			{
				JButton okButton = new JButton("등록");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Connection con = null;
						Statement stmt = null;
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");

							String url = "jdbc:oracle:thin:@localhost:1521:xe";
							String username = "scott";
							String password = "tiger";
							con = DriverManager.getConnection(url, username, password);

							stmt = con.createStatement();

							String idin = idFeild.getText();
							if (idin != null)
								idb = true;

							String pwin = pwField.getText();
							if (pwin != null)
								pwb = true;

							String namein = nameFeild.getText();
							if (namein != null)
								nameb = true;

							String genderin = "M";
							if (checkM.isSelected()) {
								genderin = "M";
								if (genderin != null)
									genderb = true;
							} else if (checkF.isSelected()) {
								genderin = "F";
								if (genderin != null)
									genderb = true;
							}

							String birthin = birthFeild.getText();
							String input = birthin; // 입력된 생년월일
							String datePattern = "\\d{4}-\\d{2}-\\d{2}";

							if (isValidDate(input, datePattern)) {
								birthb = true;
							} else {
								erLabel.setText("날짜 형식이 맞지 않습니다.");
							}

							String phonein = phoneFeild.getText();
							if (phonein != null)
								phoneb = true;

							String memoin = memoArea.getText();

							if (idb && pwb && nameb && genderb && birthb && phoneb) {
								String sql = "insert into customer values('" + idin + "', '" + pwin + "', '" + birthin
										+ "', '" + namein + "', '" + genderin + "', DEFAULT, DEFAULT, '" + memoin
										+ "', '" + phonein + "')";
								int rows = stmt.executeUpdate(sql);
								idFeild.setText("");
								pwField.setText("");
								nameFeild.setText("");
								birthFeild.setText("");
								phoneFeild.setText("");
								memoArea.setText("");
								checkM.setSelected(true);
								checkF.setSelected(false);


								if (rows == 1) {
									setVisible(false);
									designer.getBtnNewButton_2().doClick();
									
								}
							}

						} catch (ClassNotFoundException e1) {
							System.out.println("[에러]OracleDriver 클래스를 찾을 수 없습니다.");
							erLabel.setText("[에러] OracleDriver class not found.");

						} catch (SQLException e1) {
							System.out.println("[에러]DBMS 관련 오류 = " + e1.getMessage());
							erLabel.setText("[에러] DBMS 관련 오류");

						} finally {
							try {
								if (stmt != null)
									stmt.close();
								if (con != null)
									con.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}

			{
				JButton cancelButton = new JButton("취소");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	

	public static boolean isValidDate(String date, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(date);
		return m.matches();
	}
}
