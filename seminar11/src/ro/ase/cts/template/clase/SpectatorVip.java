package ro.ase.cts.template.clase;

public class SpectatorVip extends Template{

    private String nume;
    private int nrLoja;

    public SpectatorVip(String nume, int nrLoja) {
        this.nume = nume;
        this.nrLoja = nrLoja;
    }

    @Override
    public void seAseazaLaCoada() {}

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume + " prezinta biletul pentru loja "+this.nrLoja);
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println("Se face controlul spectatorului VIP : "+this.nume);
    }

    @Override
    public void seOcupaLoc() {
        System.out.println(this.nume + " ocupa loc la loja "+this.nrLoja);
    }
}
