/**
 * SetImplementation.java
 * This class holds implementation for constructing objects using a Set, add, remove, and find objects from Set.
 * @author Lunga Tshila
 * Date: Tuesday, 12 May 2021
 */

package za.ac.cput.lungatshila.collection;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {


        Set<String> mySet = new HashSet<>();


        public String addToSet(String name, int salary){
            mySet.add(name);
            return name + " " + salary;
        }


        public void removeFromSet(String name){
            for (int i = 0; i<= mySet.size(); i++){
                if (mySet.contains(name)){
                    mySet.remove(name);
                }
            }
        }

        public boolean findFromSet(String person){
            for (int i = 0; i<= mySet.size(); i++){
                if (mySet.contains(person)){
                    return true;
                }
            }
            return false;
        }

        public int counter(){
            return mySet.size();
        }
}
