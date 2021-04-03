package ro.ase.cts.FactoryMethod;

import ro.ase.cts.Clase.Fundas;
import ro.ase.cts.Clase.Jucator;

public class FabricaFundas implements FabricaJucator{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Fundas(nume, nrTricou);
    }
}
