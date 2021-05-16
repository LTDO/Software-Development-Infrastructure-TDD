package za.ac.cput.lungatshila.collection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MapImplementationTest {


    @Test
    void testMapAdding(){

        //adding
        MapImplementation.storeName("Lunga", "Tshila");
        MapImplementation.storeName("Clarke", "Oakland");
        MapImplementation.storeName("Bellamy", "Owens");
        MapImplementation.storeName("Jasper", "Cena");

        assertEquals(MapImplementation.counter(), 4);

    }

    @Test
    void testMapRemoveAll(){

        //remove all
        MapImplementation.storeName("Lunga", "Tshila");
        MapImplementation.storeName("Clarke", "Oakland");
        MapImplementation.storeName("Bellamy", "Owens");
        MapImplementation.storeName("Jasper", "Campbell");
        MapImplementation.clear();

        assertEquals(MapImplementation.counter(), 0);

    }

    @Test
    void testMapRemoveOne(){

        //remove only one
        MapImplementation.storeName("Ovayo", "Tshila");
        MapImplementation.storeName("Thembela", "Tshila");
        MapImplementation.storeName("Manesh", "Tshila");
        MapImplementation.storeName("Njinayi", "Kwaza");

        assertEquals(MapImplementation.clearName("Ovayo"), "Ovayo cleared from system");
        System.out.println(MapImplementation.getMap());

    }
}