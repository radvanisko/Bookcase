package ulohy.bookcasegui.tests;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableTest {

    private JFrame frame;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TableTest window = new TableTest();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public TableTest() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        table = new JTable();

        DefaultTableModel daDefaultTableModel = new DefaultTableModel(0, 0);
        String[] columnNames = new String[] {"Column Header1", "Column Header2","Column Header3","Column Header4"};
        daDefaultTableModel.setColumnIdentifiers(columnNames);

//Dummy data for Table

        for (int i = 0; i <20; i++) {
            daDefaultTableModel.addRow(new Object[] {"Test"+i+1,"Test2","Test3","Test4"});

        }

        table.setModel(daDefaultTableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 38, 414, 212);
        frame.getContentPane().add(scrollPane);



  }
    }