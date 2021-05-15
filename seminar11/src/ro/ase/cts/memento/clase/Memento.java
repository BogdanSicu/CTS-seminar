package ro.ase.cts.memento.clase;

public class Memento {
    private String echipaGazdan;
    private String echipaOaspete;
    private int nrSpectatori;

    public Memento(String echipaGazdan, String echipaOaspete, int nrSpectatori) {
        this.echipaGazdan = echipaGazdan;
        this.echipaOaspete = echipaOaspete;
        this.nrSpectatori = nrSpectatori;
    }

    public String getEchipaGazdan() {
        return echipaGazdan;
    }

    public String getEchipaOaspete() {
        return echipaOaspete;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }
}
