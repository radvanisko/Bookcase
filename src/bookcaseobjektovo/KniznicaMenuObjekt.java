package ulohy.bookcaseobjektovo;


import ulohy.bookcaseobjektovo.model.*;
//import ulohy.bookcaseobjektovo.model.ZoznamObjekt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static ulohy.bookcase.KniznicaEvidencia.*;

//import static ulohy.bookcaseobjektovo.KniznicaEvidenciaObjekt.vypisKnihyObjekt;


public class KniznicaMenuObjekt {

    public static void main(String[] args) {

        KnihaObject kniha=new KnihaObject();
        ZoznamObjekt zoznamObjekt=new ZoznamObjekt();
        ArrayList<KnihaObject> kniznica= zoznamObjekt.naplnKniznicu();



//        ArrayList<String> zoznamknih = new ArrayList<String>(); // Arraylist bez objektu
        String menuvolba;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vitaj v knižnici" );
        vypisMenu();

      while(true)
      {
        menuvolba = sc.next();

        switch (menuvolba) {
            case "1":
                Scanner sc1 = new Scanner(System.in);
                String vstup;
                System.out.println("Zadaj meno knihy./ zadavanie ukončíš zadanim slova <quit>");

                while (true) {
                    vstup = sc1.nextLine();
                    if (vstup.toLowerCase().equals("quit")) {
                        break;
                    }
                    if (!vstup.equals("")) {

                        kniha.setMeno(vstup);
                        System.out.println("Zadaj Autora");
                        vstup = sc1.nextLine();
                        kniha.setAutor(vstup);
                        System.out.println("Zadaj Rok vydania");
                        vstup = sc1.nextLine();
                        kniha.setRokvydania(Integer.parseInt(vstup));
                        System.out.println("Zadaj cenu");
                        vstup = sc1.nextLine();
                        kniha.setCena(Integer.parseInt(vstup));
                        kniznica.add(kniha);
                        System.out.println("Zadaj meno knihy./ zadavanie ukončíš zadanim slova <quit>");

                    }
                }
                vypisMenu();
                                break;

            case "2":

//                ZoznamObjekt.vypisKnihyObjekt(kniznica);
                //
//                System.out.println("a znova vypis priamo");

                System.out.println();
                for (KnihaObject vystup:kniznica) {
                    System.out.println("Nazov knihy: " + vystup.getMeno());
                    System.out.println("Meno autora: " + vystup.getAutor());
                    System.out.println("Rok vydania: " + vystup.getRokvydania());
                    System.out.println("Rok vydania: " + vystup.getCena());
                    System.out.println("------------------------------------------");
                }

                System.out.println("Zadaj svoju volbu:");

                break;

            case "3":
                KniznicaEvidenciaObjekt.getBookByIndex(kniznica);
                break;

            case "4":
                System.out.println("Vyhladavame podľa mena knihy, Zadaj meno knihy.");
                Scanner scn2 = new Scanner(System.in);
                String hladanyNazov = scn2.nextLine(); // ocakavany vstup od pouzivatela vo forme textu
               ArrayList<KnihaObject> najdeneKnihy = ZoznamObjekt.vyhladaneKnihy(kniznica,hladanyNazov);
                for (KnihaObject najdenaKniha: najdeneKnihy) {
                    System.out.println(najdenaKniha.getMeno());
                    System.out.println(najdenaKniha.getAutor());
                    System.out.println(najdenaKniha.getCena());
                    System.out.println(najdenaKniha.getRokvydania());

                }
                System.out.println("Zadaj svoju volbu:");
                break;

            case "6":

                System.out.println("Počet knih v kniznici je : " + kniznica.size());
                System.out.println("Zadaj svoju volbu:");
                break;

            case "7":
                KniznicaEvidenciaObjekt.removeBookByIndex(kniznica);
               System.out.println("Zadaj svoju volbu:");

                break;

            case "8":
                KniznicaEvidenciaObjekt.removeAllBooks(kniznica);
                System.out.println("Zadaj svoju volbu:");
                break;

            case "0":
                //todo neprerobene do Objektu
//                Collections.sort(zoznamknih);

                System.out.println("Táto možnosť ešte nebola implementovaná - možno další relelase :)");
//                System.out.println("Knihy boli zoradene podla abecedy");

                ZoznamObjekt.vypisKnihyObjekt(kniznica);
                System.out.println("Zadaj svoju volbu:");
                break;

            case "m":
                vypisMenu();
                break;
            case "q":
                System.out.println("-----------Koniec programu------------");
                sc.close();
                return;

            default:
                for (int i = 0; i < 50; ++i) System.out.println();
                vypisMenu();

        }


    }
    }

    public static void vypisMenu() {
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("MENU>      (m)= MENU,....                 (q)= quit : ");
        System.out.println("---------------------------------------------------");
        System.out.println("MENU>      (1)= Zadaj novu knihu ,          (q)= quit : ");
        System.out.println("MENU>      (2)= Vypíš zoznam knih,          (q)= quit : ");
        System.out.println("MENU>      (3)= Vypíš knihu podľa indexu    (q)= quit : ");
        System.out.println("MENU>      (4)= Vypíš knihu podľa Mena knihy(q)= quit : ");
        System.out.println("MENU>      (6)= Vypíš počet knih,           (q)= quit : ");
        System.out.println("MENU>      (7)= Vymaž knihu podľa indexu    (q)= quit : ");

        System.out.println("MENU>      (8)= Zmaž všetky knihy,          (q)= quit : ");
        System.out.println("MENU>      (0)= Sortuj,....                 (q)= quit : ");


        System.out.println("---------------------------------------------------");
        System.out.println("Zadaj svoju volbu:");

    }

}
