package src.ArraysOperations;

import java.util.Arrays;

public class PersonDatabase {

    private final int INITIAL_CAPACITY = 1;
    private Person[] people = new Person[INITIAL_CAPACITY];
    private int emptyPlace = 0;


    public void add(Person person) {
        if (person == null) {
            throw new NullPointerException("person cannot be null");
        }
        if (emptyPlace == people.length) {
                Arrays.copyOf(people, people.length * 2);
        }

        people[emptyPlace] = person;
        emptyPlace++;
        }


        Person get(int index){
        if(index>=emptyPlace|| index<0)
            throw new ArrayIndexOutOfBoundsException("Index has to be positive and lower than " + emptyPlace);
        return people[index];
        }


    }

