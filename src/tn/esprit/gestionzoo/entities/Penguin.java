package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques{
    float swimmingDepth;
    public Penguin(){

    }
    public Penguin(String family,String name,int age,boolean isMammal,
                   String habitat,float swimmingDepth){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }
}
