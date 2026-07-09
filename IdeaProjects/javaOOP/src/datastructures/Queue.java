package datastructures;

import java.util.NoSuchElementException;

public class Queue {

    private final String[] items;

    private int count;

    public Queue(int size) {

        items = new String[size];
    }

    private boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {

        return (count == items.length);
    }

    public boolean add(String item) {

        if (isFull()) {
            throw new IllegalStateException("Space is currently unavailable");
        }

        items[count] = item;
        count++;

        return true;
    }

    public boolean offer(String item) {

        if (isFull()) return false;

        items[count] = item;
        count++;

        return true;
    }

    public String element() {

        if (isEmpty()) {

            throw new NoSuchElementException();
        }
        return items[0];
    }

    public String peek() {

        if (isEmpty()) return null;

        return items[0];
    }

    public String poll() {

        if (isEmpty()) return null;

        --count;
        return items[0];
    }

    public String remove() {

        if (isEmpty()) throw new NoSuchElementException();

        --count;
        return items[0];
    }
}