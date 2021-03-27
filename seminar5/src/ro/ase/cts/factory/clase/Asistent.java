package ro.ase.cts.factory.clase;

public class Asistent extends PersonalMedical{

    private int durataLucru;



    public Asistent(String nume, float salariu) {
        super(nume, salariu);
    }

    public Asistent(int durataLucru, String nume, float salariu) {
        super(nume, salariu);
        this.durataLucru = durataLucru;
    }

    public int getDurataLucru() {
        return durataLucru;
    }

    public void setDurataLucru(int durataLucru) {
        this.durataLucru = durataLucru;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Asistent [");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}
