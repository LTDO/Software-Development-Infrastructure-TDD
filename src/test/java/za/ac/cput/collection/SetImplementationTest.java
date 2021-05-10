package za.ac.cput.collection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetImplementationTest {

    SetImplementation.Person person = new SetImplementation.Person();
    @Test
    void testAddToSet(){
        SetImplementation.Person person1 = new SetImplementation.Person("Lunga", "Tshila", 24);
        SetImplementation.Person person2 = new SetImplementation.Person("Ovayo", "Thethani", 14);
        SetImplementation.Person person3 = new SetImplementation.Person("Thembela", "Tshila", 29);
        SetImplementation.Person person4 = new SetImplementation.Person("Manesh", "Kwaza", 46);
        SetImplementation.Person person5 = new SetImplementation.Person("Grace", "Tshila", 67);

        Set<SetImplementation.Person> personSet = new HashSet<>();
        person.addToSet(personSet.add(person1));
        person.addToSet(personSet.add(person2));
        person.addToSet(personSet.add(person3));

        assertEquals(personSet.size(), 3);
    }

    @Test
    void testRemoveFromSet(){
        SetImplementation.Person person1 = new SetImplementation.Person("Lunga", "Tshila", 24);
        SetImplementation.Person person2 = new SetImplementation.Person("Ovayo", "Thethani", 14);
        SetImplementation.Person person3 = new SetImplementation.Person("Thembela", "Tshila", 29);
        SetImplementation.Person person4 = new SetImplementation.Person("Manesh", "Kwaza", 46);
        SetImplementation.Person person5 = new SetImplementation.Person("Grace", "Tshila", 67);

        Set<SetImplementation.Person> personSet = new HashSet<>();
        person.addToSet(personSet.add(person4));
        person.addToSet(personSet.add(person5));
        person.addToSet(personSet.add(person3));

        person.removeFromSet(personSet.remove(person3));
        assertEquals(person.findFromSet(personSet.contains(person3)), false);
    }

    @Test
    void testFindFromSet(){
        SetImplementation.Person person1 = new SetImplementation.Person("Lunga", "Tshila", 24);
        SetImplementation.Person person2 = new SetImplementation.Person("Ovayo", "Thethani", 14);
        SetImplementation.Person person3 = new SetImplementation.Person("Thembela", "Tshila", 29);
        SetImplementation.Person person4 = new SetImplementation.Person("Manesh", "Kwaza", 46);
        SetImplementation.Person person5 = new SetImplementation.Person("Grace", "Tshila", 67);

        Set<SetImplementation.Person> personSet = new HashSet<>();
        person.addToSet(personSet.add(person4));
        person.addToSet(personSet.add(person5));
        person.addToSet(personSet.add(person3));
        person.addToSet(personSet.add(person2));

        assertEquals(person.findFromSet(personSet.equals(person1)), false);
    }

}