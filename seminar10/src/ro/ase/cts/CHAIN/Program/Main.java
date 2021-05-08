package ro.ase.cts.CHAIN.Program;

import ro.ase.cts.CHAIN.Clase.Cont;
import ro.ase.cts.CHAIN.Clase.ContCredit;
import ro.ase.cts.CHAIN.Clase.ContCurent;
import ro.ase.cts.CHAIN.Clase.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(200);
        Cont contCredit = new ContCredit(150);
        Cont contEconomii = new ContEconomii(150);

        contCurent.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);

        contCurent.realizarePlata(100);
        contCurent.realizarePlata(150);
        contCurent.realizarePlata(100);
        contCurent.realizarePlata(100);
        contCurent.realizarePlata(100);
    }
}
