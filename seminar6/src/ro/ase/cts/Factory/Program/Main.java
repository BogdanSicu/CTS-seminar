package ro.ase.cts.Factory.Program;

import ro.ase.cts.Factory.Clase.Jucator;
import ro.ase.cts.Factory.FactoryMethod.FabricaAtacant;
import ro.ase.cts.Factory.FactoryMethod.FabricaJucator;
import ro.ase.cts.Factory.FactoryMethod.FabricaMijlocas;
import ro.ase.cts.Factory.FactoryMethod.FabricaPortar;

public class Main {

    public static void afiseazaInformatiiJucator(FabricaJucator fabrica, String nume, int nrTricou){
        Jucator jucator = fabrica.creazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afiseazaInformatiiJucator(new FabricaAtacant(), "Popescu", 15);
        afiseazaInformatiiJucator(new FabricaPortar(), "Ionescu", 17);
        afiseazaInformatiiJucator(new FabricaMijlocas(), "Georgescu", 11);
    }
}
