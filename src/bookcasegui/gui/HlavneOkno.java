package ulohy.bookcasegui.gui;

import ulohy.bookcasegui.model.KnihaObject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HlavneOkno {
    private JPanel panel1;
    private JButton nováKnihaButton;
    private JButton testButton1;
    private JButton testButton2;
    private JButton testButton3;
    private JTable table1;
    private JPanel panel2;
    private JPanel panel3;
     public KnihaObject kniha;

    public KnihaObject getKniha() {
        return kniha;
    }

    public void setKniha(KnihaObject kniha) {
        this.kniha = kniha;
    }

    public HlavneOkno() {

//         Object data[][] = { { "", "","",""},  { "", "", "",""} };
        Object data[][] =null;
        Object columnNames[] = { "Názov knihy", "Autor", "Rok vydania","Cena"};
        JTableHeader header = table1.getTableHeader();
         table1 = new JTable(data, columnNames);

        panel3.setLayout(new BorderLayout());
        panel3.add(header, BorderLayout.NORTH);
        panel3.add(table1, BorderLayout.CENTER);

        DefaultTableModel daDefaultTableModel = new DefaultTableModel(0, 0);
        daDefaultTableModel.setColumnIdentifiers(columnNames);

        table1.setModel(daDefaultTableModel);

        JScrollPane scrollPane = new JScrollPane(table1);
//        scrollPane.setBounds(10, 38, 414, 212);
         panel3.add(scrollPane);


         // generovanie dummy riadkov
        for (int i = 1; i <40; i++) {
            daDefaultTableModel.addRow(new Object[] {"Nazov"+(i),"Autor",1980+i,100-2*i});
        }
//        table1.updateUI();


        nováKnihaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ZadacieOkno.main(null);

            }
        });
        testButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             table1.updateUI();
            }
        });
    }

    public static void main(String[] args) {



        JFrame frame= new JFrame("Knižnica - Radvanisko");
        frame.setMinimumSize(new Dimension(500, 700));
        frame.setContentPane(new HlavneOkno().panel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



//        System.exit(0);




    }


}