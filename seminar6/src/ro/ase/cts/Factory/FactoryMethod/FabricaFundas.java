package ro.ase.cts.Factory.FactoryMethod;

import ro.ase.cts.Factory.Clase.Fundas;
import ro.ase.cts.Factory.Clase.Jucator;

public class FabricaFundas implements FabricaJucator{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Fundas(nume, nrTricou);
    }
}
