package ro.ase.cts.Factory.Clase;

public class Atacant extends Jucator{
    public Atacant(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
