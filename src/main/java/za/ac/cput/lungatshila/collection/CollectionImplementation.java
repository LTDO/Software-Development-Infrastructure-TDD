/**
 * CollectionImplementation.java
 * This is a concrete class for constructing collection objects, add, remove, and find objects from a Collection
 * @author Lunga Tshila
 * Date: Tuesday, 10 May 2021
 */

package za.ac.cput.lungatshila.collection;

    import java.util.ArrayList;
    import java.util.Collection;

    public class CollectionImplementation {

        public CollectionImplementation(){}

        Collection<String> col = new ArrayList<String>();

        public String addToCollection(String name){
            col.add(name);
            return col.toString();
        }

        public String removeFromCollection(String name){
            col.remove(name);
            return col.toString();
        }

        public String findFromCollection(String name){
            if (col.contains(name)){
                for (String names: col) {
                    return names;
                }
            }
            return col.toString();
        }

        public int counter(){
            return col.size();
            }
    }

