package ro.ase.cts.Factory.Clase;

public class Mijlocas extends Jucator{
    public Mijlocas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocas{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
