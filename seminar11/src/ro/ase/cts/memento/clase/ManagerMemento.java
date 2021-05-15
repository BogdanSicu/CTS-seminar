package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento>  listaMemento;

    public ManagerMemento() {
        listaMemento = new ArrayList<>();
    }

    public void adaugaMemento(Memento memento){
        this.listaMemento.add(memento);
    }

    public Memento getLastMemento(){
        if(this.listaMemento.size()!=0){
            return this.listaMemento.get(this.listaMemento.size()-1);
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public Memento getMemento(int index){
        if(index >=0 && index < this.listaMemento.size()){
            return this.listaMemento.get(index);
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
}
