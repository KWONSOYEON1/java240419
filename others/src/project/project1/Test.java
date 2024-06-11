package project.project1;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tabbedPane;
    private JTable table1;
    private JTable table2;

    public Test() {
        setTitle("JTabbedPane Table Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();

        // Tab 1 with JTable
        String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        Object[][] data1 = {
            {"1-1", "1-2", "1-3"},
            {"2-1", "2-2", "2-3"},
            {"3-1", "3-2", "3-3"}
        };
        DefaultTableModel model1 = new DefaultTableModel(data1, columnNames);
        table1 = new JTable(model1);
        tabbedPane.addTab("Tab 1", new JScrollPane(table1));

        // Tab 2 with JTable
        Object[][] data2 = {
            {"A-1", "A-2", "A-3"},
            {"B-1", "B-2", "B-3"},
            {"C-1", "C-2", "C-3"}
        };
        DefaultTableModel model2 = new DefaultTableModel(data2, columnNames);
        table2 = new JTable(model2);
        tabbedPane.addTab("Tab 2", new JScrollPane(table2));

        // Add the tabbedPane to the frame
        add(tabbedPane, BorderLayout.CENTER);

        // Button to get selected row index and content
        JButton getInfoButton = new JButton("Get Row Info");
        getInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                System.out.println("Selected Tab Index: " + selectedIndex);
                
                JTable selectedTable;
                if (selectedIndex == 0) {
                    selectedTable = table1;
                } else {
                    selectedTable = table2;
                }

                int selectedRow = selectedTable.getSelectedRow();
                if (selectedRow != -1) {
                    System.out.println("Selected Row Index: " + selectedRow);
                    Object value1 = selectedTable.getValueAt(selectedRow, 0);
                    Object value2 = selectedTable.getValueAt(selectedRow, 1);
                    Object value3 = selectedTable.getValueAt(selectedRow, 2);
                    System.out.println("Row Values: " + value1 + ", " + value2 + ", " + value3);
                } else {
                    System.out.println("No row selected.");
                }
            }
        });
        add(getInfoButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}
