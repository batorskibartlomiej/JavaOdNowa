package src.Iteratory;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NamesIterator {

    public static void main(String[] args) {
        Map<String, Person> people = new TreeMap<>();

        Person p1 = new Person("Jan", "Kowalski", 21);
        Person p2 = new Person("Jan", "Batorski", 22);
        Person p3 = new Person("Jan", "Nowacki", 56);
        people.put(p1.getLastName(), p1);
        people.put(p2.getLastName(), p2);
        people.put(p3.getLastName(), p3);


        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();

//        for (Person value : values) {
//            System.out.println(value);
//
//        }



        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
