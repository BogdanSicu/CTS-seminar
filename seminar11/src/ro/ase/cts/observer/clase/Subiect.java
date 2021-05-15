package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {

    private List<Observer> listaObserver = null;

    public Subiect(){
        this.listaObserver = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer){
        if(this.listaObserver!=null){
            this.listaObserver.add(observer);
        }else{
            this.listaObserver = new ArrayList<>();
            this.listaObserver.add(observer);
        }
    }


    public void stergeAbonat(Observer observer){
        if(this.listaObserver!=null){
            this.listaObserver.remove(observer);
        }
    }

    public void trimiteNotificare(String mesaj){
        for (Observer element:this.listaObserver) {
            element.receptionareMesaj(mesaj);
        }
    }
}
