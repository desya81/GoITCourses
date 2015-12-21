package com.home2;

/**
 * Created by denys on 21.12.15.
 */
public class Bouquet {

    private static String composition = "This Bouquet include next flower(s): ";

    public Bouquet() {
    }


    public void setBouquet(Flower flower){
        this.composition = this.composition + flower.getType() + " ";
    }

    public void getComposition(){
        System.out.println(composition);
    }


}
