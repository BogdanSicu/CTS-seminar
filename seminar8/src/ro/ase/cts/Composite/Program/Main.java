package ro.ase.cts.Composite.Program;

import ro.ase.cts.Composite.Clase.Produs;
import ro.ase.cts.Composite.Clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Produs produs1 = new Produs("desert");
        Produs produs2 = new Produs("suc");
        Produs produs3 = new Produs("fruct");


        Sectiune sectiune1 = new Sectiune("bauturi");
        Sectiune sectiune2 = new Sectiune("desert");

        sectiune1.adaugaNod(produs2);
        sectiune2.adaugaNod(produs1);
        sectiune2.adaugaNod(produs3);

        Sectiune meniu = new Sectiune("meniu");
        meniu.adaugaNod(sectiune1);
        meniu.adaugaNod(sectiune2);
        meniu.printareElement();


    }
}
