package ro.ase.cts.FlyWeight.Clase;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FactoryFlyWeight {
    private Map<String, FlyWeightAbastract> clienti;

    public FactoryFlyWeight() {
        this.clienti = new HashMap<>();
    }

    public FlyWeightAbastract getClient(String nrTelefon){
        FlyWeightAbastract client = clienti.get(nrTelefon);
            if(client == null){
                client = new Client("Gigel", nrTelefon, "gigel@gmail.com");
                clienti.put(nrTelefon, client);
            }
        return client;
    }
}
