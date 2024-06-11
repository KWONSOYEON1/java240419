package project.project1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class AddMenu extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Create the dialog.
	 */
	public AddMenu(JDialog dialog, String title) {
		super(dialog, title, true);
		setBounds(100, 100, 355, 262);
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

		JLabel lblNewLabel = new JLabel("시술번호 :");
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
			JLabel lblNewLabel_1 = new JLabel("시술명 :");
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
			JLabel lblNewLabel_1 = new JLabel("시술시간 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_1.setBounds(12, 95, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(104, 139, 223, 32);
			contentPanel.add(textField_4);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("가격 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
			lblNewLabel_1.setBounds(12, 138, 80, 32);
			contentPanel.add(lblNewLabel_1);
		}
		
		ButtonGroup genderCheck = new ButtonGroup();
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
