package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void setUp(){

        stack = new Stack(3);
    }

    @Test
    public void createEmptyStack_StackIsEmpty() {

        assertTrue(stack.isEmpty());
    }

    @Test
    public void addItemToEmptyStack_StackIsNotEmpty() {

        stack.push("AString");

        assertFalse(stack.isEmpty());
    }

    @Test
    public void addFourItemsToEmptyStack_StackIsFullThrowsException(){

        stack.push("AString");

        stack.push("FString");

        stack.push("DString");

        assertThrows(IllegalArgumentException.class,()-> stack.push("GString"));
    }

    @Test
    public void createEmptyStack_popLastItem_throwException() {

        assertThrows(EmptyStackException.class,()->stack.pop());
    }

    @Test
    public void addTwoItemsToEmptyStack_PopItem_returnsLastItem() {

        stack.push("AString");
        stack.push("FString");

        assertEquals("FString",stack.pop());
    }

    @Test
    public void createEmptyStack_peekLastItem_throwsException() {

        assertThrows(EmptyStackException.class,()->stack.peek());
    }

    @Test
    public void addTwoItemsToEmptyStack_PeekLastItem(){

        stack.push("AString");

        stack.push("FString");

        assertEquals("FString",stack.peek());
    }

    @Test
    public void addThreeItemsToEmptyStack_searchForLastItem() {

        stack.push("AString");

        stack.push("FString");

        stack.push("DString");

        assertEquals(3,stack.search("AString"));
    }

    @Test
    public void addThreeItemsToEmptyStack_searchForItemNotInStack() {

        stack.push("AString");

        stack.push("FString");

        stack.push("DString");

        assertEquals(-1,stack.search("GString"));
    }
}