package ro.ase.cts.Composite.Program;

import ro.ase.cts.Composite.Clase.Produs;
import ro.ase.cts.Composite.Clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Produs prajitura = new Produs("prajitura");
        Produs suc = new Produs("suc");
        Produs fruct = new Produs("fruct");


        Sectiune bauturi = new Sectiune("bauturi");
        Sectiune desert = new Sectiune("desert");

        bauturi.adaugaNod(suc);
        desert.adaugaNod(prajitura);
        desert.adaugaNod(fruct);

        Sectiune meniu = new Sectiune("meniu");
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);
        meniu.printareElement();


    }
}
