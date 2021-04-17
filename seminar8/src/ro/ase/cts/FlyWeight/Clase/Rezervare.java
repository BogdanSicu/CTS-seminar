package ro.ase.cts.FlyWeight.Clase;

public class Rezervare {
    private int nrMasa;
    private int nrRezervare;

    public Rezervare(int nrMasa, int nrRezervare) {
        this.nrMasa = nrMasa;
        this.nrRezervare = nrRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrRezervare=").append(nrRezervare);
        sb.append('}');
        return sb.toString();
    }
}
