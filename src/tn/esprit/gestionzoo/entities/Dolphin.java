package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.enums.Food;

public class Dolphin extends Aquatiques{
    public float swimmingSpeed;
    public Dolphin(){

    }
    public Dolphin(String family,String name,int age,boolean isMammal,
                   String habitat,float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
    @Override
    public void eatMeat(Food meat) {

    }
}
