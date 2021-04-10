package ro.ase.cts.AdapterClase.Program;

import ro.ase.cts.AdapterClase.Clase.AdapterLeasing;
import ro.ase.cts.AdapterClase.Clase.Creditable;
import ro.ase.cts.AdapterClase.Clase.Leasing;

public class Main {
    public  static void printeazaInfoCredite(Creditable credit){
        credit.Creditare();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Petrica", 1234);
        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.Creditare();
        System.out.println("=================================================================");
        printeazaInfoCredite(adapterLeasing);
    }
}
