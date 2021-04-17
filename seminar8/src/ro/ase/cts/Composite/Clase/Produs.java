package ro.ase.cts.Composite.Clase;

public class Produs implements ComponentaAbastracta{

    private String numeProdus;

    @Override
    public void printareElement() {
        System.out.println("Produsul " + this.numeProdus);
    }

    @Override
    public void adaugaNod(ComponentaAbastracta componentaAbastracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ComponentaAbastracta componentaAbastracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentaAbastracta getNot(int pozitie) {
        throw new UnsupportedOperationException();
    }

    public Produs(String numeProdus) {
        this.numeProdus = numeProdus;
    }
}
