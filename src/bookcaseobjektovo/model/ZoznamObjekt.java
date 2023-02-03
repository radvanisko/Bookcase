package ulohy.bookcaseobjektovo.model;

import java.util.ArrayList;

public class ZoznamObjekt {

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
        kniha2.setAutor("Autor1");
        kniha2.setRokvydania(2000);
        kniha2.setCena(50);

        ArrayList<KnihaObject> zoznamknihobjekt= new ArrayList<>();
        zoznamknihobjekt.add(kniha1);
        zoznamknihobjekt.add(kniha2);

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

    public ZoznamObjekt() {
        this.zoznamknihobjekt = zoznamknihobjekt;
    }
}
