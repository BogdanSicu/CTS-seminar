package ro.ase.cts.FactoryMethod;

import ro.ase.cts.Clase.Jucator;

public interface FabricaJucator {
    public Jucator creazaJucator(String nume, int nrTricou);
}
