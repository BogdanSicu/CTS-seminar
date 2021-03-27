package ro.ase.cts.factory.program;

import ro.ase.cts.factory.clase.*;

public class Main {
    public static void main(String[] args) {

        PersonalMedical medic = Factory.Create(TipPersonal.MEDIC, "Ionescu", 5000);
        PersonalMedical asistent = Factory.Create(TipPersonal.ASISTENT, "Alex", 3000);

        System.out.println("asistent = " + asistent);
        System.out.println("medic = " + medic);
    }
}
