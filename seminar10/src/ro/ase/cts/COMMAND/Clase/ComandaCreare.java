package ro.ase.cts.COMMAND.Clase;

public class ComandaCreare extends ComandaAbstracta{

    public ComandaCreare(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().creazaCont(super.getSuma());
    }
}
