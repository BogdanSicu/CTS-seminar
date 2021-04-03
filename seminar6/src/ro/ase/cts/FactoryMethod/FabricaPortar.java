package ro.ase.cts.FactoryMethod;

import ro.ase.cts.Clase.Jucator;
import ro.ase.cts.Clase.Portar;

public class FabricaPortar implements FabricaJucator{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Portar(nume, nrTricou);
    }
}
