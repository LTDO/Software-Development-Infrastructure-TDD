package za.ac.cput.collection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SetImplementationTest {


    SetImplementation setImp = new SetImplementation();
    @Test
    void testAddtoSet(){
        setImp.addToSet("Lunga", 25_000);
        setImp.addToSet("Ovayo", 15_000);
        setImp.addToSet("Manesh", 20_000);

        assertEquals(setImp.counter(), 3);
    }

    @Test
    void testRemoveFromSet(){
        setImp.addToSet("Lunga", 25_000);
        setImp.addToSet("Ovayo", 15_000);
        setImp.addToSet("Manesh", 20_000);

        setImp.removeFromSet("Lunga");

        assertEquals(setImp.counter(), 2);
    }

    @Test
    void testFindFromSet(){
        setImp.addToSet("Lunga", 25_000);
        setImp.addToSet("Ovayo", 15_000);
        setImp.addToSet("Manesh", 20_000);

        setImp.removeFromSet("Lunga");

        assertEquals(setImp.findFromSet("Manesh"), true);
    }
}