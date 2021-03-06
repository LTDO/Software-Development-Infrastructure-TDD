package za.ac.cput.lungatshila.collection;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListImplementationTest {

    @Test
    void testListAdd(){
        ListImplementation listImp = new ListImplementation();
        List<Integer> first_list= new ArrayList<>();

        first_list.add(listImp.addToList(2));
        first_list.add(listImp.addToList(7));
        first_list.add(listImp.addToList(8));
        first_list.add(listImp.addToList(15));

        assertEquals(first_list.isEmpty(), false);

    }

    @Test
    void testListRemove(){
        ListImplementation listImp = new ListImplementation();
        List<Integer> first_list= new ArrayList<>();

        first_list.add(listImp.addToList(2));
        first_list.add(listImp.addToList(7));
        first_list.add(listImp.addToList(8));
        first_list.add(listImp.addToList(15));

       listImp.removeFromList(3);
        assertEquals(15, 15);

    }

    @Test
    void testListFind(){
        ListImplementation listImp = new ListImplementation();
        List<Integer> first_list= new ArrayList<>();

        first_list.add(listImp.addToList(2));
        first_list.add(listImp.addToList(7));
        first_list.add(listImp.addToList(8));
        first_list.add(listImp.addToList(15));

        assertEquals(listImp.findInList(3), false);

    }
}