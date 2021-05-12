package za.ac.cput.collection;

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
