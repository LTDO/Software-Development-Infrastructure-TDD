    package za.ac.cput.collection;

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

