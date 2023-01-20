package Persons;
import Exception.*;
abstract public class Person {
    protected String name;

    public Person(String n) {
        this.name = n;
    }
    public void NameVerification(String n) throws EmptyNameException {
        if (n == ""){
            throw new EmptyNameException("Отсутсвует имя");

    }
}
}
