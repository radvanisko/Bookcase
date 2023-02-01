package ulohy.bookcasegui;


import ulohy.bookcasegui.model.KnihaObject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



// todo skusim prerobit s jedným Main a volaním okien odtialto

import ulohy.bookcasegui.gui.HlavneOkno;
import ulohy.bookcasegui.model.KnihaObject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainApp {


    public static void main(String[] args) {

        KnihaObject kniha = new KnihaObject();
        KnihaObject aktualnakniha = new KnihaObject();

        HlavneOkno.main(null);


        ArrayList<KnihaObject> zoznamknih = new ArrayList<KnihaObject>();
        zoznamknih.add(kniha);


    }
}
