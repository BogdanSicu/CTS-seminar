package ro.ase.cts.AdapterClase.Clase;

public class AdapterLeasing implements Creditable{
    private Leasing leasing;

    public AdapterLeasing(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void Creditare() {
        leasing.OferaLeasing();
    }
}
