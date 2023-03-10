package ulohy.bookcaseobjektovo.model;

import java.util.ArrayList;
import java.util.Scanner;

public class KniznicaObjekt {

    public ArrayList<KnihaObject> zoznamknihobjekt= new ArrayList<KnihaObject>();

    public ArrayList<KnihaObject> getZoznamknihobjekt() {
        return zoznamknihobjekt;
    }

    public void setZoznamknihobjekt(ArrayList<KnihaObject> zoznamknihobjekt) {
        this.zoznamknihobjekt = zoznamknihobjekt;
    }

    public ArrayList<KnihaObject> naplnKniznicu(){
        KnihaObject kniha1= new KnihaObject();
        kniha1.setMeno("Testovacia 1");
        kniha1.setAutor("Autor1");
        kniha1.setRokvydania(2000);
        kniha1.setCena(50);

        KnihaObject kniha2= new KnihaObject();
        kniha2.setMeno("Testovacia 2");
        kniha2.setAutor("Autor2");
        kniha2.setRokvydania(1900);
        kniha2.setCena(50);

        ArrayList<KnihaObject> zoznamknihobjekt= new ArrayList<>();
        zoznamknihobjekt.add(kniha1);
        zoznamknihobjekt.add(kniha2);

        return zoznamknihobjekt;

    }

    public static ArrayList<KnihaObject> doplnKniznicu(ArrayList<KnihaObject>zoznamknihobjekt) {
//        KnihaObject kniha= new KnihaObject();
//        ArrayList<KnihaObject> zoznamknihobjekt= new ArrayList<>();

        Scanner sc1 = new Scanner(System.in);
        String vstup;
        System.out.println("Zadaj meno knihy./ zadavanie ukončíš zadanim slova <quit>");

        while (true) {
           KnihaObject kniha= new KnihaObject();
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

                try {
                    kniha.setRokvydania(Integer.parseInt(vstup));
                    System.out.println("Zadaj cenu");
                } catch (NumberFormatException e) {

                }

                try {
                    vstup = sc1.nextLine();
                    kniha.setCena(Integer.parseInt(vstup));
                } catch (NumberFormatException e) {

                }

                System.out.println("Zadaj meno knihy./ zadavanie ukončíš zadanim slova <quit>");

            }
            zoznamknihobjekt.add(kniha);
        }

        return zoznamknihobjekt;

    }

    public static void vypisKnihyObjekt(ArrayList<KnihaObject>kniznica) {

        System.out.println();
        for (KnihaObject vystup:kniznica) {
            System.out.println("Nazov knihy: " + vystup.getMeno());
            System.out.println("Meno autora: " + vystup.getAutor());
            System.out.println("Rok vydania: " + vystup.getRokvydania());
            System.out.println("Rok vydania: " + vystup.getCena());
            System.out.println("------------------------------------------");
        }

        /*
        // prechadzame vsetkymi prvkami dynamickeho pola knihy, SPOSOB c.2
        for (KnihaObject kniha : zoznamknih) {
            System.out.println(kniha);
        }
*/
    }


    public static ArrayList<KnihaObject> vyhladaneKnihy (ArrayList<KnihaObject> kniznica, String hladanyNazov){

        ArrayList<KnihaObject> vyhladaneKnihy=new ArrayList<KnihaObject>();
        for (KnihaObject kniha:kniznica ) {
            if (kniha.getMeno().contains((hladanyNazov))) {
                vyhladaneKnihy.add(kniha);
            }
        }
        return vyhladaneKnihy;
    }

    public KniznicaObjekt() {
        this.zoznamknihobjekt = zoznamknihobjekt;
    }
}
