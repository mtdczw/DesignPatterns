// Memento Design Pattern
// Declaration: TestMemento Class
// To create a UI based interactive operations like Save, Undo, Redo
// To demonstrate the entire undo mechanism and access control between
// Originator and Memento objects with help of Caretaker.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestMemento extends JFrame{
    public static void main(String[] args) {

        new TestMemento();

    }
    // Save, Undo, Redo button GUI element.
    private JButton saveBut, undoBut, redoBut, closeBut;

    // JTextArea(rows, columns)
    private JTextArea theArticle = new JTextArea(30,60);

    //
    private JPanel panel1 = new JPanel();

    // ButtonListeners to the panel
    private ButtonListener saveListener = new ButtonListener();
    private ButtonListener undoListener = new ButtonListener();
    private ButtonListener redoListener = new ButtonListener();
    private ButtonListener closeListener = new ButtonListener();

    // ---------------------------------------------
    // Create a caretaker that contains the ArrayList
    // with all the articles in it. It can add and
    // retrieve articles from the ArrayList
    Caretaker caretaker = new Caretaker();

    // The originator sets the value for the article,
    // creates a new memento with a new article, and
    // gets the article stored in the current memento
    Originator originator = new Originator();

    // saveFiles: index to monitor how many articles are saved
    // currentArticle: index to monitor the current article displayed
    int saveFiles = 0, currentArticle = 0;

    // ---------------------------------------------
    public TestMemento(){

        // Set basic information for the panel that will
        // hold all the GUI elements
        this.setSize(600,600);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addLabelButtonToPanel();

    }
    // The collection of layout UI elements onto the Panel.
    private void addLabelButtonToPanel() {
        // Add label to the panel
        panel1.add(new JLabel("Article"));

        // Add JTextArea to the panel
        panel1.add(theArticle);

        // Layout the buttons for Save, Undo, Redo, Close
        saveBut = new JButton("Save");
        saveBut.addActionListener(saveListener);

        undoBut = new JButton("Undo");
        undoBut.addActionListener(undoListener);

        redoBut = new JButton("Redo");
        redoBut.addActionListener(redoListener);

        closeBut = new JButton("Close");
        closeBut.addActionListener(closeListener);
        // Add the buttons to Panel
        panel1.add(saveBut);
        panel1.add(undoBut);
        panel1.add(redoBut);
        panel1.add(closeBut);

        // Add panel to the frame that shows on screen
        this.add(panel1);
        this.setVisible(true);
    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // When clicks Save button
            if(e.getSource() == saveBut){

                saveOps();

            } else
            // When clicks Undo button
            if(e.getSource() == undoBut){

                undoOps();

            } else
            // When clicks Redo button
            if(e.getSource() == redoBut){

                redoOps();

            } else
            // When clicks Close button
            if(e.getSource() == closeBut) {
                System.exit(0);
            }
        }

        // Extract method: create a new Memento to save a new article state request from Originator
        private void saveOps() {
            // Get text in JTextArea
            String textInTextArea = theArticle.getText();

            // Set the value for the current memento
            originator.setArticleState(textInTextArea);

            // Create new Memento by Originator, then keeping by Caretaker
            caretaker.addMementoToChain( originator.createMemento() );

            // saveFiles increased index by 1 to the Chain
            // currentArticle increased index by 1 to the Chain
            saveFiles++;
            currentArticle++;

            System.out.println("Save Files " + saveFiles);
            System.out.println("Current File No." + currentArticle + "\n");
            // Make undo clickable
            undoBut.setEnabled(true);
        }

        // Extract method: restore the state to previous saved article in Memento
        private void undoOps() {
            // Undo mechanism
            if(currentArticle > 1){

                // Decrement to the current article displayed
                currentArticle--;

                // Get the older article saved and display it in JTextArea
                originator.setMemento( caretaker.getMementoFromChain(currentArticle-1) );
                String textBoxString = originator.getArticleState();

                theArticle.setText(textBoxString);

                System.out.println("Backward File No." + (currentArticle) + "\n");

                // Make Redo clickable
                redoBut.setEnabled(true);

            } else {

                // Don't allow user to click Undo
                undoBut.setEnabled(false);

                System.out.println("Already been the First File! No more in the front!\n");

            }
        }

        // Extract method: restore the state to the subsequent saved article in Memento
        private void redoOps() {
            if((saveFiles - 1) >= currentArticle){

                // Increment to the current article displayed
                currentArticle++;

                // Get the newer article saved and display it in JTextArea
                originator.setMemento( caretaker.getMementoFromChain(currentArticle-1) );
                String textBoxString = originator.getArticleState();

                theArticle.setText(textBoxString);

                System.out.println("Forward File No." + (currentArticle) + "\n");

                // Make undo clickable
                undoBut.setEnabled(true);

            } else {

                // Don't allow user to click Redo
                redoBut.setEnabled(false);
                System.out.println("Already been the Last File! No more in the end!\n");
            }
        }

    }

}