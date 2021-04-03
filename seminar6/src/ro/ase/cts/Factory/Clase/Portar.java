package ro.ase.cts.Factory.Clase;

public class Portar extends Jucator{
    public Portar(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
