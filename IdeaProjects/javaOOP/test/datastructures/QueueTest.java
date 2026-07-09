package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    public void setUp(){
        queue = new Queue(3);
    }


    @Test
    public void addItemToEmptyQueue_andReturnsTrue() {

        assertTrue(queue.add("AString"));
    }

    @Test
    public void addFourItemsToEmptyQueue_queueIsFull_throwsException() {

        queue.add("AString");
        queue.add("FString");
        queue.add("DString");

        assertThrows(IllegalStateException.class,()-> queue.add("GString"));
    }

    @Test
    public void offerItemToEmptyQueue_returnsTrue(){

        assertTrue(queue.offer("AString"));
    }

    @Test
    public void offerFourItemsToEmptyQueue_queueIsFull_returnsFalse(){

        queue.offer("AString");
        queue.offer("FString");
        queue.offer("DString");

        assertFalse(queue.offer("AString"));
    }

    @Test
    public void createEmptyQueue_retrieveFirstItem_throwsException() {

        assertThrows(NoSuchElementException.class,()->queue.element());
    }

    @Test
    public void addThreeItemsToEmptyQueue_retrieveFirstItem() {

        queue.add("AString");
        queue.add("FString");
        queue.add("DString");

        assertEquals("AString",queue.element());
    }

    @Test
    public void createEmptyQueue_retrieveFirstItem_returnsNull() {

        assertNull(queue.peek());
    }

    @Test
    public void addTwoItemsToEmptyQueue_retrieveFirstItem() {

        queue.add("AString");
        queue.add("FString");

        assertEquals("AString",queue.peek());
    }

    @Test
    public void addTwoItemsToEmptyQueue_retrievesAllItems_returnsNull() {

        queue.add("AString");
        queue.add("FString");

        queue.poll();
        queue.poll();

        assertNull(queue.poll());
    }

    @Test
    public void addTwoItemsToEmptyQueue_retrievesFirstItem() {

        queue.add("AString");
        queue.add("FString");

        assertEquals("AString",queue.poll());
    }


    @Test
    public void addTwoItemsToEmptyQueue_removeAllItems_throwException() {

        queue.add("AString");
        queue.add("FString");

        queue.remove();
        queue.remove();

        assertThrows(NoSuchElementException.class,()->queue.remove());
    }

    @Test
    public void addTwoItemsToEmptyQueue_removeFirstItem() {

        queue.add("AString");
        queue.add("FString");

        assertEquals("AString",queue.remove());
    }
}