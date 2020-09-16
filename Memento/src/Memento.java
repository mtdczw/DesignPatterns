// Memento Design Pattern
// Declaration: Memento Class
// Used stores an internal state of Originator object at a point of time
// Memento protects against any other access instead by Originator objects which can
// store current state and restore to its previous state (undo mechanism)


// Memento: The basic object that is stored in different states.
public class Memento {
    // The article stored state in Memento Object
    private String articleItem;

    // 2nd Constructor: To create and save a new article String to a new memento Object
    public Memento(String articleToSave) {
        System.out.println("From Memento: Create a new Memento object and store the state");
        setArticleState(articleToSave);
    }

    // Return the value stored in article
    public String getSavedState() {
        System.out.println("From Memento: Previous state of Article is\n" + " " + articleItem);
        return articleItem;
    }

    // Sets the value for article input with new incoming source
    public void setArticleState(String newArticle) {
        this.articleItem = newArticle;
        System.out.println("From Memento: Saved state of Article is\n" + " " + articleItem);
    }
}
