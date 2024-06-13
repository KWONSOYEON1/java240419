package project.project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField idField;
	private JTextField pwField;
	private NoLogin noLogin;
	private Customer customer;
	private Designer designer;
//	private ButtonGroup adminCheck;
	private JCheckBox b1;
	private JCheckBox b2;
//	private Login l1;

	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * Create the dialog.
	 * 
	 */

	public Login() {
		setTitle("미용실 관리시스템 _ 로그인");
		setBounds(250, 250, 410, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 10, 110, 230, 30 };
		gbl_contentPanel.rowHeights = new int[] { 30, 50, 10 };
		gbl_contentPanel.columnWeights = new double[] { 1.0 };
		gbl_contentPanel.rowWeights = new double[] { Double.MIN_VALUE, 0.0, 0.0 };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("ID : ");
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}

		{
			idField = new JTextField();
			idField.setFont(new Font("굴림", Font.PLAIN, 20));
			GridBagConstraints gbc_idField = new GridBagConstraints();
			gbc_idField.insets = new Insets(0, 0, 5, 5);
			gbc_idField.fill = GridBagConstraints.HORIZONTAL;
			gbc_idField.gridx = 2;
			gbc_idField.gridy = 1;
			contentPanel.add(idField, gbc_idField);
			idField.setColumns(10);
		}

		{
			JLabel lblNewLabel_1 = new JLabel("PassWord : ");
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 15));
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 2;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}

		{
			pwField = new JTextField();
			pwField.setFont(new Font("굴림", Font.PLAIN, 20));
			GridBagConstraints gbc_pwField = new GridBagConstraints();
			gbc_pwField.insets = new Insets(0, 0, 5, 5);
			gbc_pwField.fill = GridBagConstraints.HORIZONTAL;
			gbc_pwField.gridx = 2;
			gbc_pwField.gridy = 2;
			contentPanel.add(pwField, gbc_pwField);
			pwField.setColumns(10);
		}

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton noLoginButton = new JButton("비회원 접속");
				noLoginButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						noLogin.setVisible(true);

					}

				});
				noLoginButton.setForeground(new Color(86, 86, 86));
				noLoginButton.setFont(new Font("굴림", Font.BOLD, 16));
				noLoginButton.setActionCommand("noLog");
				buttonPane.add(noLoginButton);
			}
			{
				JButton okButton = new JButton("접속");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						boolean b1check = b1.isSelected();
						// if문으로 id/pw 확인 예정
						if (b1check) {
//							System.out.println("일반 접속");
							setVisible(false);
							customer.setVisible(true);
						// if문으로 id/pw 확인 예정
						} else {
//							System.out.println("관리자 접속");
							setVisible(false);
							designer.setVisible(true);
						}
					}
				});
				okButton.setFont(new Font("굴림", Font.BOLD, 16));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("취소");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				cancelButton.setFont(new Font("굴림", Font.BOLD, 16));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}

		}
		{

			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
			{
				b1 = new JCheckBox("일반 사용자    ", true);
				b1.setFont(new Font("굴림", Font.BOLD, 16));
				panel.add(b1);
				b2 = new JCheckBox("관리자");
				b2.setFont(new Font("굴림", Font.BOLD, 16));
				panel.add(b2);
				ButtonGroup admin = new ButtonGroup();
				admin.add(b1);
				admin.add(b2);
			}
		}

		noLogin = new NoLogin(this, "미용실 관리시스템 _ 비회원");
		customer = new Customer(this, "미용실 관리시스템 _ 손님용");
		designer = new Designer(this, "미용실 관리시스템 _ 관리자");

	}
}