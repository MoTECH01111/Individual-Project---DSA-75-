package musicapp;

import java.util.ArrayList;

/**
 * 15/03/2023
 * @author Morris Ouedraogo
 */

public class MyStack implements MusicInt {

    private final ArrayList<String> theStack;

    public MyStack() {
        theStack = new ArrayList<>();
    }
    
    @Override
    public int size() {
        return (theStack.size() / 2);

    }
    
    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }
    
    @Override
    public boolean isFull() {
        return false;
    }
    
    @Override
    public Object pop() {
        if (!(theStack.isEmpty())) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }
    
    @Override
    public void push(Object newItem) {
        theStack.add(0, (String) newItem);

    }
    
    @Override
    public void emptyStack() {
        while (!theStack.isEmpty()) {
            pop();
        }
    }
    
    @Override
    public void enqueue(Object newItem) {
        theStack.add((String) newItem);
    }

   
    @Override
    public Object dequeue() {
        if (!theStack.isEmpty()) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }
}
