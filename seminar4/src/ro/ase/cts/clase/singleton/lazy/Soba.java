package ro.ase.cts.clase.singleton.lazy;

public class Soba {
    private int cost;
    private String firma;
    private double greutateKG;

    private static Soba instantaSoba = null;

    public static synchronized Soba getInstance(int cost, String firma, double greutateKG){
        if(instantaSoba == null){
            instantaSoba = new Soba(cost, firma, greutateKG);
        }
        return instantaSoba;
    }

    private Soba(int cost, String firma, double greutateKG) {
        this.cost = cost;
        this.firma = firma;
        this.greutateKG = greutateKG;
    }

    private Soba() {
        this.cost=0;
        this.firma = "anonim";
        this.greutateKG = 5.6;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setGreutateKG(double greutateKG) {
        this.greutateKG = greutateKG;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Soba{");
        sb.append("cost=").append(cost);
        sb.append(", firma='").append(firma).append('\'');
        sb.append(", greutateKG=").append(greutateKG);
        sb.append('}');
        return sb.toString();
    }
}
