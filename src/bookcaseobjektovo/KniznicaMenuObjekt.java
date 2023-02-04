package ulohy.bookcaseobjektovo;


import ulohy.bookcaseobjektovo.model.*;
//import ulohy.bookcaseobjektovo.model.ZoznamObjekt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//import static ulohy.bookcaseobjektovo.KniznicaEvidenciaObjekt.vypisKnihyObjekt;


public class KniznicaMenuObjekt {

    public static void main(String[] args) {

        KnihaObject kniha=new KnihaObject();
        KniznicaObjekt kniznicaObjekt =new KniznicaObjekt();
        ArrayList<KnihaObject> kniznica= kniznicaObjekt.naplnKniznicu();

        String menuvolba;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vitaj v knižnici" );
        vypisMenu();
        System.out.println("Zadaj svoju volbu:");

      while(true)
      {
        menuvolba = sc.next();

        switch (menuvolba) {
            case "1":

                kniznicaObjekt.doplnKniznicu(kniznica);
                vypisMenu();
                System.out.println("Zadaj svoju volbu:");
                 break;

            case "2":

//                ZoznamObjekt.vypisKnihyObjekt(kniznica);

                System.out.println("a znova vypis priamo");
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
                System.out.println("Zadaj svoju volbu:");
                break;

            case "4":
                System.out.println("Vyhladavame podľa mena knihy, Zadaj meno knihy.");
                Scanner scn2 = new Scanner(System.in);
                String hladanyNazov = scn2.nextLine(); // ocakavany vstup od pouzivatela vo forme textu
               ArrayList<KnihaObject> najdeneKnihy = KniznicaObjekt.vyhladaneKnihy(kniznica,hladanyNazov);
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
                Collections.sort(kniznica, Comparator.comparing(KnihaObject::getMeno));

//                System.out.println("Táto možnosť ešte nebola implementovaná - možno další relelase :)");
                System.out.println("Knihy boli zoradene podla abecedy");
                KniznicaObjekt.vypisKnihyObjekt(kniznica);
                System.out.println("Zadaj svoju volbu:");
                break;

            case "m":
                vypisMenu();
                System.out.println("Zadaj svoju volbu:");
                break;
            case "q":
                System.out.println("-----------Koniec programu------------");
                sc.close();
                return;

            default:
                for (int i = 0; i < 50; ++i) System.out.println();
                vypisMenu();
                System.out.println("Zadaj svoju volbu:");

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
//        System.out.println("Zadaj svoju volbu:");

    }

}
