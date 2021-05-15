package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.Meci;

public class Main {
    public static void main(String[] args) {
        ManagerMemento managerMemento = new ManagerMemento();

        Meci meci = new Meci("Astra", "Real", 100, 100, 30);
        managerMemento.adaugaMemento(meci.creareMemento());

        meci.setEchipaGazdan("Rapid");
        meci.setNrSpectatori(300);

        managerMemento.adaugaMemento(meci.creareMemento());

        System.out.println(meci.toString());

        meci.setMemento(managerMemento.getMemento(0));

        System.out.println(meci.toString());
    }
}
