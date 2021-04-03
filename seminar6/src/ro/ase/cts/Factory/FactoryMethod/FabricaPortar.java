package ro.ase.cts.Factory.FactoryMethod;

import ro.ase.cts.Factory.Clase.Jucator;
import ro.ase.cts.Factory.Clase.Portar;

public class FabricaPortar implements FabricaJucator{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Portar(nume, nrTricou);
    }
}
