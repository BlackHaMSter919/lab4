package Persons;

import Interface.Grabbed;
import OtherObjects.Room;
import OtherObjects.Sword;

public class Homsa extends Person implements Grabbed {

    public class Eyes {
        private String namee;
        public Eyes(String n){
            this.namee=n;
        }
        @Override
        public String toString() {

            return namee;
        }
    }
    public Homsa(String n){
        super(n);
    }
    public void Rush(Room o){
        System.out.print(name +" "+"бросился");
        o.ChooseDirection();
    }
    public  void  Blink(){
        System.out.println(name + " заморгал");
    }
    public void DecideToOpen(){
        System.out.println(name+ " "+ "решился открыть "+ eyes.toString());
    }
    Eyes eyes= new Eyes("глаза");
    public void HadSeen(){
        System.out.println(name + " увидел, что");
    }
    public void Plunge(Sword o, Object f){
        System.out.println(name + " вонзил "+ o.toString1() + f.toString());
    }
    @Override
    public void Grab(Object other) {
            System.out.println(name+ " " + "схватился за "+ other.toString());


        }
    @Override
    public String toString() {

        return name;
    }

    }

