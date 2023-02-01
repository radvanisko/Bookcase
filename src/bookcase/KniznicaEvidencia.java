package ulohy.bookcase;
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
//TODO : Zobraz názov poslednej knihy, Zobraz názov prvej knihy - len formalita
//TODO prerobit s objektom KnihaObject
//TODO dorobit Gui

public class KniznicaEvidencia {

    public static void vypisDynamickePole(ArrayList<String> dynpole) {

        System.out.print("Zoznam knih : " + "{");
        for (int i = 0; i < dynpole.size(); i++) {
            System.out.print(dynpole.get(i) + ",");
        }
        System.out.print("}");
        System.out.println();

        // prechadzame vsetkymi prvkami dynamickeho pola knihy, SPOSOB c.2
        for (String kniha : dynpole) {
            System.out.println(kniha);
        }

    }

    public static int getCountOfAllBooks(ArrayList<String> dynpole) {
        return dynpole.size();
    }

    public static void removeAllBooks(ArrayList<String> dynpole) {

        Scanner sc2 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        System.out.println("Vazne chces zmazat cely zoznam ? (Y/n)");

        if (sc2.next().equals("Y")) {dynpole.removeAll(dynpole);
            System.out.println("Všetky knihy boli zmazané");}

    }

    public static String getFirstBook(ArrayList<String> dynpole) {

        String prvakniha;
        return prvakniha = dynpole.get(dynpole.size());

    }

    public static void getBookByIndex(ArrayList<String> dynpole) {

        Scanner sc2 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        System.out.println("Zadaj cislo indexu knihy, ktory chces vypísať - v zozname je pocet knih :" + dynpole.size());

        int index = 0;
        try {
            index = sc2.nextInt();
            if (index >= dynpole.size() + 1) System.out.println(" v kniznici nemas tolko knih");
            else
                System.out.println("V knižnici máš pod číslom  " + (index) + "  knihu s nazvom :" + dynpole.get(index - 1));
        } catch (Exception e) {
            System.out.println("chyba v zadani indexu");
            vypisMenu();
        }
    }

    public static void removeBookByIndex(ArrayList<String> dynpole)
    {
        Scanner sc2 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        System.out.println("Zadaj cislo indexu knihy, ktory chces VYMAZAT - v zozname je pocet knih :" + dynpole.size());

        int index = 0;
        try {
            index = sc2.nextInt();
            if (index >= dynpole.size() + 1) System.out.println(" v kniznici nemas tolko knih");
            else
                System.out.println("Z kniznice bola vymazaza  pod cislom " + (index) + "  kniha s nazvom :" + dynpole.get(index - 1));
            dynpole.remove(index);
        } catch (Exception e) {
            System.out.println("chyba v zadani indexu knihy");
            vypisMenu();
        }

}
}




