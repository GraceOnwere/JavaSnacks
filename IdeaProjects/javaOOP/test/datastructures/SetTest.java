package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    private Set set;

    @BeforeEach
    public void setUp(){

        set = new Set(3);
    }

    @Test
    public void createEmptySet_setIsEmpty() {

        assertTrue(set.isEmpty());
    }

    @Test
    public void addItemToEmptySet_setIsNotEmpty() {

        set.add("AString");
        set.add("FString");

        assertFalse(set.isEmpty());
    }

    @Test
    public void addDuplicateItemsToEmptyStack_returnsFalse() {

        set.add("AString");
        set.add("FString");

        assertFalse(set.add("AString"));
    }

    @Test
    public void addDuplicateItemsToEmptySet_setSizeUnchanged() {

        set.add("AString");
        set.add("FString");
        set.add("AString");

        assertEquals(2,set.size());
    }

    @Test
    public void addItemsToEmptySet_returnsTrue_ifSetContainsItem() {

        set.add("AString");
        set.add("FString");

        assertTrue(set.contains("AString"));
    }

    @Test
    public void addItemsToEmptySet_returnsFalse_ifItemNotInSet() {

        set.add("AString");
        set.add("FString");

        assertTrue(set.contains("AString"));
    }

    @Test
    public void addItemsToEmptySet_returnsTrue_ifItemRemoved() {

        set.add("AString");
        set.add("FString");

        assertTrue(set.remove("AString"));
        assertEquals(1,set.size());
    }

    @Test
    public void addItemsToEmptySet_returnsFalse_ifItemNotRemoved() {

        set.add("AString");
        set.add("FString");

        assertFalse(set.remove("DString"));
        assertEquals(2,set.size());
    }

    @Test
    public void removeItemInEmptySet_returnsFalse() {

        assertFalse(set.remove("DString"));
        assertEquals(0,set.size());
    }

    @Test
    public void addFourItemsToEmptySet_setIsFull_throwsException() {

        set.add("AString");
        set.add("FString");
        set.add("DString");

        assertEquals(3,set.size());
        assertThrows(IllegalArgumentException.class,()->set.add("GString") );
    }
}