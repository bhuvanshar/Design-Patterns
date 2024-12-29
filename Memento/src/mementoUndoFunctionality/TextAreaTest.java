package mementoUndoFunctionality;

public class TextAreaTest {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Like and");
        editor.write("Like and Subscribe");
        editor.write("Like and Subscribe to Geekific!");

        editor.undo();
    }
}
