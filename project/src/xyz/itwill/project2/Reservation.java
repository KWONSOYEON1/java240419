package xyz.itwill.project2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Reservation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation frame = new Reservation();
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
	public Reservation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{85, 85, 85, 85, 85, 0};
		gbl_contentPane.rowHeights = new int[]{25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("디자이너 선택");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("시술 선택");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("예약 날짜");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 0;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("예약 시간");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 0;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("메모");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 4;
		gbc_lblNewLabel_4.gridy = 0;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		contentPane.add(comboBox, gbc_comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 1;
		contentPane.add(comboBox_1, gbc_comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 2;
		gbc_comboBox_2.gridy = 1;
		contentPane.add(comboBox_2, gbc_comboBox_2);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("09:00");
		GridBagConstraints gbc_chckbxNewCheckBox_10 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_10.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_10.gridx = 3;
		gbc_chckbxNewCheckBox_10.gridy = 1;
		contentPane.add(chckbxNewCheckBox_10, gbc_chckbxNewCheckBox_10);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridheight = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("10:00");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridx = 3;
		gbc_chckbxNewCheckBox_1.gridy = 2;
		contentPane.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("11:00");
		GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_2.gridx = 3;
		gbc_chckbxNewCheckBox_2.gridy = 3;
		contentPane.add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("12:00");
		GridBagConstraints gbc_chckbxNewCheckBox_3 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_3.gridx = 3;
		gbc_chckbxNewCheckBox_3.gridy = 4;
		contentPane.add(chckbxNewCheckBox_3, gbc_chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("13:00");
		GridBagConstraints gbc_chckbxNewCheckBox_5 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_5.gridx = 3;
		gbc_chckbxNewCheckBox_5.gridy = 5;
		contentPane.add(chckbxNewCheckBox_5, gbc_chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("14:00");
		GridBagConstraints gbc_chckbxNewCheckBox_4 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4.gridx = 3;
		gbc_chckbxNewCheckBox_4.gridy = 6;
		contentPane.add(chckbxNewCheckBox_4, gbc_chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("15:00");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 3;
		gbc_chckbxNewCheckBox.gridy = 7;
		contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("16:00");
		GridBagConstraints gbc_chckbxNewCheckBox_9 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_9.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_9.gridx = 3;
		gbc_chckbxNewCheckBox_9.gridy = 8;
		contentPane.add(chckbxNewCheckBox_9, gbc_chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("17:00");
		GridBagConstraints gbc_chckbxNewCheckBox_6 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_6.gridx = 3;
		gbc_chckbxNewCheckBox_6.gridy = 9;
		contentPane.add(chckbxNewCheckBox_6, gbc_chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("18:00");
		GridBagConstraints gbc_chckbxNewCheckBox_7 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_7.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_7.gridx = 3;
		gbc_chckbxNewCheckBox_7.gridy = 10;
		contentPane.add(chckbxNewCheckBox_7, gbc_chckbxNewCheckBox_7);
		
		JButton btnNewButton = new JButton("예약");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 11;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}

}
