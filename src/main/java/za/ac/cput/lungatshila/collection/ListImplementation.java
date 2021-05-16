/**
 * ListImplementation.java
 * This class holds implementation for constructing List objects, add, remove, and find objects from List.
 * @author Lunga Tshila
 * Date: Tuesday, 10 May 2021
 */

package za.ac.cput.lungatshila.collection;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {

    public List<Integer> list(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            myList.add(i);
        }
        return myList;
    }

    public int addToList(int num){
        List<Integer> myList = new ArrayList<>();
        myList.add(num);
        return num;
    }

    public int removeFromList(int num){
        try {
            List<Integer> myList = new ArrayList<>();
            for (int i = 0; i < myList.size(); i++) {
                myList.remove(num);
            }
        }catch (IndexOutOfBoundsException e){
            e.getMessage();
        }
        return num;
    }

    public boolean findInList(int val){
        List<Integer> myList = new ArrayList<>();

        if (myList.contains(val)){
            for (int i = 0; i < myList.size(); i++) {
                return true;
            }
        }
        return false;
    }
}