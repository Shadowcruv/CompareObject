package org.compareObject;

public class Glass {

   /*
    private Juice liquidholder;
    private Water liquidholder2;


    public void pour(Water w) {
        liquidholder2 = w;
    }

    public void returnPour(Juice liquidholder){
        this.liquidholder = liquidholder;
    }
     */

    private Object anyThingContainer;

    public void pour(Object j){
        anyThingContainer = j;
    }

    public static void main(String[] args){
        Glass g = new Glass();
        Juice fanta = new Juice();
        g.anyThingContainer = new Juice();
        Juice container = (Juice) g.anyThingContainer;
       // Juice container = g.liquidholder;



    }

}
