package ro.ase.cts.template.clase;

public class SpectatorNormal extends Template{

    private String numeSpectator;

    public SpectatorNormal(String numeSpectator) {
        this.numeSpectator = numeSpectator;
    }

    @Override
    public void seAseazaLaCoada() {
        System.out.println(this.numeSpectator+ " s-a asezat la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.numeSpectator+ " a prezentat biletul");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println("Se controleaza corporal spectatorul : "+this.numeSpectator);
    }

    @Override
    public void seOcupaLoc() {
        System.out.println(this.numeSpectator+ " a ocupat un loc in tribune");
    }
}
