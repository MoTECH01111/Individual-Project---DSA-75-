package musicapp;

/**
 * 15/03/2023
 * @author morrisouedraogo
 */

public interface MusicInt {
    
    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

    public int size();

    public void emptyStack();

    public void enqueue(Object newItem);

    public Object dequeue();
    
}
