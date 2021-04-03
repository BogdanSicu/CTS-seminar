package ro.ase.cts.Factory.Clase;

public class Fundas extends Jucator{
    public Fundas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
