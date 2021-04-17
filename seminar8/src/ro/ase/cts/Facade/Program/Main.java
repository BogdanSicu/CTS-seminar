package ro.ase.cts.Facade.Program;

import ro.ase.cts.Facade.Clase.Facade;
import ro.ase.cts.Facade.Clase.Masa;

public class Main {
    public static void main(String[] args) {

        Masa masa2 = new Masa(15, 10);
        if(Facade.esteMasaPregatita(masa2)){
            System.out.println("Poftiti va rog la masa");
        }else{
            System.out.println("Va rog sa mai asteptati");
        }
    }
}
