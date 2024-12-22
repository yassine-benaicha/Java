package tn.esprit.gestionzoo.entities;

public class Aquatiques extends Animal{
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
}
