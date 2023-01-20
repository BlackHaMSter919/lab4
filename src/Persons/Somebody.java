package Persons;

import Enumaretion.Adjective;
import Enumaretion.Adverb;

public class Somebody extends Person{
    private Adverb adverb1 ;
    private Adverb adverb2 ;

    public Somebody(String n, Adverb a, Adverb b) {
        super(n);
        this.adverb1=a;
        this.adverb2=b;


    }
    public void Snorted() {
        System.out.println("В этот миг " + name.toString() + " фыркнул");


    }
    public void Adverbs() {
        System.out.println(adverb1.toString() + " и "+ adverb2.toString());
    }
}
