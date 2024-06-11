package project.project1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Test1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int imin = 5;
	int imax = 22;
	JButton[] buttons;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 frame = new Test1();
					frame.setVisible(true);

					Object[][] data1 = { // 예약
							{ "2024-06-11", "13", "김민수" }, 
							{ "2024-06-11", "15", "김민수" },
							{ "2024-06-11", "16", "김민수" } };

					// 디자이너 확인
					// 날짜 확인

					for (int i = 0; i < 3; i++) {

						int rrs = Integer.parseInt((String) data1[i][1]);

						int rup = rrs - frame.imin;
						frame.buttons[rup].setBackground(new Color(200, 140, 210));
						frame.buttons[rup].setText(frame.buttons[rup].getText().replace("가능", "완료"));
						frame.buttons[rup].setEnabled(false);

					}



				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test1() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(23, 10, 200, 480);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		textField = new JTextField();
		textField.setBounds(339, 223, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);

		buttons = new JButton[imax - imin + 1];
		for (int i = imin; i <= imax; i++) {
			int startNum = 9;
			int closeNum = 18;
			JButton tButton = new JButton("<html><center><font size = 4>" + i + ":00<br>예약 가능</html>");
			buttons[i - imin] = tButton;
			panel.add(tButton);

			if (i < startNum) {
				tButton.setEnabled(false);
				tButton.setBackground(Color.gray);
				tButton.setText(tButton.getText().replace("예약 가능", "영업 전"));

			} else if (i > closeNum) {
				tButton.setEnabled(false);
				tButton.setBackground(Color.gray);
				tButton.setText(tButton.getText().replace("예약 가능", "영업 종료"));

			} else {

				tButton.setBackground(Color.white);
			}

			tButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton actionbutton = (JButton) e.getSource();

					if (actionbutton.getText().indexOf("가능") != -1) {

						if (actionbutton.getText().substring(30, 31).equals(":")) {
							textField.setText((actionbutton.getText().substring(29, 30)));
						} else {
							textField.setText((actionbutton.getText().substring(29, 31)));

						}

					} else {
						textField.setText("");
					}

				}
			});
		}
	}

}
