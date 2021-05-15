package ro.ase.cts.memento.clase;

public class Meci {
    private String echipaGazdan;
    private String echipaOaspete;
    private int nrBileteVandute;
    private int nrSpectatori;
    private int nrJandarmi;

    public Meci(String echipaGazdan, String echipaOaspete, int nrBileteVandute, int nrSpectatori, int nrJandarmi) {
        this.echipaGazdan = echipaGazdan;
        this.echipaOaspete = echipaOaspete;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSpectatori = nrSpectatori;
        this.nrJandarmi = nrJandarmi;
    }

    public String getEchipaGazdan() {
        return echipaGazdan;
    }

    public void setEchipaGazdan(String echipaGazdan) {
        this.echipaGazdan = echipaGazdan;
    }

    public String getEchipaOaspete() {
        return echipaOaspete;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public int getNrBileteVandute() {
        return nrBileteVandute;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public int getNrJandarmi() {
        return nrJandarmi;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meci{");
        sb.append("echipaGazdan='").append(echipaGazdan).append('\'');
        sb.append(", echipaOaspete='").append(echipaOaspete).append('\'');
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append(", nrSpectatori=").append(nrSpectatori);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append('}');
        return sb.toString();
    }

    public Memento creareMemento(){
        return new Memento(this.echipaGazdan, this.echipaOaspete, this.nrSpectatori);
    }

    public void setMemento(Memento memento){
        this.echipaGazdan = memento.getEchipaGazdan();
        this.echipaOaspete = memento.getEchipaOaspete();
        this.nrSpectatori = memento.getNrSpectatori();
    }

}
