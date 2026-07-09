package datastructures;

import java.util.EmptyStackException;

public class Stack {

    private final String [] items ;

    private int count;

    public Stack(int size){

        items = new String[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {

        return (count == items.length);
    }

    public void push(String item){

        if(isFull()){
            throw new IllegalArgumentException("Stack is full");
        }

        items[count++] = item;
    }
    public String pop(){

        if(isEmpty()){
            throw new EmptyStackException();
        }
        return items[--count];
    }

    public String peek(){

        if(isEmpty()){
            throw new EmptyStackException();
        }

        return items[count-1];
    }

    public int search(String item){

        int distanceFromTop = 1;

        for(int index = items.length -1; index >= 0; index--){

            if (items[index].equals(item)) return distanceFromTop;
            distanceFromTop++;
        }
        return -1;
    }
}