package za.ac.cput.collection;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {

    public static class Person {
        String name;
        String lastname;
        int age;

        public Person(){}
        public Person(String name, String lastname, int age){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }


        public boolean addToSet(boolean person){
            Set<Boolean> personSet = new HashSet<>();

            for (int i = 0; i<= personSet.size(); i++){
                if (personSet.contains(person)){
                    personSet.add(person);
                }else {
                    return false;
                }
            }
            return false;
        }


        public boolean removeFromSet(boolean person){
            Set<Boolean> personSet = new HashSet<>();
            for (int i = 0; i<= personSet.size(); i++){
                if (personSet.contains(person)){
                    personSet.remove(person);
                }
            }
            return false;
        }

        public boolean findFromSet(boolean person){
            Set<Boolean> personSet = new HashSet<>();
            for (int i = 0; i<= personSet.size(); i++){
                if (personSet.contains(person)){
                    return true;
                }
            }
            return false;
        }

        public String getName() {
            return name;
        }

        public String getLastname() {
            return lastname;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
