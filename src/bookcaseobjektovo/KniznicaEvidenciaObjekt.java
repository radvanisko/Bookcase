package ulohy.bookcaseobjektovo;

import ulohy.bookcaseobjektovo.model.*;
import java.util.ArrayList;
import java.util.Scanner;

import static ulohy.bookcaseobjektovo.KniznicaMenuObjekt.vypisMenu;

/*

Úloha č. 2
        Vytvorte knižnicu (Library), kde bude môcť používateľ zadať knihy (názvy) cez konzolu kým nezadá slovo quit. Tie na konci vypíšeme. Opakovanie na ArrayList.
        Dodatočná úloha: Vytvorte metódu (getCountOfAllBooks), ktorá zistí počet kníh. Použili sme metódu ArrayList.size();
        Dodatočná úloha č.1: Vytvorte metódu (getFirstBook), ktorá vypíše prvú knihu.
        Dodatočná úloha č.2: Vytvorte metódu (getLastBook), ktorá vypíše poslednú knihu.
        Dodatočná úloha č.3: Vytvorte metódu (getBookByIndex), ktorá vypíše akúkoľvek knihu podľa indexu.
        Dodatočná úloha č.4: Vytvorte metódu (removeBookByIndex), ktorá odstráni akúkoľvek knihu podľa indexu.
        Dodatočná úloha č.5: Vytvorte metódu (removeAllBooks), ktorá zmaže všetky knihy.
        Dodatočná úloha č.6: Vytvorte metódu (findBookByName), ktorá vypíše, či v zozname existuje alebo nie.
        Pomôcka:
public static List<String> findUsingLoop(String search, List<String> list) {
        List<String> matches = new ArrayList<String>();
        for(String str: list) {
        if (str.contains(search)) {
        matches.add(str);
        }
        }
        return matches;
        }
        Zdroj: https://www.baeldung.com/java-search-string-arraylist
        Dodatočná úloha č.7: Vytvorte metódu (findBooksByFulltextSearch), ktorá vypíše knihu / všetky knihy podľa časti názvu alebo vypíše, že neexistuje žiadna.
        Pomôcka:
public static List<String> findUsingLoop(String search, List<String> list) {
        List<String> matches = new ArrayList<String>();
        for(String str: list) {
        if (str.contains(search)) {
        matches.add(str);
        }
        }
        return matches;
        }
        Zdroj: https://www.baeldung.com/java-search-string-arraylist
        Menu s možnosťami
        Zadaj novú knihu
        Zobraz všetky knihy
        Zobraz konkrétnu knihu (podľa indexu)
        Zadaj index knihy, ktorú zobrazujeme
        Zobraz názov poslednej knihy
        Zobraz názov prvej knihy
        Zobraz počet všetkých kníh
        Vymaž konkrétnu knihu (podľa indexu)
        Zadaj index knihy, ktorú odstraňujeme
        Vymaž všetky knihy
        Quit = skončí zadávanie novej knihy


*/

//TODO  : Vytvorte metódu (findBookByName), Vytvorte metódu (findBooksByFulltextSearch), -

//TODO prerobit s objektom KnihaObject


public class KniznicaEvidenciaObjekt {


    public static void vypisKnihuObjektDetail(ArrayList<String>Knihaobjekt) {

        /*System.out.print("Zoznam knih : " + "{");
        for (int i = 0; i < Knihaobjekt.size(); i++) {
            System.out.print(Knihaobjekt.get(i) + ",");
        }
        System.out.print("}");
        System.out.println();*/

        // prechadzame vsetkymi prvkami dynamickeho pola knihy, SPOSOB c.2
        System.out.println("Detailny zoznam kníh :");
        for (String kniha : Knihaobjekt) {
            System.out.print(Knihaobjekt);
        }

    }

    public static int getCountOfAllBooks(ArrayList<KnihaObject> knihaObjectArrayList) { return knihaObjectArrayList.size(); }


    public static void removeAllBooks(ArrayList<KnihaObject> knihaObjectArrayList) {

        Scanner sc2 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        System.out.println("Vazne chces zmazat cely zoznam ? (Y/n)");

        if (sc2.next().equals("Y")) {knihaObjectArrayList.removeAll(knihaObjectArrayList);
            System.out.println("Všetky knihy boli zmazané");}

    }

    public static String getFirstBook(ArrayList<String> dynpole) {

        String prvakniha;
        return prvakniha = dynpole.get(dynpole.size());

    }

    public static void getBookByIndex(ArrayList<KnihaObject> knihaObjectArrayList) {

        Scanner sc2 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        System.out.println("Zadaj cislo indexu knihy, ktory chces vypísať - v zozname je pocet knih :" + knihaObjectArrayList.size());

        int index = 0;
        try {
            index = sc2.nextInt();
            if (index >= knihaObjectArrayList.size() + 1) System.out.println(" v kniznici nemas tolko knih");
            else
                System.out.println("V knižnici máš pod číslom  " + (index) + " knihu:");
            System.out.println(" Meno knihy:            " + knihaObjectArrayList.get(index - 1).getMeno());
            System.out.println(" od autora :            " + knihaObjectArrayList.get(index - 1).getAutor());

        } catch (Exception e) {
            System.out.println("Chyba v zadani indexu");
            vypisMenu();
        }
    }

    public static void removeBookByIndex(ArrayList<KnihaObject> knihaObjectArrayList)
    {
        Scanner sc2 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        System.out.println("Zadaj cislo indexu knihy, ktory chces VYMAZAT - v zozname je pocet knih :" + knihaObjectArrayList.size());

        int index = 0;
        try {
            index = sc2.nextInt();
            if (index >= knihaObjectArrayList.size() + 1) System.out.println(" v kniznici nemas tolko knih");
            else
                System.out.println("Z kniznice bola vymazaza  pod cislom " + (index) + "  kniha s nazvom :" + knihaObjectArrayList.get(index - 1));
            knihaObjectArrayList.remove(index);
        } catch (Exception e) {
            System.out.println("Chyba v zadani indexu knihy");
            vypisMenu();
        }

}
}







