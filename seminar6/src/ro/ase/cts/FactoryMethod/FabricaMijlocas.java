package ro.ase.cts.FactoryMethod;

import ro.ase.cts.Clase.Jucator;
import ro.ase.cts.Clase.Mijlocas;

public class FabricaMijlocas implements FabricaJucator{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
