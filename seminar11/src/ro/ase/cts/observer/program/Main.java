package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {
    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Manager1");

        ClientAbonat clientAbonat1 = new ClientAbonat("Popescu");
        ClientAbonat clientAbonat2 = new ClientAbonat("Georgescu");

        managerSala.adaugaAbonat(clientAbonat1);
        managerSala.adaugaAbonat(clientAbonat2);

        managerSala.anuntaMeci("volei");

        managerSala.stergeAbonat(clientAbonat1);

        managerSala.anuntaMeci("fotbal");
    }
}
