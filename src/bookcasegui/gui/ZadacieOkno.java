package ulohy.bookcasegui.gui;


import ulohy.bookcasegui.model.KnihaObject;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;



public class ZadacieOkno extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;

    private final HlavneOkno hlavneOkno;


    public ZadacieOkno(HlavneOkno hlavneOkno) {
        this.hlavneOkno = hlavneOkno;


        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {

        KnihaObject aktualnakniha=new KnihaObject();

        String textove;
        textove=textField1.getText();
        if (textove.equals("")) {}
        else
        {
            aktualnakniha.setMeno(textField1.getText());
            aktualnakniha.setAutor(textField2.getText());

            // osetrene vstupy pre ocakavany integer Rokvydania a Cena
            try {
                aktualnakniha.setRokvydania(Integer.parseInt(textField3.getText()));
            } catch (NumberFormatException e) {
                aktualnakniha.setRokvydania(0);
            }
            try {
                aktualnakniha.setCena(Integer.parseInt(textField4.getText()));
            } catch (NumberFormatException e) {
                aktualnakniha.setCena(0);
            }

            //todo potrebujem to dosta?? do tabulky
            System.out.println(aktualnakniha.getMeno());
            System.out.println(aktualnakniha.getAutor());
            System.out.println(aktualnakniha.getRokvydania());
            System.out.println(aktualnakniha.getCena());


            JTable table = hlavneOkno.getTable1();

            Object[] data = {aktualnakniha.getMeno(), aktualnakniha.getAutor(), aktualnakniha.getRokvydania(), aktualnakniha.getCena()};

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(data);



        }

        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

//        System.exit(0);
    }

