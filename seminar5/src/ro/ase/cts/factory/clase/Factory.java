package ro.ase.cts.factory.clase;

public class Factory {
    public static PersonalMedical Create(TipPersonal tip, String nume, float salariu){
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
