package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    private Map map;

    @BeforeEach
    public void setUp(){

        map = new Map(4);
    }

    @Test
    public void createEmptyMap_mapIsEmpty() {

        assertTrue(map.isEmpty());
    }

    @Test
    public void addKeyValuePairToEmptyMap_returnsNull() {

        assertNull(map.put("Grace","Onwere"));
    }

    @Test
    public void addKeyValuePairsToEmptyMap_returnsValue() {

        map.put("Grace","Onwere");
        map.put("Yemi","Isieri");

        assertEquals(2,map.size());

        assertEquals("Chukwu",map.put("Grace","Chukwu"));
    }

    @Test
    public void addKeyValuePairsToEmptyMap_returnsSize() {

        map.put("Grace","Onwere");
        map.put("Yemi","Isieri");

        assertEquals(2,map.size());
    }

    @Test
    public void addKeyValuePairsToEmptyMap_getsValue() {

        map.put("Grace","Onwere");
        map.put("Yemi","Isieri");
        map.put("Esuuk","Goodhead");

        assertEquals(3,map.size());

        assertEquals("Goodhead",map.get("Esuuk"));
    }

    @Test
    public void addKeyValuePairsToEmptyMap_returnsTrue_ifKeyInMap() {

        map.put("Grace","Onwere");
        map.put("Yemi","Isieri");
        map.put("Esuuk","Goodhead");

        assertEquals(3,map.size());

        assertTrue(map.containsKey("Esuuk"));
    }

    @Test
    public void addKeyValuePairsToEmptyMap_returnsFalse_ifKeyNotInMap() {

        map.put("Grace","Onwere");
        map.put("Yemi","Isieri");

        assertEquals(2,map.size());

        assertFalse(map.containsKey("Esuuk"));
    }

    @Test
    public void addKeyValuePairsToEmptyMap_returnsTrue_ifValueInMap() {

        map.put("Grace","Onwere");
        map.put("Yemi","Isieri");
        map.put("Esuuk","Goodhead");

        assertEquals(3,map.size());

        assertTrue(map.containsValue("Goodhead"));
    }

//    @Test
//    public void addKeyValuePairsToEmptyMap_removeKey_returnsValue() {
//
//        map.pu t("Grace","Onwere");
//        map.put("Yemi","Isieri");
//        map.put("Musa","Ekiti");
//        map.put("Babatunde","Opeyemi");
//
//        assertEquals("Isieri",map.remove("Yemi"));
//        assertEquals(2,map.size());
//
//        map.put("Esuuk","Goodhead");
//
//        assertEquals(4,map.size());
//        assertTrue(map.containsKey("Esuuk"));
//    }








}
