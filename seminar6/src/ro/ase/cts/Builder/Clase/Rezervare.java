package ro.ase.cts.Builder.Clase;

public class Rezervare {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritareInclusa;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzica;

    public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaRacoritareInclusa, boolean areMuzicaAmbientalaPersonalizata, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaRacoritareInclusa = areBauturaRacoritareInclusa;
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    public boolean isAreMancareInclusa() {
        return areMancareInclusa;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    public boolean isAreBauturaRacoritareInclusa() {
        return areBauturaRacoritareInclusa;
    }

    public boolean isAreMuzicaAmbientalaPersonalizata() {
        return areMuzicaAmbientalaPersonalizata;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBauturaRacoritareInclusa(boolean areBauturaRacoritareInclusa) {
        this.areBauturaRacoritareInclusa = areBauturaRacoritareInclusa;
    }

    public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturaRacoritareInclusa=").append(areBauturaRacoritareInclusa);
        sb.append(", areMuzicaAmbientalaPersonalizata=").append(areMuzicaAmbientalaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
