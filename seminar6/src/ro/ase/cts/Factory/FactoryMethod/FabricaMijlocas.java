package ro.ase.cts.Factory.FactoryMethod;

import ro.ase.cts.Factory.Clase.Jucator;
import ro.ase.cts.Factory.Clase.Mijlocas;

public class FabricaMijlocas implements FabricaJucator{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
