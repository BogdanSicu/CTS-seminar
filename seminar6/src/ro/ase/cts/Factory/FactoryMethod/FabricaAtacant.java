package ro.ase.cts.Factory.FactoryMethod;

import ro.ase.cts.Factory.Clase.Atacant;
import ro.ase.cts.Factory.Clase.Jucator;

public class FabricaAtacant implements FabricaJucator{

    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}
