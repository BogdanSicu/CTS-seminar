package ro.ase.cts.Builder.Clase;

public class BuilderRezervare implements AbstractBuilder{

    private Rezervare rezervare = null;

    public BuilderRezervare() {
        this.rezervare = new Rezervare(0, false, false,
                false, false, "nimic");
    }

    public BuilderRezervare(int codRezervare) {
        this.rezervare = new Rezervare(codRezervare, false, false,
                false, false, "nimic");
    }

    public BuilderRezervare setCodRezervare(int codRezervare){
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public BuilderRezervare setAreMancare(boolean areMancare){
        this.rezervare.setAreMancareInclusa(areMancare);
        return this;
    }

    public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic){
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public BuilderRezervare setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa){
        this.rezervare.setAreBauturaRacoritareInclusa(areBauturaRacoritoareInclusa);
        return this;
    }

    public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala){
        this.rezervare.setAreMuzicaAmbientalaPersonalizata(areMuzicaAmbientala);
        return this;
    }

    public BuilderRezervare setGenMuzica(String genMuzica){
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
