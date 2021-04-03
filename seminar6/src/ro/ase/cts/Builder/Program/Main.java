package ro.ase.cts.Builder.Program;

import ro.ase.cts.Builder.Clase.BuilderRezervare;
import ro.ase.cts.Builder.Clase.BuilderRezervareV2;
import ro.ase.cts.Builder.Clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(12, true, true, true, true, "Rock");

        Rezervare rezervare1 = new BuilderRezervare()
                .setCodRezervare(12)
                .setAreMancare(true)
                .setAreBauturaRacoritoareInclusa(true)
                .setGenMuzica("Manele")
                .setAreMuzicaAmbientala(true).build();

        System.out.println(rezervare);
        System.out.println("=============================================");
        System.out.println(rezervare1);
        System.out.println("=============================================");

        BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2()
                .setCodRezervare(166)
                .setAreMancare(true)
                .setAreBauturaRacoritoareInclusa(true)
                .setGenMuzica("Pop")
                .setAreMuzicaAmbientala(true);

        Rezervare rezervare2 = builderRezervareV2.build();
        Rezervare rezervare3 = builderRezervareV2.setCodRezervare(100).build();

        System.out.println(rezervare2);
        System.out.println("=============================================");
        System.out.println(rezervare3);
    }
}
