package ro.ase.cts.Composite.Clase;

public interface ComponentaAbastracta {
    public void printareElement();
    public void adaugaNod(ComponentaAbastracta componentaAbastracta);
    public void stergeNod(ComponentaAbastracta componentaAbastracta);
    public ComponentaAbastracta getNot(int pozitie);
}
