package ro.ase.cts.Facade.Clase;

public class Facade {
    public static boolean esteMasaPregatita(Masa masa){
        if(OperatorMese.esteLiberaMasa(masa.getNrMasa())){
            Picolo picolo1 = new Picolo("Gigel");
            if(picolo1.esteDebarasataMasa(masa.getNrMasa())){
                if(picolo1.esteAranjataMasa(masa.getNrMasa())){
                    return true;
                }
            }
        }
        return false;
    }
}
