package za.ac.cput.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionImplementationTest {

    CollectionImplementation colImp = new CollectionImplementation();

    @Test
    void testAddToCollection(){
        colImp.addToCollection("Lunga");
        colImp.addToCollection("Tshila");
        colImp.addToCollection("Ovayo");
        colImp.addToCollection("Thembela");

        assertEquals(colImp.counter(), 4);

    }

    @Test
    void testRemoveFromCollection(){
        colImp.addToCollection("Lunga");
        colImp.addToCollection("Tshila");
        colImp.addToCollection("Ovayo");
        colImp.addToCollection("Thembela");
        colImp.removeFromCollection("Lunga");

        assertEquals(colImp.counter(), 3);

    }

    @Test
    void testFindFromCollection(){
        colImp.addToCollection("Lunga");
        colImp.addToCollection("Tshila");
        colImp.addToCollection("Ovayo");
        colImp.addToCollection("Thembela");
        colImp.removeFromCollection("Lunga");

        assertEquals(colImp.findFromCollection("Lunga"), "[Tshila, Ovayo, Thembela]");

    }
}