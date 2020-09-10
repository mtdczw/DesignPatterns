// Memento Design Pattern
// Declaration: Originator Class
// To create a Memento object containing a state of its current internal
// To use the Memento to restore its internal state


// Originator: Sets and Gets values from the currently targeted Memento.
// Originator: Creates new Memento(s) and assigns current values to them.
public class Originator {

    // To store the state of the incoming article content
    private String articleState;

    // Sets new state of article in Originator
    public void setArticleState(String newArticle) {
        System.out.println("From Originator: Current Version of Article\n" + " " + newArticle);
        this.articleState = newArticle;
    }

    // Get the current state of article in Originator
    public String getArticleState() { return articleState; }

    // Create and Return a new Memento object with a new article
    // It's a safe method that is to store state in Memento.
    public Memento createMemento() {
        System.out.println("From Originator: Saving to Memento");
        return new Memento(articleState);
    }

    // Retrieve the state back from saved Memento
    // It's a safe method that is to restore the state saved in Memento
    public void setMemento(Memento memento) {
        System.out.println("From Originator: Previous Article Restore from Memento");
        articleState = memento.getSavedState();
    }

}