package src.ArraysOperations;

import java.util.Objects;

public class Person {

    private String name;
    private String lastname;
    private String PESEL;


    public Person(String name, String lastname, String PESEL) {
        this.name = name;
        this.lastname = lastname;
        this.PESEL = PESEL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(PESEL, person.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, PESEL);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
