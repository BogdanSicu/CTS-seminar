package ro.ase.cts.Builder.Clase;

public class BuilderRezervareV2 implements AbstractBuilder {

    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritareInclusa;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzica;

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare, areMancareInclusa, areScaunErgonomic,
                areBauturaRacoritareInclusa, areMuzicaAmbientalaPersonalizata, genMuzica);
    }

    public BuilderRezervareV2() {
        codRezervare = 1000;
        genMuzica = "Rock";
    }

    public BuilderRezervareV2 setCodRezervare(int codRezervare){
        this.codRezervare = codRezervare;
        return this;
    }

    public BuilderRezervareV2 setAreMancare(boolean areMancare){
        this.areMancareInclusa = areMancare;
        return this;
    }

    public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic){
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervareV2 setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa){
        this.areBauturaRacoritareInclusa = areBauturaRacoritoareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala){
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientala;
        return this;
    }

    public BuilderRezervareV2 setGenMuzica(String genMuzica){
        this.genMuzica = genMuzica;
        return this;
    }

}
