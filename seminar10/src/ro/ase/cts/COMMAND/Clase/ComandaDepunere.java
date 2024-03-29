package ro.ase.cts.COMMAND.Clase;

public class ComandaDepunere extends ComandaAbstracta{

    public ComandaDepunere(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().depunereSuma(super.getSuma());
    }
}
