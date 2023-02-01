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
        kniha1.setMeno("Testovacia 1");
        kniha1.setAutor("Autor1");
        kniha1.setRokvydania(2000);
        kniha1.setCena(50);

        ArrayList<KnihaObject> zoznamknihobjekt= new ArrayList<>();
        zoznamknihobjekt.add(kniha1);
        zoznamknihobjekt.add(kniha2);

        return zoznamknihobjekt;

    }


}
