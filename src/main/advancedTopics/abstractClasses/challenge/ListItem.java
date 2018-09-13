package main.advancedTopics.abstractClasses.challenge;

public abstract class ListItem {
    protected ListItem rightLink = null;  // The class should contain 2 references to items which will represent the next and previous items
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) { // The abstract class will also need to hold a value - try to be as flexible as possible
        this.value = value;         // when defining the type of this value.
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}