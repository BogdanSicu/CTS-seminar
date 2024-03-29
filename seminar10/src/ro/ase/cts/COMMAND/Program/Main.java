package ro.ase.cts.COMMAND.Program;

import ro.ase.cts.COMMAND.Clase.*;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Executant cont = new Executant("Gigel");

        ComandaCreare comandaCreare = new ComandaCreare(cont, 1000);
        managerComenzi.adaugaComanda(comandaCreare);
        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 123));
        managerComenzi.executaComanda();
        managerComenzi.adaugaComanda(new ComandaDepunere(cont, 400));
        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 3000));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
