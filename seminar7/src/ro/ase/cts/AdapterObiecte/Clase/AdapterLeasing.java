package ro.ase.cts.AdapterObiecte.Clase;

public class AdapterLeasing extends Leasing implements Creditable{

    public AdapterLeasing(String numeClient, int suma) {
        super(numeClient, suma);
    }

    @Override
    public void Creditare() {
        super.OferaLeasing();
    }
}
