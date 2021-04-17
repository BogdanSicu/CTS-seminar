package ro.ase.cts.FlyWeight.Program;

import ro.ase.cts.FlyWeight.Clase.FactoryFlyWeight;
import ro.ase.cts.FlyWeight.Clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1,1);
        Rezervare rezervare2 = new Rezervare(2,2);
        Rezervare rezervare3 = new Rezervare(3,3);

        FactoryFlyWeight factory = new FactoryFlyWeight();
        factory.getClient("0123456789").printeazaRezervare(rezervare1);
        factory.getClient("0123456789").printeazaRezervare(rezervare2);
        factory.getClient("0000").printeazaRezervare(rezervare3);
    }
}
