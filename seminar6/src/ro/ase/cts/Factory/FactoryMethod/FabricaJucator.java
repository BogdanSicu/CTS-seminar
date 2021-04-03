package ro.ase.cts.Factory.FactoryMethod;

import ro.ase.cts.Factory.Clase.Jucator;

public interface FabricaJucator {
    public Jucator creazaJucator(String nume, int nrTricou);
}
