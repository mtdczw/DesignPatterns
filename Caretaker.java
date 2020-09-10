// Memento Design Pattern Tutorial

import java.util.ArrayList;

// Caretaker: Holds a Chain structure(i.e.,ArrayList) that contains all states of the Memento.
// Caretaker: It can store and retrieve Mementos for saved articles.
class Caretaker {

    // Where all mementos are saved in the history chain
    private ArrayList<Memento> savedArticleChain = new ArrayList<Memento>();

    // Adds Memento to the Chain structure (herein, ArrayList)
    public void addMementoToChain(Memento m) { savedArticleChain.add(m); }

    // Gets the memento requested from the Chain structure(herein, ArrayList).
    public Memento getMementoFromChain(int index) { return savedArticleChain.get(index); }
} 