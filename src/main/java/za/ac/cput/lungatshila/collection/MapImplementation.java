/**
 * MapImplementation.java
 * This class holds implementation for constructing objects using a Map/HashMap, add, remove, and find objects from Map.
 * @author Lunga Tshila
 * Date: Tuesday, 10 May 2021
 */

package za.ac.cput.lungatshila.collection;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

    static Map<String, Integer> usernameMap = new HashMap<>();


    public static String storeName(String name, String lastname) {

        if(usernameMap.containsKey(name)) {
            usernameMap.put(name, usernameMap.get(name) + 1);
        }
        else {
            usernameMap.put(name, 1);
        }
        return usernameMap.get(name) + " " + lastname;
    }

    public static String clear(){
        usernameMap.clear();
        return "All users cleared successfully";
    }

    public static String clearName(String name){
        String msg =  " cleared from system";
        if(usernameMap.containsKey(name)){
            usernameMap.remove(name);
            return name + msg;
        }
        else { return name + " " +"is not in the system ";}
    }

    public static int counter(){
        return usernameMap.size();
    }

    public  static Map<String, Integer> getMap(){
        return usernameMap;
    }
}