package ro.ase.cts.FlyWeight.Clase;

public class Client implements FlyWeightAbastract {
    private String numeClient;
    private String nrTelefon;
    private String email;

    public Client(String numeClient, String nrTelefon, String email) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println(this.toString() + rezervare.toString());
    }
}
