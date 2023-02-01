package ulohy.bookcaseobjektovo;
import ulohy.bookcaseobjektovo.model.KnihaObject;

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

    public static void vypisKnihyObjekt(ArrayList<KnihaObject>zoznamknih) {

        System.out.print("Zoznam knih : " + "{");
        for (int i = 0; i < zoznamknih.size(); i++) {
            System.out.print(zoznamknih.get(i) + ",");
        }
        System.out.print("}");
        System.out.println();

        // prechadzame vsetkymi prvkami dynamickeho pola knihy, SPOSOB c.2
        for (KnihaObject kniha : zoznamknih) {
            System.out.println(kniha);
        }

    }
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

//  Presunute do KniznicaMenu  -  konzolove menu bŕŕŕŕŕ.....

    /*public static void vypisMenu()  {
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("MENU>      (m)= MENU,....                 (q)= quit : ");
        System.out.println("---------------------------------------------------");
        System.out.println("MENU>       1)= Zadaj novu knihu ,          (q)= quit : ");
        System.out.println("MENU>      (2)= Vypíš zoznam knih,          (q)= quit : ");
        System.out.println("MENU>      (3)= Vypíš knihu podľa indexu    (q)= quit : ");
        System.out.println("MENU>      (6)= Vypíš počet knih,           (q)= quit : ");
        System.out.println("MENU>      (7)= Vymaž knihu podľa indexu    (q)= quit : ");

        System.out.println("MENU>      (8)= Zmaž všetky knihy,          (q)= quit : ");
        System.out.println("MENU>      (0)= Sortuj,....                 (q)= quit : ");


        System.out.println("---------------------------------------------------");
        System.out.println("Zadaj svoju volbu:");

    }*/


/*

        sc = new Scanner(System.in);
        vypisMenu();

        while (true) {

                menuvolba = sc.next();

                switch (menuvolba)
                {
                    case "1":
                        Scanner sc1 = new Scanner(System.in);
                        String nazovknihy;
                        System.out.println("Zadaj meno knihy./ zadavanie ukončíš zadanim slova <quit>");

                        while (true)
                        {
                            nazovknihy=sc1.nextLine();
                            if (nazovknihy.toLowerCase().equals("quit")) {break;}
                            if (!nazovknihy.equals("")) { zoznamknih.add(nazovknihy);}
                        }
                        vypisMenu();
                        break;

                    case "2": vypisDynamickePole(zoznamknih); System.out.println("Zadaj svoju volbu:");

                        break;

                    case "3": getBookByIndex(zoznamknih);
                        System.out.println("Zadaj svoju volbu:");
                        break;

                    case "6":
                        System.out.println("Počet knih v kniznici je : " + getCountOfAllBooks(zoznamknih));
                        System.out.println("Zadaj svoju volbu:");
                        break;

                    case "7":
                        removeBookByIndex(zoznamknih);
                        System.out.println("Zadaj svoju volbu:");
                        break;

                    case "8": removeAllBooks(zoznamknih);
                        System.out.println("Zadaj svoju volbu:");
                        break;

                    case "0": Collections.sort(zoznamknih);
                        System.out.println("Knihy boli zoradene podla abecedy");vypisDynamickePole(zoznamknih);
                        System.out.println("Zadaj svoju volbu:");
                        break;

                    case "m":vypisMenu();
                        break;
                    case "q":
                        System.out.println("Koniec programu") ;sc.close();return;

                    default:
                        for (int i = 0; i < 50; ++i) System.out.println();
                        vypisMenu();

                }
*/


    /*            if(menuvolba.equals("1")) {

                    Scanner sc1 = new Scanner(System.in);
                    String nazovknihy;
                    System.out.println("Zadaj meno knihy./ zadavanie ukončíš zadanim slova <quit>");

                    while (true)
                    {
                        nazovknihy=sc1.nextLine();
                        if (nazovknihy.equals("quit")) {break;}
                        if (!nazovknihy.equals("")) { zoznamknih.add(nazovknihy);}
                    }
                vypisMenu();
                }
            if(menuvolba.equals("2")) {vypisDynamickePole(zoznamknih);  }
            if(menuvolba.equals("3"))   {getBookByIndex(zoznamknih);                }


            if(menuvolba.equals("8")) {removeAllBooks(zoznamknih);  }
            if(menuvolba.equals("6")) { System.out.println("Počet knih v kniznici je : " + getCountOfAllBooks(zoznamknih));  }
            if(menuvolba.equals("0")) {Collections.sort(zoznamknih);
                System.out.println("Knihy boli zoradene podla abecedy");vypisDynamickePole(zoznamknih);}
            if(menuvolba.equals("m"))   {vypisMenu(); }
            if(menuvolba.equals("q")) { System.out.println("Koniec programu") ;sc.close();break;}




            }
*/






