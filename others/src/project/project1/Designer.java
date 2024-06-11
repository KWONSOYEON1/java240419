package project.project1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Designer extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable dtable;
	private JTable ctable;
	private JTable rtable;
	private JTable mtable;
	private AddCustomer addc;
	private AddDesigner addd;
	private AddMenu addm;
	private AddRsrrvt addr;
	private JLabel timeLabel;
	JTabbedPane tabbedPane;
	JButton btnNewButton_2;

	public JButton getBtnNewButton_2() {
		return btnNewButton_2;
	}

	public void setBtnNewButton_2(JButton btnNewButton_2) {
		this.btnNewButton_2 = btnNewButton_2;
	}

	public Designer(JFrame frame, String title) {
		super(frame, title, true);
		setBounds(100, 100, 687, 519);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel loginLabel = new JLabel("***님 환영합니다.");
		loginLabel.setBounds(26, 10, 258, 42);
		contentPanel.add(loginLabel);

		timeLabel = new JLabel();
		timeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		timeLabel.setBounds(406, 18, 244, 15);
		contentPanel.add(timeLabel);

		updateDateTimeLabel();

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("굴림", Font.BOLD, 16));
		tabbedPane.setBounds(26, 55, 624, 322);
		contentPanel.add(tabbedPane);

		JScrollPane spc = new JScrollPane();
		tabbedPane.addTab(" 손님 ", null, spc, null);
		tabbedPane.setEnabledAt(0, true);

		ctable = new JTable();
		ctable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "NO", "이름", "나이", "성별", "전화번호", "아이디", "비밀번호", "가입일자", "미용횟수", "메모" }));
		spc.setViewportView(ctable);

		JScrollPane spd = new JScrollPane();
		tabbedPane.addTab(" 디자이너 ", null, spd, null);

		dtable = new JTable();
		dtable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "NO", "이름", "직급", "나이", "성별", "전화번호", "경력", "월급", "아이디", "비밀번호", "입사일자" }));
		spd.setViewportView(dtable);

		JScrollPane spm = new JScrollPane();
		tabbedPane.addTab(" 시술 ", null, spm, null);

		mtable = new JTable();
		mtable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "시술번호", "시술명", "시술시간", "시술가격" }));
		spm.setViewportView(mtable);

		JScrollPane spr = new JScrollPane();
		tabbedPane.addTab(" 예약 ", null, spr, null);

		rtable = new JTable();
		rtable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "NO", "예약날짜", "예약시간", "디자이너", "시술고객", "시술명", "상태", "결제금액", "결제수단", "메모" }));
		spr.setViewportView(rtable);

		JButton btnNewButton = new JButton("추가");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sel = tabbedPane.getSelectedIndex();
				switch (sel) {
				case 0:
					addc.setVisible(true);
					break;
				case 1:
					addd.setVisible(true);
					break;
				case 2:
					addm.setVisible(true);
					break;
				case 3:
					addr.setVisible(true);
					break;
				default:
					break;
				}
			}
		});
		btnNewButton.setBounds(26, 387, 181, 41);
		contentPanel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("삭제");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_1.setBounds(465, 387, 181, 41);
		contentPanel.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("수정");
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(248, 387, 181, 41);
		contentPanel.add(btnNewButton_1_1);

		btnNewButton_2 = new JButton("조회하기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fetch();

			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 17));
		btnNewButton_2.setBounds(524, 43, 122, 29);
		contentPanel.add(btnNewButton_2);

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("로그아웃");
		okButton.setFont(new Font("굴림", Font.PLAIN, 15));
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("종료");
		cancelButton.setFont(new Font("굴림", Font.PLAIN, 15));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);

		
		// 추가 Dialog 생성
		addc = new AddCustomer(this, "손님 추가");
		addd = new AddDesigner(this, "디자이너 추가");
		addm = new AddMenu(this, "시술 추가");
		addr = new AddRsrrvt(this, "예약 추가");
	}

	private void updateDateTimeLabel() {
		Timer timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				java.util.Date now = new java.util.Date();
				SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				timeLabel.setText(sd1.format(now));
			}
		});
		timer.start();
	}

	public void fetch() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, username, password);

			stmt = con.createStatement();

			int sel = tabbedPane.getSelectedIndex();
			switch (sel) {
			case 0: // 손님 정보 조회
				String sqlCustomer = "select rownum, cus.* from (select name, birth, gender, phone, id, pw, join_date, used_count, memo from customer order by name) cus";
				rs = stmt.executeQuery(sqlCustomer);
				DefaultTableModel modelCustomer = (DefaultTableModel) ctable.getModel();
				modelCustomer.setRowCount(0); // 기존 데이터 초기화

				while (rs.next()) {
					int rownum = rs.getInt("rownum");
					String name = rs.getString("name");
					Date birth = rs.getDate("birth");
					String gender = rs.getString("gender");
					String phone = rs.getString("phone");
					String id = rs.getString("id");
					String pw = rs.getString("pw");
					Date join_date = rs.getDate("join_date");
					int used_count = rs.getInt("used_count");
					String memo = rs.getString("memo");

					Vector<Object> vector = new Vector<Object>();
					vector.add(rownum);
					vector.add(name);
					vector.add(birth);
					vector.add(gender);
					vector.add(phone);
					vector.add(id);
					vector.add(pw);
					vector.add(join_date);
					vector.add(used_count);
					vector.add(memo);

					modelCustomer.addRow(vector);
				}
				break;

			case 1: // 디자이너 정보 조회
				String sqlDesigner = "select rownum, desi.* from (select name, rank, birth, gender, phone, career, sal, id, pw, hire_date from designer order by name) desi";
				rs = stmt.executeQuery(sqlDesigner);
				DefaultTableModel modelDesigner = (DefaultTableModel) dtable.getModel();
				modelDesigner.setRowCount(0); // 기존 데이터 초기화

				while (rs.next()) {
					int rownum = rs.getInt("rownum");
					String name = rs.getString("name");
					String rank = rs.getString("rank");
					Date birth = rs.getDate("birth");
					String gender = rs.getString("gender");
					String phone = rs.getString("phone");
					int career = rs.getInt("career");
					int sal = rs.getInt("sal");
					String id = rs.getString("id");
					String pw = rs.getString("pw");
					Date hire_date = rs.getDate("hire_date");

					Vector<Object> vector = new Vector<Object>();
					vector.add(rownum);
					vector.add(name);
					vector.add(rank);
					vector.add(birth);
					vector.add(gender);
					vector.add(phone);
					vector.add(career);
					vector.add(sal);
					vector.add(id);
					vector.add(pw);
					vector.add(hire_date);

					modelDesigner.addRow(vector);
				}
				break;

			case 2: // 시술 정보 조회
				String sqlMenu = "select mno, value, mtime, price from menu order by mno";
				rs = stmt.executeQuery(sqlMenu);
				DefaultTableModel modelMenu = (DefaultTableModel) mtable.getModel();
				modelMenu.setRowCount(0); // 기존 데이터 초기화

				while (rs.next()) {
					int mno = rs.getInt("mno");
					String value = rs.getString("value");
					int mtime = rs.getInt("mtime");
					int price = rs.getInt("price");

					Vector<Object> vector = new Vector<Object>();
					vector.add(mno);
					vector.add(value);
					vector.add(mtime);
					vector.add(price);

					modelMenu.addRow(vector);
				}
				break;

			case 3: // 예약 정보 조회
				String sqlReservation = "select rownum, rsr.* from (select rdate, rtime, designer.name dname, customer.name  cname, menu.value mvalue, status, payment, cash, rsrrvt.memo rmemo from rsrrvt join customer on customer.id = rsrrvt.rcid join designer on designer.id = rsrrvt.rdid join menu on menu.mno = rsrrvt.menu_no order by rdate desc, rtime desc ) rsr";
				rs = stmt.executeQuery(sqlReservation);
				DefaultTableModel modelReservation = (DefaultTableModel) rtable.getModel();
				modelReservation.setRowCount(0); // 기존 데이터 초기화

				while (rs.next()) {
					int rownum = rs.getInt("rownum");
					Date rdate = rs.getDate("rdate");
					int rtime = rs.getInt("rtime");
					String dname = rs.getString("dname");
					String cname = rs.getString("cname");
					String mvalue = rs.getString("mvalue");
					String status = rs.getString("status");
					int payment = rs.getInt("payment");
					String cash = rs.getString("cash");
					String rmemo = rs.getString("rmemo");

					Vector<Object> vector = new Vector<Object>();
					vector.add(rownum);
					vector.add(rdate);
					vector.add(rtime);
					vector.add(dname);
					vector.add(cname);
					vector.add(mvalue);
					vector.add(status);
					vector.add(payment);
					vector.add(cash);
					vector.add(rmemo);

					modelReservation.addRow(vector);
				}
				break;

			default:
				System.out.println("[결과] 선택된 탭이 없습니다.");
				break;
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("[에러] OracleDriver 클래스를 찾을 수 없습니다.");
		} catch (SQLException ex) {
			System.out.println("[에러] DBMS 관련 오류 = " + ex.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
