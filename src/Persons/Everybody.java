package Persons;



import Enumaretion.Adverb;

public class Everybody extends Person{
    private Adverb adverb1 ;


    public Everybody(String n, Adverb a) {
        super(n);
        this.adverb1=a;



    }
    public void Looked() {
        System.out.println( name.toString() + " " + adverb1.toString() + " "+ "посмотрели друг на друга");


    }
}
