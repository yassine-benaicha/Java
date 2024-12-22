package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public abstract class Aquatiques extends Animal implements Carnivore<Food> {
    String habitat;
    public Aquatiques(){

    }
    public Aquatiques(String family,String name,int age,boolean isMammal,
                      String habitat){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"Habitat :"+habitat;
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj instanceof Aquatiques){
            return this.getName()==((Aquatiques)obj).getName() &&
                    this.getAge()== ((Aquatiques)obj).getAge()&&
                    this.habitat==((Aquatiques)obj).habitat;
        }
        return false;
    }
}
