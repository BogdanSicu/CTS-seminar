package ro.ase.cts.AdapterClase.Clase;

public class Leasing {
    String numeClient;
    int suma;

    public Leasing(String numeClient, int suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    public void OferaLeasing(){
        System.out.println("Pentru clientul " + this.numeClient + " a fost oferit un leasing de " + this.suma + " euro.");
    }
}
