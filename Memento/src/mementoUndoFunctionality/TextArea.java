package mementoUndoFunctionality;

public class TextArea {
//    This class produces snapshots of its own state adn restores its state from snapshots. Also called the originator.
    private String text;
    public void set(String text){
        this.text = text;
    }

    public Memento takeSnapshot(){
        return new Memento(this.text);
    }

    public void restore(Memento memento){
        this.text = memento.getSavedText();
    }

    public static class Memento{
//        Acts as a snapshot of teh Originator's state.
        private final String text;

        private Memento(String textToSave){
            text = textToSave;
        }
        private String getSavedText(){
            return text;
        }
    }
}
