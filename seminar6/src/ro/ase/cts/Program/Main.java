package ro.ase.cts.Program;

import ro.ase.cts.Clase.Jucator;
import ro.ase.cts.FactoryMethod.FabricaAtacant;
import ro.ase.cts.FactoryMethod.FabricaJucator;
import ro.ase.cts.FactoryMethod.FabricaMijlocas;
import ro.ase.cts.FactoryMethod.FabricaPortar;

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
