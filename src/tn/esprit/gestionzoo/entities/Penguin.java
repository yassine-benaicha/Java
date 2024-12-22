package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.enums.Food;

public class Penguin extends Aquatiques{
    public float swimmingDepth;
    public Penguin(){

    }

    @Override
    public void swim() {
        System.out.println("This Penguin is swimming.");
    }

    public Penguin(String family,String name,int age,boolean isMammal,
                   String habitat,float swimmingDepth){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }
    public Penguin(String name,int age,String habitat){
        this.setName(name);
        this.setAge(age);
        this.habitat=habitat;
    }
    @Override

    public void eatMeat(Food meat) {
        System.out.println("The penguin " + getName() + " is eating " + meat);
    }

}
