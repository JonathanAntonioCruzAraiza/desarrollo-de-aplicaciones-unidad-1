package mx.edu.utng.mementoexamen;

import java.util.ArrayList;

/**
 * Created by jony on 8/9/2016.
 */
public class CareTaker {
    private ArrayList<Memento> mementos = new ArrayList<Memento>();

    public void addMemento(Memento memento){
        mementos.add(memento);
    }

    public Memento getMemento(int index){
        return  mementos.get(index);
    }

    public ArrayList<Memento> getMementos() {
        return mementos;
    }
}
