package memento;

import java.util.ArrayList;

public class Caretaker {

    ArrayList<Memento> savedArticle = new ArrayList<>();

    public void addMemento(Memento m){savedArticle.add(m);}

    public Memento getMemento(int index){return savedArticle.get(index);}



}
