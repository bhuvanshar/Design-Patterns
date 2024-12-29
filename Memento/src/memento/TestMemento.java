package memento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestMemento extends JFrame {
    public static void main(String[] args) {
        new TestMemento();
    }

    private JButton saveBut, undoBut, redoBut;
    private JTextArea theArticle = new JTextArea(40,60);

    Caretaker caretaker = new Caretaker();

    Originator originator = new Originator();

    int saveFiles = 0, currentArticle = 0;

    public TestMemento(){
        this.setSize(750, 780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();

        panel1.add(new JLabel("Article"));
        panel1.add(new JLabel("theArticle"));

        ButtonListner saveListner = new ButtonListner();
        ButtonListner undoListner = new ButtonListner();
        ButtonListner redoListner = new ButtonListner();

        saveBut = new JButton("Save");
        saveBut.addActionListener(saveListner);
        undoBut = new JButton("Save");
        undoBut.addActionListener(undoListner);
        redoBut = new JButton("Save");
        redoBut.addActionListener(redoListner);

        panel1.add(saveBut);
        panel1.add(undoBut);
        panel1.add(redoBut);

        this.add(panel1);
        this.setVisible(true);
    }

    class ButtonListner implements ActionListener{
        public void actionPerformed(ActionEvent e){

            if(e.getSource() == saveBut){

            }
        }
    }
}
