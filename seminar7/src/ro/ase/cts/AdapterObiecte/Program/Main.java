package ro.ase.cts.AdapterObiecte.Program;

import ro.ase.cts.AdapterObiecte.Clase.AdapterLeasing;
import ro.ase.cts.AdapterObiecte.Clase.Creditable;

public class Main {
    public  static void printeazaInfoCredite(Creditable credit){
        credit.Creditare();
    }

    public static void main(String[] args) {
        AdapterLeasing adapterLeasing = new AdapterLeasing("Gigel", 123456);
        printeazaInfoCredite(adapterLeasing);
    }
}
