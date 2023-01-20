package OtherObjects;

import Enumaretion.Adjective;
import Interface.DescriptionOfTheLake;

public class Birches {
        private String name;
        private Adjective adjective1 ;
        private Adjective adjective2 ;

        public Birches(String n, Adjective a, Adjective b){
            this.adjective1=a;
            this.adjective2=b;
            this.name=n;
        }

        public void Describe(){
            System.out.print(adjective1.toString()+"-"+adjective2.toString()+" " + name+ ", отражавшиеся в ");
            lake.Described();


        }
    DescriptionOfTheLake lake = new DescriptionOfTheLake() {
        @Override
        public void Described() {
            System.out.print(adjective1.toString()+"-"+adjective2.toString()+" " + name.substring(0,name.toString().length()-1) +"e");
        }
    };
    }

