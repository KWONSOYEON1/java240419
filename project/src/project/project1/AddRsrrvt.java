package project.project1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AddRsrrvt extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_7;

	/**
	 * Create the dialog.
	 */
	public AddRsrrvt(JDialog dialog, String title) {
		super(dialog, title, true);
		setBounds(100, 100, 355, 561);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setEnabled(false);
			textField.setBounds(104, 10, 223, 32);
			contentPanel.add(textField);
			textField.setColumns(10);
		}

		JLabel lblNewLabel = new JLabel("예약번호 :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 9, 80, 32);
		contentPanel.add(lblNewLabel);
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(104, 53, 223, 32);
			contentPanel.add(textField_1);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("예약날짜 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_1.setBounds(12, 52, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(104, 96, 223, 32);
			contentPanel.add(textField_2);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("예약시간 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_1.setBounds(12, 95, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(104, 182, 223, 32);
			contentPanel.add(textField_4);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("디자이너 ID :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
			lblNewLabel_1.setBounds(12, 181, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(104, 225, 139, 32);
			contentPanel.add(textField_5);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("고객명 : ");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_1.setBounds(12, 224, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}
		

		{
			JLabel lblNewLabel_1 = new JLabel("고객 ID : ");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_1.setBounds(12, 267, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(104, 268, 223, 32);
			contentPanel.add(textField_3);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("시술명 : ");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_1.setBounds(12, 309, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(104, 310, 223, 32);
			contentPanel.add(textField_6);
		}
		{
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(104, 140, 139, 32);
			contentPanel.add(textField_8);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("디자이너 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_1.setBounds(12, 139, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.setBounds(247, 138, 80, 34);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("조회");
		btnNewButton_1.setBounds(247, 224, 80, 34);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel(" 메모 : ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 351, 80, 32);
		contentPanel.add(lblNewLabel_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(12, 379, 315, 100);
		contentPanel.add(textField_7);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("등록");
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
}
