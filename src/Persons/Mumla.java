package Persons;

import Enumaretion.Adjective;
import Enumaretion.Adverb;
import Interface.DescriptionOfTheLake;
import OtherObjects.*;

public class Mumla extends Person {
    private Adverb adverb;
    private String pronouns;

    public Mumla(String n, String p, Adverb a) {
        super(n);
        this.adverb = a;
        this.pronouns = p;


    }

    public void Climbed(Room o, Object h) {
        System.out.println(name + " полезла в " + o.toString() + " через " + h.toString().substring(0, h.toString().length() - 1) + "у");
    }

    public void Turned() {
        System.out.println(name + " обернулась");
    }

    public void Watched(Birches o) {
        System.out.print(pronouns + "увидела ");
        o.Describe();
    }



    public void Laughed() {
        System.out.println(name + " " + adverb.toString() + " засмеялась");
    }
    @Override
    public String toString() {

        return name;
    }

}


