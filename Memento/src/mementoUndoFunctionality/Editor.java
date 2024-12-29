package mementoUndoFunctionality;

import memento.Memento;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {
//    responsible for capturing and restoring the originator's state. also called the caretaker.
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor(){
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text){
        textArea.set(text);
        stateHistory.add(textArea.takeSnapshot());
    }
    public void undo(){
        textArea.restore(stateHistory.pop());
    }
}
