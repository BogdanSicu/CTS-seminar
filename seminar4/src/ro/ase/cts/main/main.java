package ro.ase.cts.main;

import ro.ase.cts.clase.singleton.Parlament;
import ro.ase.cts.clase.singleton.lazy.ParlamentLazy;

public class main {
    public static void main(String[] args) {
        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("=================");
        parlament1.setTara("Romania");
        parlament2.setNrParlamentari(123);
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("=================");

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Romania", 112, 5, "yes");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("Bulgaria", 300, 6, "nu");
        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());

    }
}
