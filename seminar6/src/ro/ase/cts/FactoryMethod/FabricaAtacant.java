package ro.ase.cts.FactoryMethod;

import ro.ase.cts.Clase.Atacant;
import ro.ase.cts.Clase.Jucator;

public class FabricaAtacant implements FabricaJucator{

    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}
