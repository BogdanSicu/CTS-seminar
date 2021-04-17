package ro.ase.cts.Composite.Clase;

import java.util.ArrayList;

public class Sectiune implements ComponentaAbastracta{
    private String numeSectiune;
    ArrayList<ComponentaAbastracta> listaComponente = new ArrayList<>();

    @Override
    public void printareElement() {
        System.out.println("Sectiune "+this.numeSectiune);
        for(ComponentaAbastracta componentaAbastracta : listaComponente){
            componentaAbastracta.printareElement();
        }
    }

    @Override
    public void adaugaNod(ComponentaAbastracta componentaAbastracta) {
        if(listaComponente!=null){
            listaComponente.add(componentaAbastracta);
        }
    }

    @Override
    public void stergeNod(ComponentaAbastracta componentaAbastracta) {
        if(listaComponente!=null){
            listaComponente.remove(componentaAbastracta);
        }
    }

    @Override
    public ComponentaAbastracta getNot(int pozitie) {
        if(pozitie >=0 && pozitie < listaComponente.size()){
            return listaComponente.get(pozitie);
        }
        return null;
    }

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }
}
