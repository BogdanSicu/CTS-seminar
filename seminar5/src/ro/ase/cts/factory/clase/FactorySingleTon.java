package ro.ase.cts.factory.clase;

public class FactorySingleTon {
    private static FactorySingleTon factorySingleTon = null;

    public static synchronized FactorySingleTon getInstance(){
        if(factorySingleTon== null){
            factorySingleTon = new FactorySingleTon();
        }
        return factorySingleTon;
    }

    private FactorySingleTon() {
    }

    public PersonalMedical Create(TipPersonal tip, String nume, float salariu){
        switch (tip){
            case MEDIC:
                return new Medic(nume, salariu);

            case ASISTENT:
                return new Asistent(nume, salariu);

            case BRANCARDIER:
                return new Brancardier(nume, salariu);

            default: throw new IllegalArgumentException("Tipul nu este corect");
        }
    }
}
